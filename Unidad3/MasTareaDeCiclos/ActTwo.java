package Unidad3.MasTareaDeCiclos;

import java.util.Scanner;

public class ActTwo {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String cad, cad2 = "";
		boolean b = false;
		while (b == false) {
			System.out.print("Ingrese cadena: ");
			cad = leer.next().trim();
			if (cad.equals("parar"))
				b = true;
			else
				cad2 += cad + " ";
		} // while

		System.out.println(cad2.toUpperCase());
		leer.close();
	}// static void

}
