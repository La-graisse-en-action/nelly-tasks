package Unidad3.MasTareaDeCiclos;

import java.util.Scanner;

import Unidad3.TareaCiclos.Print;

public class ActThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cad, z = "";

		Print.print("Ingresar cadena: ");
		cad = in.nextLine();

		for (int i = 0; i < 7; i++) {
			int x = (int) (Math.random() * cad.length());
			z += cad.charAt(x) + " ";
		}
		Print.print("Caracteres: " + z);

		in.close();
	}
}
