package ClassProblems;

import Unidad3.TareaCiclos.Print;
import java.util.Scanner;

public class Tests {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Print.ln("Ingresa un numero: ");
		int n = sc.nextInt();
		
		int x = 0;
		for(int i = 1; i <= n; i++) {
			x += i;
		}
		Print.ln("Resultado: " + x);
		
		sc.close();
	}
}
