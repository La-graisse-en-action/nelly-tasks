package Unidad3.TareaCiclos;

import java.util.Scanner;

/*
 * Alumnos:
 * - Alvarez Manriquez Luis Fernando
 * -
 * -
 * 
 * 3. Haz un algoritmo que calcule el resultado de dividir N/M, mediante restas sucesivas. 
 * Considere que N y M son valores ingresados por el usuario y siempre recibirán valores mínimos de cero. 
 * Mostrar cociente y resto de la división (prohibido utilizar los operadores /, * y mod). 
 * Considera la división por cero como un error enviando un mensaje indicándolo.
 */

public class ActThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Print.print("Ingresa el numerador: ");
		int n = in.nextInt();
		
		Print.print("Ingresa denominador: ");
		int m = in.nextInt();
		
		if(m != 0) {
			
		} else {
			Print.println("No se puede dividir entre 0");
		}
		
		in.close();
	}
	
}
