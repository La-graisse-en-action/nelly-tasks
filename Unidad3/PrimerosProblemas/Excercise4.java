package Unidad3.PrimerosProblemas;
import java.util.Scanner;
/*
 * Alumnos:
 * - Alvarez Manriquez Luis Fernando
 * - Anguiano Jimenez Nayma Morelia
 * 
 * Problema 4:
 * Hacer un algoritmo que sea capaz de calcular y mostrar el área de un triángulo y un círculo, de acuerdo a los datos de entradaproporcionados  por  el  usuario.
 * El algoritmo debe iniciar preguntando al usuario con  qué  figura  trabajará  y  acontinuación preguntar los datos para realizar el cálculo y mostrar los resultados. 
 * Debe validarse y mostrar mensaje de error en el caso de que alguno de los datos de entrada sea negativo o cero. 
 * 
*/
public class Excercise4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		print("INGRESA FIGURA:");
		String fig = in.next();
		if(fig.equals("triangulo")) {
			print("INGRESA BASE:");
			double base = in.nextDouble();
			print("INGRESA ALTURA");
			double height = in.nextDouble();
			if (base != 0 && height != 0) {
				double area = (double) Math.pow(((base * height) / 2), 1);
				print("EL AREA DEL TRIANGULO ES: " + area);
			} else print("EL VALOR DE LA BASE O ALTURA DEBE SER MAYOR A 0");
		} else if(fig.equals("circulo")) {
			print("INGRESA VALOR DEL RADIO:");
			double r = (double) in.nextDouble();
			if(r != 0) {
				int area = (int) (Math.PI * (r * r));
				print("EL AREA DEL CIRCULO ES: " + area);
			} else print("EL RADIO DEBE SER MAYOR A 0");
		} else print("FIGURA NO VALIDA");
		
		in.close();
	}

	public static <T> void print(T txt) {
		System.out.println(txt);
	}
}
