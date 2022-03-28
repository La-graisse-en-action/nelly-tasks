package ClassProblems;

import java.util.Scanner;

import Unidad3.TareaCiclos.Print;

public class CapitalizedText {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String r, aux = "";
		
		Print.ln("Ingresar una cadena:");
		r = in.nextLine().toLowerCase();
		
		aux += r.charAt(0);
		aux += aux.toUpperCase();
		
		
		
		in.close();
	}
}
