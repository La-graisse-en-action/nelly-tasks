package Unidad3.TareaCiclos;

import java.util.Scanner;

/*
 * Alumnos:
 * - Alvarez Manriquez Luis Fernando
 * - 
 * - 
 * 
 * 1.
 * 
 */

public class ActOne {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		println("Ingresa cantidad de numeros a ingresar:");
		int c = in.nextInt();
		int cont = 0;
		int may = 0, mn = 0, acc = 0;
		while(cont < c) {					
			print("Ingresa un numero entero: ");
			int n = in.nextInt();
			
			if(n != 0) {
				acc += n;
				if(cont == 0) {
					may = n;
					mn = n;
				} else if(may <= n) {
					may = n;
				} else if(mn >= n) {
					mn = n;
				}
				cont++;
			}
		}
		println("El mayor es: " + may);
		println("El menor es: " + mn);
		println("El promedio es: " + ((int) acc / c));
		in.close();
	}
	
	public static <T> void println(T txt) {
		System.out.println(txt);
	}
	
	public static <T> void print(T txt) {
		System.out.print(txt);
	}
}
