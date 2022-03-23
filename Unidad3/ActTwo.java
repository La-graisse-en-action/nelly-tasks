package Unidad3;

import java.util.Scanner;

/*
 * Alumnos:
 * - Alvarez Manriquez Luis Fernnado
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
		if(m < n) {
			do {
				x += m;
				i++;
			} while(i < n);
		} else {
			do {
				x += n;
				i++;
			} while(i < m);
		}
		Print.println("La multiplicacion es: " + x);
		in.close();
	}
}
