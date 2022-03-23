package Unidad3.TareaCiclos;

import java.util.Scanner;

/*
 * Alumnos:
 * - Alvarez Manriquez Luis Fernnado
 * -
 * -
 * 
 * 2. Haz un algoritmo que calcule y muestre el resultado de multiplicar NX M, mediante sumas sucesivas, 
 * con el menor número de sumas posibles. Considere que N y M son números enteros ingresados 
 * por el usuario (suponga que el usuario ingresará valores mayores o iguales a cero). 
 * Prohibido usar el operador *
 */

public class ActTwo {
	public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		Print.print("Ingrese un valor:");
		int n = in.nextInt();
		
		Print.print("Ingrese otro valor:");
		int m = in.nextInt();
		
		int i = 0;
		int x = 0;
		
		// this could be refactored :)
		if(m > n) {
			do {
				x += m;
				Print.ln(x);
				i++;
			} while(i < n);
		} else {
			do {
				x += n;
				Print.ln(x);
				i++;
			} while(i < m);
		}
		Print.ln("La multiplicacion es: " + x);
		in.close();
	}
}
