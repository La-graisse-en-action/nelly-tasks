package Unidad3.MasTareaDeCiclos;

import java.util.Scanner;
import Unidad3.TareaCiclos.Print;

/**
 * @author Alvarez Manriquez Luis Fernando
 * @author Irma Estrella Rivera Durán
 * 
 *         4. Introduce un par de cadenas repetidamente. Del par ingresado,
 *         indique cuál de los dos es más largo. El programa termina cuando
 *         ambas cadenas tienen la misma longitud. Ejemplo: Ingrese una cadena:
 *         Morelia Ingrese otra cadena: cerdo La cadena más larga es Morelia
 *         Ingrese una cadena: sí Ingrese otra cadena: claro La cadena más larga
 *         es clara Ingrese una cadena: sí Ingrese otra cadena: no FIN
 */
public class ActFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Print.print("Ingrese una cadena: ");
		String cad = in.next().toLowerCase().trim();
		Print.print("Ingrese otra cadena: ");
		String cad2 = in.next().toLowerCase().trim();
		while (cad2.length() != cad.length()) {
			String val;
			if (cad.length() > cad2.length())
				val = cad;
			else
				val = cad2;
			Print.ln("La cadena mas larga es: " + val + "\n");
			Print.print("Ingrese una cadena: ");
			cad = in.next().toLowerCase();
			Print.print("Ingrese otra cadena: ");
			cad2 = in.next().toLowerCase();
		}
		Print.error("FIN");
		in.close();
	}
}
