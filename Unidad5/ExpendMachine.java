package Unidad5;

import java.util.Scanner;

public class ExpendMachine {
	static int lapizPrice = 6, borradorPrice = 9, bookPrice = 27;
	static int lapizCant = 100, borradorCant = 70, bookCant = 35;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String product;
		do {
			ln("Productos disponibles: lapiz: " + lapizCant + " borrador: " + borradorCant + " cuadernos: " + bookCant);
			print("Producto a comprar: ");
			product = scan.nextLine();
			menu(product);
		} while (product.equals("lapiz") || product.equals("borrador") || product.equals("libreta"));
	}

	private static void menu(String product) {
		print("Cantidad a comprar: ");
		int cant = scan.nextInt();

		if (product.equals("lapiz")) {
			buyLapiz(cant);
		} else if (product.equals("borrador")) {
			buyBorrador(cant);
		} else if (product.equals("libreta")) {
			buyBook(cant);
		} else {
			ln("Item no encontrado");
			scan.close();
			return;
		}
		return;
	}

	private static int[] getTotal(int cant, int price) {
		int total = price * cant;
		print("Debes pagar un total de $" + total + " Ingresa el monto con el que pagarás: ");
		int payment = scan.nextInt();

		int[] arr = new int[2];
		arr[0] = total;
		arr[1] = payment;
		return arr;
	}

	private static void buyLapiz(int cant) {
		lapizCant -= cant;
		int[] paid = getTotal(cant, lapizPrice);
		int change = paid[1] - paid[0];
		ln("Tu cambio es de $" + change + " Puedes recoger tus productos");
	}

	private static void buyBorrador(int cant) {
		borradorCant -= cant;
		int[] paid = getTotal(cant, borradorPrice);
		int change = paid[1] - paid[0];
		ln("Tu cambio es de $" + change + " Puedes recoger tus productos");
	}

	private static void buyBook(int cant) {
		bookCant -= cant;
		int[] paid = getTotal(cant, bookPrice);
		int change = paid[1] - paid[0];
		ln("Tu cambio es de $" + change + " Puedes recoger tus productos");
	}

	private static <T> void print(T txt) {
		System.out.print(txt);
	}

	private static <T> void ln(T txt) {
		System.out.println(txt);
	}
}
