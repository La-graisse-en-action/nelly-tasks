package Unidad3.TareaCiclos;

import java.util.Scanner;

/**
 * Alumnos:
 * - Alvarez Manriquez Luis Fernando
 * -
 * -
 * 
 * 4. Solicita un valor entero. Si el valor contiene solo ceros y unos, muestre el mensaje "El valor parece binario", 
 * de lo contrario, muestre cuántos ceros y unos tenía y cuántos números diferentes de ceros y unos tenía. 
 * Ejemplo: Introducir valor: 1810581
 * Valor no aparece binario: tiene 4 cifras binarias y 3 de otro tipo
 */
public class ActFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Print.print("Ingrese un valor entero: ");
		int n = in.nextInt();
		int b = 0, o = 0;		
		int x = n;
		int ud = 0;
		while(x > 0) {
			ud = x % 10;
			// Print.ln("Ultimo digito " + ud);
			n = (int) ((n / 10) - ((n % 10) / 10));
			// Print.ln("Valor de n " + n);
			if(ud == 0 || ud == 1) b++;
			else o++;
			x /= (int) 10;
		}
		Print.ln("Numeros binarios: " + b);
		Print.ln("Otro tipo de numeros: " + o);
		
		in.close();
	}
}
