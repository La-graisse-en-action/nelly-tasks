package ClassProblems;

import java.util.Scanner;

import Unidad3.TareaCiclos.Print;

public class KnowOP {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Print.ln("Ingresar operacion:");
		String op = in.nextLine();

		boolean b = false;
		char z;
		for (int i = 0; i < op.length(); i++) {
			if (op.charAt(i) != '+' && op.charAt(i) != '-' && op.charAt(i) != '/' && op.charAt(i) != '*' && op.charAt(i) != '%') {
				z = op.charAt(i);
			} else {
				b = true;
			}
			
		}
	}
}
