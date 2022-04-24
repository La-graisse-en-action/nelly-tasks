package Tests;

import java.util.Scanner;

public class SinueProblem {
	public static void main(String[] args) {
		int sum = 0;
		int negSum = 0;
		Scanner sn = new Scanner(System.in);

		while (sum <= 100) {
			System.out.println("Ingresa un numero");
			int n = sn.nextInt();
			if (n < 0) {
				negSum -= n;
			} else {
				sum += n;
			}
		}

		System.out.println("Suma total: " + sum);
		if (negSum != 0)
			System.out.println("La suma de los negativos es: -" + negSum);
		sn.close();
	}
}
