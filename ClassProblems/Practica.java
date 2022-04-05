package ClassProblems;

import java.util.Scanner;

public class Practica {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.print("Ingresa una oracion: ");
		String cad = leer.nextLine();

		int i;
		char r;
		int contador = 0;
		for (i = 0; i < cad.length(); i++) {
			r = cad.charAt(i);
			if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') {
				contador++;
			}
		}
		System.out.println("tu palabra tiene "+contador+ " vocales");
		
	}
}

/*
 * 
 * 
 * int i; char x; int z=0; for(i = 0; i < cad.length(); i++) { x =cad.charAt(i);
 * if(x == 'a' || x == 'e' || x == 'o') { z=z+1; } } System.out.println(z);
 */

/*
 * String x= cad.substring(); System.out.println(cont);
 */

/*
 * int i = 0; boolean b = false; char x;
 * 
 * while (i < cad.length() && b == false) { x = cad.charAt(i);
 * 
 * if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') { b = true; }
 * i++; }
 * 
 * if (b == true) { System.out.println("tu palabra tiene vocales"); } else {
 * System.out.println("tu palabra no tiene vocales"); }
 */

/*
 */

// Scanner leer = new Scanner(System.in);
// System.out.print("Ingresar cadena: ");
// String cad;
