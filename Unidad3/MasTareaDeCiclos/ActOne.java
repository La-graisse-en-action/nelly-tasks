package Unidad3.MasTareaDeCiclos;
import java.util.Scanner;

import Utils.Print;
/**
 * @author Alvarez Manriquez Luis Fernando
 * @author Irma Estrella Rivera Durán
 * 
 *         1. Ingrese una cadena e imprima la subcadena que resulta de la
 *         tercera vocal de la cadena, o muestre el mensaje "La cadena no tiene
 *         3 vocales". Ejemplos: Introducir cadena: murcielago La subcadena de
 *         la tercera vocal: elago Introducir cadena: corazón La subcadena de la
 *         tercera voz: on Introducir cadena:oso La cadena no tiene 3 vocales.
 */
public class ActOne {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Print.print("Ingrese una cadena de texto: ");
		String cad = in.next().toLowerCase();
		String z = "";
		char c = 0;
		int cont = 0, i;
		for (i = 0; i < cad.length() && cont < 3; i++) {
			z = cad.substring(i);
			c = z.charAt(0);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				cont++;
		}
		if (cont == 3)
			Print.ln(z);
		else
			Print.error("La palabra " + cad + " no tiene 3 vocales");
		in.close();
	}
}
