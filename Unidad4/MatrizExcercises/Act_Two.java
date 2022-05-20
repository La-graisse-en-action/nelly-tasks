package Unidad4.MatrizExcercises;

import java.util.Random;
import Utils.Matriz;
import Utils.Print;

/**
 * 
 * @author Alvarez Manriquez Luis Fernando. Crear e inicializar al mism otiempo
 *         de la creación, un arreglo unidimensional de caracteres, con los
 *         caracteres de su preferencia, de la longitud que usted decida. Crear
 *         una matriz de caracteres de R x C. Tanto R como C son valores
 *         aleatorios en el rango de 2 a 10. Tomar cada carácter del arreglo
 *         unidimensional para llenar las celdas de la matriz, de columna en
 *         columna, de abajo hacia arriba. Mostrar arreglo unidimensional y
 *         matriz. Si el unidimensional tuviera los siguientes caracteres:
 */
public class Act_Two {
	public static void main(String[] args) {
		Random random = new Random();
		char arr[] = { 'E', 'S', 'T', 'R', 'E', 'L', 'L', 'A' };
		int index = 0;
		int rows = random.nextInt(9) + 2;
		int cols = random.nextInt(9) + 2;
		char mtr[][] = new char[rows][cols];

		Print.ln("Array unidimensional:");
		for (int i = 0; i < arr.length; i++)
			Print.print("'" + arr[i] + "', ");
		Print.ln("\n");
		Print.ln("Matrix created with " + mtr.length + " rows and " + mtr[0].length + " columns");

		for (int col = 0; col < mtr[0].length; col++) {
			for (int ren = mtr.length - 1; ren >= 0; ren--) {
				mtr[ren][col] = arr[index];
				index++;
				if (index == arr.length)
					index = 0;
			}
		}
		Matriz.printCharMtr(mtr);
	}
}
