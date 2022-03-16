package Problems;

import java.util.Scanner;
import Utils.Print;

public class CircleOrTriangle {
	
	public static void main(String[] args) {
		Print print = new Print();
		Scanner in = new Scanner(System.in);
	
		print.pr("Ingresa tu figura (circulo, triangulo):");
		String figure = in.nextLine();
	
		String circle = "circulo";
		String triangle = "triangulo";
	
		if(figure.equals(circle)) {
			print.pr("Ingresa el radio:");
			int radius = in.nextInt();
			
			if (radius > 0) {
				double area = Math.PI * (radius * radius);
				print.pr("El area de tu circulo es: " + area);
			} else {
				print.pr("El vaor del radio debe ser mayor a 0");
			}
		} else if(figure.equals(triangle)) {
			print.pr("Ingresa la base");
			double b = in.nextInt();
			print.pr("Ingresa la altura");
			double a = in.nextInt();
			
			double area = (b * a) / 2;
			print.pr("El valor del area de tu triangulo es: " + area);
		} else {
			print.pr("Figura no valida");
		}
		
		in.close();
	}
}
