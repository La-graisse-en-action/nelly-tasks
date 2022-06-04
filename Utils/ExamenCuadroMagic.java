package Utils;

/* Programa desarrollado por Saúl Romero C. */
import java.util.Scanner;

public class ExamenCuadroMagic {

	static int mati[][] = new int[5][5];

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		ExamenCuadroMagic fun1 = new ExamenCuadroMagic();
		int num, nmat, op, opp;
		boolean band = true;
		do {
			System.out.println("Bienvenido(a) al programa");
			System.out.println("Este es el Menú 1");
			System.out.println("Opción 1: Empezar juego");
			opp = consola.nextInt();
			if (opp == 1) {

				do {
					System.out.println("Ingresa un número positivo y que sea impar");
					num = consola.nextInt();

					if (num > 0 && num % 2 != 0) {

						for (int x = 0; x < mati.length; x++) {
							for (int y = 0; y < mati[x].length; y++) {
								System.out.print(mati[x][y] + "  ");
							}
							System.out.println("");
						}

						do {
							System.out.println("Bienvenido(a) al menú 2\n");
							System.out.println("Eligue cualquiera de las siguientes 3 opciones");
							System.out.println(
									"Opción 1: Escribir otro número \nOpción 2: Checar resultados \nOpción 3: Terminar juego y salir");
							op = consola.nextInt();
							switch (op) {
							case 1:
								System.out.println(
										"Ingrese un número y eliga la ubicación en el cuadro mágico donde desea almacenar el número");
								System.out.println("Ingrese la posición y");
								int y = consola.nextInt();
								if (y >= 0 && y < 5) {
									System.out.println("Ingrese la posición x");
									int x = consola.nextInt();
									if (x >= 0 && x < 5) {
										System.out.println("Ingrese el número");
										mati[x][y] = consola.nextInt();
										for (x = 0; x < mati.length; x++) {
											for (y = 0; y < mati[x].length; y++) {
												System.out.print(mati[x][y] + "  ");
											}
											System.out.println("");
										}
									} else {
										System.out.println("Esta posición no existe, escoga entre 0 y 4\n");
									}
								} else {
									System.out.println("Esta posición no existe, escoga entre 0 y 4\n");
								}
								break;
							case 2:
								fun1.resultados();

								break;
							case 3:
								System.out.println("Gracias por usar el programa");
								band = false;
								break;
							default:
								System.out.println(
										"La opción ingresada no existe \nPor favor ingrese una opción valida.\n");
							} // Switch
						} while (band == true); // Do while3
					} else {
						System.out.println("El número ingresado no es valido\n");

					} // If número impar
				} while (band == true); // Do while2
			} else {
				System.out.println("La opción ingresada no existe porfavor seleccione la que indica el programa...\n");
			} // If opcion1
		} while (band == true); // Do while principal

	} // main

	public void resultados() {
		int fil1 = 0, fil2 = 0, fil3 = 0, fil4 = 0, fil5 = 0;
		int col1 = 0, col2 = 0, col3 = 0, col4 = 0, col5 = 0;

		for (int col = 0; col < mati.length; col++) {
			for (int ren = 0; ren < mati.length; ren++) {
				switch (col) {
				case 0:
					fil1 += mati[ren][col];
					break;
				case 1:
					fil2 += mati[ren][col];
				case 2:
					fil3 += mati[ren][col];
				case 3:
					fil4 += mati[ren][col];
				case 4:
					fil5 += mati[ren][col];
				default:
					return;
				}
			}
		}
		System.out.println("Suma fil1 " + fil1);
		System.out.println("Suma fil2 " + fil2);
		System.out.println("Suma fil3 " + fil3);
		System.out.println("Suma fil4 " + fil4);
		System.out.println("Suma fil5 " + fil5);

		for (int ren = 0; ren < mati.length; ren++) {
			for (int col = 0; col < mati.length; col++) {
				switch (ren) {
				case 0:
					col1 += mati[ren][col];
					break;
				case 1:
					col2 += mati[ren][col];
				case 2:
					col3 += mati[ren][col];
				case 3:
					col4 += mati[ren][col];
				case 4:
					col5 += mati[ren][col];
				default:
					return;
				}
			}
		}
		System.out.println("Suma col1 " + col1);
		System.out.println("Suma col2 " + col2);
		System.out.println("Suma col3 " + col3);
		System.out.println("Suma col4 " + col4);
		System.out.println("Suma col5 " + col5);
	}
}// public classs
