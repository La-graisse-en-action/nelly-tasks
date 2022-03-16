package NellyTasks;

import java.util.Scanner;

/*
 * Alumno:
 * - Alvarez Manriquez Luis Fernando
 * - Anguiano Jimenez Nayma Morelia
 * 
 * Problema 11:
 * Escribe un algoritmo que lea un número de 3 cifras 
 * (validar que lo sea, en caso contrario mostrar mensaje de error y terminar el algoritmo) 
 * y determine si es o no palíndromo. 
 * Un número es palíndromo sies igual al revés  y como se dio originalmente. 
 * Por ejemplo: 565 es palíndromo, 449 no lo es.
 */

public class Excercise11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		print("INGRESA VALOR DE 3 CIFRAS:");
		int x = in.nextInt();
		
		int length = String.valueOf(x).length();
		if(length == 3) {
			int inv = 0, dig = x;
			do {
				int ud = (int) dig % 10;
				inv = (int) ((inv * 10) + ud);
				dig /= 10;
			} while(dig != 0);
			
			if(inv == x) print("ES PALINDROMO");
			else print("NO ES PALINDROMO");
		} else print("EL NUMERO DEBE SER DE 3 CIFRAS");
		
		in.close();
	}
	
	public static <T> void print(T txt) {
		System.out.println(txt);
	}
}
