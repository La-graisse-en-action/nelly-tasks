package Unidad5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpendMachine {
	static int lapizPrice = 6, borradorPrice = 9, bookPrice = 27;
	static int lapizCant = 100, borradorCant = 70, bookCant = 35;
	static Scanner scan = new Scanner(System.in);
	static boolean process = true;
	static List<String> history = new ArrayList<String>();
	static int expendMachineTotal = 0;

	public static void main(String[] args) {
		do {
			ln("");
			ln("Productos disponibles: lapiz: " + lapizCant + " borrador: " + borradorCant + " cuaderno: " + bookCant);
			menu();
		} while (process);
		printHistory();
	}

	private static <T> void print(T txt) {
		System.out.print(txt);
	}

	private static <T> void ln(T txt) {
		System.out.println(txt);
	}

	public static void menu() {
		print("Producto a comprar: ");
		String product = scan.next();
		if (product.equals("lapiz") || product.equals("borrador") || product.equals("cuaderno")) {
			print("Cantidad a comprar: ");
			int cant = scan.nextInt();

			if (product.equals("lapiz")) {
				buyLapiz(cant);
			} else if (product.equals("borrador")) {
				buyBorrador(cant);
			} else if (product.equals("cuaderno")) {
				buyBook(cant);
			}
		} else {
			ln("Item no encontrado");
			process = false;
			scan.close();
		}
	}

	public static int[] getTotal(int cant, int price) {
		int total = price * cant;
		print("Debes pagar un total de $" + total + " Ingresa el monto con el que pagaras: ");
		int payment = scan.nextInt();
		int[] arr = new int[2];
		arr[0] = total;
		arr[1] = payment;
		expendMachineTotal += total;
		return arr;
	}

	private static boolean validCant(int productCant, int cant, String productAvailable) {
		if (cant > productCant) {
			ln("Disculpa, solo cuento con " + productCant + " " + productAvailable);
			return false;
		} else if (cant <= 0) {
			ln("Ingresa una cantidad valida!");
			return false;
		}
		return true;
	}

	private static void buyLapiz(int cant) {
		boolean hasCant = validCant(lapizCant, cant, "lapices");
		if (hasCant) {
			int[] paid = getTotal(cant, lapizPrice);
			if (paid[1] < paid[0]) {
				ln("Debes pagar la cantidad completa para recibir tu producto!");
				return;
			}
			lapizCant -= cant;
			int change = paid[1] - paid[0];
			ln("Tu cambio es de $" + change + " Puedes recoger tus productos");
			history.add("Compra Lapiz: " + "-" + cant);
		}
	}

	private static void buyBorrador(int cant) {
		boolean hasCant = validCant(borradorCant, cant, "borradores");
		if (hasCant) {
			int[] paid = getTotal(cant, borradorPrice);
			if (paid[1] < paid[0]) {
				ln("Debes pagar la cantidad completa para recibir tu producto!");
				return;
			}
			borradorCant -= cant;
			int change = paid[1] - paid[0];
			ln("Tu cambio es de $" + change + " Puedes recoger tus productos");
			history.add("Compra Borrador: " + "-" + cant);
		}
	}

	private static void buyBook(int cant) {
		boolean hasCant = validCant(bookCant, cant, "cuadernos");
		if (hasCant) {
			int[] paid = getTotal(cant, bookPrice);
			if (paid[1] < paid[0]) {
				ln("Debes pagar la cantidad completa para recibir tu producto!");
				return;
			}
			bookCant -= cant;
			int change = paid[1] - paid[0];
			ln("Tu cambio es de $" + change + " Puedes recoger tus productos");
			history.add("Compra Cuaderno: " + "-" + cant);
		}

	}

	public static void printHistory() {
		ln("");
		history.forEach((mov) -> ln(mov));
		ln("Total de ventas es: $" + expendMachineTotal);
	}

	/*
	 * private static void commonBuy(int cant, int productPrice, String productName,
	 * int productCant) { boolean hasCant = validCant(productCant, cant,
	 * productName); if (hasCant) { int[] paid = getTotal(cant, productPrice); if
	 * (paid[1] < paid[0]) {
	 * ln("Debes pagar la cantidad completa para recibir tu producto!"); return; }
	 * productCant -= cant; int change = paid[1] - paid[0]; ln("Tu cambio es de $" +
	 * change + " Puedes recoger tus productos"); history.add("Compra Cuaderno: " +
	 * "-" + cant); } }
	 */
}
