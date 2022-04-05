package ClassProblems;
import java.util.Scanner;
public class Mamadas {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingresa Cadena: ");
		String cadena = leer.next();
		boolean ondulada = true;
		if (2 <= cadena.length()) {
			char caracter1 = cadena.charAt(0);
			char caracter2 = cadena.charAt(1);
			int suma = Integer.parseInt(cadena.substring(0, 2));
			int i = 0;
			while (i < cadena.length()) {
				if (i % 2 == 0) {
					if (cadena.charAt(i) != caracter1) {
						ondulada = false;
					}
				} else {
					if (cadena.charAt(i) != caracter2) {
						ondulada = false;
					}
				}
				i++;
			}
			if (ondulada==true) {
				String aux2 = "";
				if (cadena.length() % 2 == 0) {
					suma *= (cadena.length() / 2);
				} else {
					aux2 += caracter1;
					suma *= (cadena.length() / 2);
					suma += Integer.parseInt(aux2);
				}
				System.out.println("Cadena es ondulada:" + suma);
			} else {
				System.out.println("Cadena no es ondulada");
			}
		} else {
			System.out.println("no es ondulada");
		}
	}
}
