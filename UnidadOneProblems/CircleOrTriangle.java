package UnidadOneProblems;

import java.util.Scanner;
import Utils.Print;

public class CircleOrTriangle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Print.print("Ingresa tu figura (circulo, triangulo):");
		String figure = in.nextLine();

		String circle = "circulo";
		String triangle = "triangulo";

		if (figure.equals(circle)) {
			Print.print("Ingresa el radio:");
			int radius = in.nextInt();

			if (radius > 0) {
				double area = Math.PI * (radius * radius);
				Print.print("El area de tu circulo es: " + area);
			} else {
				Print.print("El vaor del radio debe ser mayor a 0");
			}
		} else if (figure.equals(triangle)) {
			Print.print("Ingresa la base");
			double b = in.nextInt();
			Print.print("Ingresa la altura");
			double a = in.nextInt();

			double area = (b * a) / 2;
			Print.print("El valor del area de tu triangulo es: " + area);
		} else {
			Print.print("Figura no valida");
		}

		in.close();
	}
}
