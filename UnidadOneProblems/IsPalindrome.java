package UnidadOneProblems;

import java.util.Scanner;
import Utils.Print;

public class IsPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Print.print("Ingresa valor para saber si es palindromo: ");
		int value = in.nextInt();

		if (value >= 100 && value < 1000) {
			int firstChar = value / 100;
			int lastChar = value % 10;

			if (firstChar == lastChar) {
				Print.print(value + " es palindromo");
			} else {
				Print.print(value + " no es palindromo");
			}
		} else {
			Print.print("El valor debe ser de 3 cifras");
		}

		in.close();
	}
}
