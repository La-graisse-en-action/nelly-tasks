package Unidad3.PrimerosProblemas;

import java.util.Scanner;

/*
 * Alumnos:
 * - Alvarez Manriquez Luis Fernando
 * - Anguiano Jimenez Nayma Morelia
 * 
 * Problema 7:
 * Escribe un algoritmo que pida dos números y que muestre cuál es el menor y 
 * cuál el mayor o bien que escriba que son iguales.
 */

public class Excercise7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		print("INGRESA UN NÚMERO ENTERO:");
		int x = in.nextInt();
		
		print("INGRESA OTR VALOR ENTERO:");
		int y = in.nextInt();
		
		if(x > y) print(x + " ES EL MAYOR");
		else if(x < y) print(y + " ES EL MAYOR");
		else print("AMBOS VALORES SON IGUALES");
		
		in.close();
	}
	
	public static <T> void print(T txt) {
		System.out.println(txt);
	} 
}
