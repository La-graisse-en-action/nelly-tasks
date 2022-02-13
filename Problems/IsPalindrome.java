package Problems;

import java.util.Scanner;
import Utils.Print;

public class IsPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Print print = new Print();
		
		print.pr("Ingresa valor para saber si es palindromo: ");
		int value = in.nextInt();
		
		if (value >= 100 && value < 1000) {
			int firstChar = value / 100;
			int lastChar = value % 10;
			
			if (firstChar == lastChar) {
				print.pr(value + " es palindromo");
			} else {
				print.pr(value + " no es palindromo");
			}
		} else {
			print.pr("El valor debe ser de 3 cifras");
		}
		
		in.close();
	}
}
