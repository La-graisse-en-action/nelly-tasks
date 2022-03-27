package ReicoProblems;

import java.util.Scanner;

public class Problema_4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		char figura;
		double area = 0;

		System.out.println("Ingresa la figura: ");
		figura = read.next().charAt(0);

		if (figura == 't' || figura == 'T') {
			int base, altura;
			System.out.println("Ingresa la base: ");
			base = read.nextInt();
			System.out.println("Ingresa la altura: ");
			altura = read.nextInt();

			if (base <= 0 || altura <= 0) {
				System.out.println("ERROR: datos ingresados de manera incorrecta");
			} else {
				area = (base * altura) / 2;
				System.out.println("Area es: " + area);
			}

		} else if (figura == 'c' || figura == 'C') {
			int radio;
			System.out.println("Ingresa el radio: ");
			radio = read.nextInt();

			if (radio <= 0) {
				System.out.println("ERROR: datos ingresados de manera incorrecta");
			} else {
				area = Math.PI * Math.pow(radio, 2);
				System.out.println("Area es: " + area);
			}
		} else {
			System.out.println("ERROR: datos ingresados de manera incorrecta");
		}

	}
}
