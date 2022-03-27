package ReicoProblems;

import java.util.Scanner;

public class Problema_3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int edad, semestre;
		double colegiatura;

		System.out.println("Ingresa tu edad:");
		edad = read.nextInt();
		System.out.println("Ingresa tu semestre:");
		semestre = read.nextInt();
		System.out.println("Ingresa tu monto a pagar:");
		colegiatura = read.nextDouble();

		if (edad > 18 && semestre >= 2 && semestre <= 9) {
			colegiatura = colegiatura * (1 - (((edad - 18) * 1.5) * 0.1));
		}

		System.out.println("Total a pagar es: " + colegiatura);
	}
}
