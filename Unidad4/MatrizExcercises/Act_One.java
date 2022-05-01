package Unidad4.MatrizExcercises;

import java.util.Random;

import Utils.Matriz;
import Utils.Print;

/**
 * 
 * @author Alvarez Manriquez Luis Fernando.
 *
 *         Cree un programa que almacene valores enteros en una matriz de R x C.
 *         R es es un valor entero aleatorio entre 2 y 9, C es un valor entero
 *         aleatorio entre 2 y 6. Almacene números enteros aleatorios en cada
 *         celda de la matriz en el rango de 0 a 99, cuidando que en las filas
 *         pares de la matriz (0,2,4, etc) solo haya valores pares y que en las
 *         impares (1,3, etc) solo haya valores impares. Muestra la matriz fila
 *         por fila.
 */
public class Act_One {
	public static void main(String[] args) {
		Random random = new Random();

		int r = random.nextInt(8) + 2;
		int c = random.nextInt(5) + 2;

		int matriz[][] = new int[r][c];
		Print.ln("Matrix created with " + matriz.length + " rows and " + matriz[0].length + " columns");

		for (int ren = 0; ren < matriz.length; ren++) {
			for (int col = 0; col < matriz[0].length; col++) {
				int val = random.nextInt(100);
				if (ren % 2 == 0 && val % 2 == 0) {
					matriz[ren][col] = val;
				} else if (ren % 2 == 1 && val % 2 == 1) {
					matriz[ren][col] = val;
				}
			}
		}

		Matriz.printIntMtr(matriz);
	}
}
