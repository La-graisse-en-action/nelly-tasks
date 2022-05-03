package Unidad4.MatrizExcercises;
import Utils.Matriz;
import Utils.Print;
/**
 * @author Alvarez Manriquez Luis Fernando. De todas las celdas de una matriz
 *         con valores de tipo entero, mostrar el valor mínimo y el valor máximo
 *         e informar en qué posición de la matriz se localizan. Adicionalmente
 *         calcular el promedio de los valores que se encuentran en la periferia
 *         de la matriz. Genere la matriz con las características de su
 *         preferencia.
 */
public class Act_Three {
	public static void main(String[] args) {
		int mtr[][] = { { 8, 1, 34 }, { 5, 67, 23 }, { 6, 234, 567 }, { 3, 76, 87 } };
		int min = 0, max = 0, ren = 0, col = 0, maxRenIndex = 0, maxColIndex = 0;
		int p = 0;
		Print.ln("Matriz creada de " + mtr.length + "x" + mtr[0].length);
		for (ren = 0; ren < mtr.length; ren++) {
			for (col = 0; col < mtr[0].length; col++) {
				int mtrValue = mtr[ren][col];
				if (ren == 0 && col == 0) {
					min = mtrValue;
					max = mtrValue;
				} else {
					if (min > mtrValue) {
						min = mtrValue;
						Print.print("Min: en posicion (" + ren + "," + col + ") = " + min + "\n");
					} else if (max < mtrValue) {
						max = mtrValue;
						maxRenIndex = ren;
						maxColIndex = col;
					}
				}
				if (ren == 0 || ren == mtr.length - 1 || col == 0 || col == mtr[0].length - 1)
					p += mtr[ren][col];
			}
		}
		Print.print("Max: en posicion (" + maxRenIndex + "," + maxColIndex + ") = " + max + "\n");
		Print.ln("Promedio: " + p);
		Matriz.printIntMtr(mtr);
	}
}
