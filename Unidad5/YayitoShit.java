package Unidad5;

import java.util.Scanner;

public class YayitoShit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar longitud del vector");
		int size = scan.nextInt();
		String[] numeros = new String[size];
		boolean flag = false;
		int index = 0;

		while (!flag) {
			System.out.println("Ingresa cadenas");
			String cad = scan.next();
			numeros[index] = cad;
			index++;
			if (index == numeros.length) {
				flag = true;
			}
		}
		char mat[][] = separar(numeros);
		mostrar(mat);
		scan.close();
	}

	public static char[][] separar(String vec[]) {
		String vecVal = vec[0];
		char[][] mtr = new char[vecVal.length()][vec.length];
		int vecIndex = 0, charIndex = 0;

		for (int col = 0; col < mtr[0].length; col++) {
			for (int ren = 0; ren < mtr.length; ren++) {
				char carac = vec[vecIndex].charAt(charIndex);
				mtr[ren][col] = carac;
				charIndex++;
				if (charIndex == vec[0].length()) {
					charIndex = 0;
				}
			}
			vecIndex++;
		}
		return mtr;
	}

	public static void mostrar(char mtr[][]) {
		for (int ren = 0; ren < mtr.length; ren++) {
			for (int col = 0; col < mtr[0].length; col++) {
				System.out.print(mtr[ren][col] + "\t");
			}
			System.out.println("");
		}
	}
}
