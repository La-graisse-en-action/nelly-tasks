package Unidad3.TareaCiclos;

import java.util.Scanner;

/** 
 * Alumnos:
 * @author mrluisfer
 *
 * 5. Solicite un valor (suponga que el valor solo tendrá ceros y unos). 
 * A partir de la última cifra, toma cada una y multiplícala por una potencia de 2 
 * (primero x2^0, luego x2^1, luego x2^2, etc.) 
 * Haz la suma de las potencias calculadas y muéstrala. 
 * Ejemplo: Introduzca valor: 101000 La suma de las potencias de 2 es: 4040 da como resultado 
 * 0x2^0 + 0x2^1 + 0x2^2 + 1x2^3 + 0x2^4 + 1x2^5, 
 * solo muestra la suma de potencias
 */
public class ActFive {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Print.print("Ingresa una cantidad en Binario: ");
		int n = in.nextInt();
		int ud = 0;
		int z = 0;
		for(int x = n, i =  0; x > 0; x /= (int) 10, i++) {
			ud = x % 10;
			n = (int) (n / 10) - ((n % 10) / 10);
			z = (int) (ud * (int) Math.pow(2, i));

			Print.ln(x);
			Print.print(ud + "x2^" + i + ": ");
			Print.ln(z += z);
		}
		
		in.close();
	}
}
