package Unidad4.MatrizExcercises;

import Utils.Print;

/**
 * @author Alvarez Manriquez Luis Fernando.
 *         <p>
 *         De todas las celdas de un arreglo con valores de tipo entero, mostrar
 *         el valor mínimo y el valor máximo e informar en qué posición del
 *         arreglo se encuentran. Adicionalmente, calcule el promedio de los
 *         valores que se encuentran en la periferia de la matriz. Genere la
 *         matriz con las características de su preferencia.
 */
public class Act_Three {
	public static void main(String[] args) {
		int intArr[] = { 8, 1, 34, 5, 67, 23, 234, 6, 567, 23, 9 };

		int min = 0, max = 0, minIndex = 0, maxIndex = 0;
		for (int i = 0; i < intArr.length; i++) {
			if (i == 0) {
				min = intArr[i];
				max = intArr[i];
			} else {
				if (min > intArr[i]) {
					min = intArr[i];
					minIndex = i;
				} else if (max < intArr[i]) {
					max = intArr[i];
					maxIndex = i;
				}
			}
		}
		
		Print.ln("Menor es " + min);
		Print.ln("Mayor es " + max);
		Print.ln("Menor en posicion " + minIndex);
		Print.ln("Mayor en posicion " + maxIndex);
	}
}
