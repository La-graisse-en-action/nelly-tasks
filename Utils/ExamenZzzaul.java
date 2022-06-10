package Utils;

import java.util.Scanner;

public class ExamenZzzaul {
	static boolean process = true;
	static char[][] mtr = new char[4][4];

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		do {
			System.out.println("");
			System.out.println("1. Ingresar datos");
			System.out.println("2. Imprimir Matriz");
			System.out.println("3. Ordernar Fila");
			System.out.println("4. Encontrar caracter");
			System.out.println("5. No. de a's");
			System.out.println("6. Salir");
			System.out.print("Ingresa una opcion del menu: ");
			int opcion = sn.nextInt();
			menu(opcion);

		} while (process);
	}

	public static void menu(int opt) {
		switch (opt) {
		case 1:
			ingresarDatos();
			break;
		case 2:
			mostrar();
			break;
		case 3:
			ordenar();
			break;
		case 6:
			exit();
			break;
		default:
			System.out.println("Opcion no valida");
			return;
		}
	}

	public static void ingresarDatos() {
		Scanner sn = new Scanner(System.in);
		int index = 0;

		System.out.println("Ingrese caracteres:");
		String texto = sn.nextLine();

		for (int ren = 0; ren < mtr.length; ren++) {
			for (int col = 0; col < mtr[0].length; col++) {
				mtr[ren][col] = texto.charAt(index);
				index++;
			}
			index = 0;
		}

	}
	
	public static void ordenar() {
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Ingrese fila a ordenar:");
		int row = sn.nextInt();
		
		
	}

	public static void mostrar() {
		for (int ren = 0; ren < mtr.length; ren++) {
			for (int col = 0; col < mtr[0].length; col++) {
				System.out.print(mtr[ren][col] + "\t");
			}
			System.out.println("");
		}
	}

	public static void exit() {
		System.out.println("\n Bye!");
		process = false;
	}
}
