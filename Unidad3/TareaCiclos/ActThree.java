package Unidad3.TareaCiclos;
import java.util.Scanner;
/**
 * Alumnos:
 * @author - Alvarez Manriquez Luis Fernando
 * @author - Jesus Salvador Mora González
 * @author - Irma Estrella Rivera Durán
 * 
 * 3. Haz un algoritmo que calcule el resultado de dividir N/M, mediante restas sucesivas. 
 * Considere que N y M son valores ingresados por el usuario y siempre recibirán valores mínimos de cero. 
 * Mostrar cociente y resto de la división (prohibido utilizar los operadores /, * y mod). 
 * Considera la división por cero como un error enviando un mensaje indicándolo.
 */
public class ActThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Print.print("Ingresa el numerador: ");
		double n = in.nextDouble();
		Print.print("Ingresa denominador: ");
		double m = in.nextDouble();
		if(m != 0) {
			int i;
			for(i = 0; n >= m; i++) {
				n -= m;
				Print.ln((int) n);
			}
			Print.ln("El resultado es: " + ((int) i));
			Print.ln("El resto es: " + n);
		} else Print.error("No se puede dividir entre 0");
		in.close();
	}
	
}
