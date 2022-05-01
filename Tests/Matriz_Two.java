package Tests;

import java.util.Random;
import java.util.Scanner;

import Utils.Print;

public class Matriz_Two {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sn = new Scanner(System.in);
		String cad = "";

		int ren, col, index = 0;
		/*
		 * int num = 0; num = r.nextInt(6) + 2;
		 */
		char mat[][] = new char[r.nextInt(2, 8)][r.nextInt(2, 8)];
		Print.ln("Se creo una cadena de " + mat.length + " por " + mat[0].length);
		Print.ln("Ingresar cadena:");
		cad = sn.next();

		for (ren = 0; ren < mat.length; ren++) {
			for (col = 0; col < mat[0].length; col++) {
				mat[ren][col] = cad.charAt(index);
				index++;
				if (index == cad.length())
					index = 0;
				Print.print(mat[ren][col] + "\t");
			}
			Print.ln("");
		}

	}
}
