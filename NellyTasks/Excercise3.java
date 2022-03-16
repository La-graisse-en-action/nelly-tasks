package NellyTasks;

import java.util.Scanner;

/*
 * Alumnos:
 * - Alvarez Manriquez Luis Fernando
 * - Anguiano Jimenez Nayma Morelia
 * 
 * Ejercicio 3:
 * 	Un alumno puede ser acreedor a un descuento en su próxima inscripción de acuerdo al siguiente criterio: 
 * 	Se dará undescuento de 1.5% por cada año de edad que rebase la mayoría de edad sobre el monto de la inscripción. 
 * 	Por ejemplo, alguien  con  20  años  recibirá  un  descuento  de  3%  sobre  el  monto  de  la  inscripción,  
 * 	alguien  con  21  años recibirá  un descuento de 4.5%.
 * 	Este descuento aplicará solamente para la inscripción de los semestres 2 al 9. 
 * 	Hacer un algoritmo para mostrar lo que finalmente deberá pagar el alumno en su próxima inscripción.
 */

public class Excercise3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		print("INGRESA INSCRIPCION:");
		double cost = in.nextDouble();
		
		print("IGRESAR EDAD:");
		int age = in.nextInt();
		
		print("INGRESAR SEMESTRE:");
		int semester = in.nextInt();
		
		int total = (int) cost;
		if(age > 18 && semester >= 2 && semester <= 9) {
			int yearsAboveAge = (int) age % 18;
			double discount = (double) (1.5 * yearsAboveAge);
			total = (int) ((int) (cost * discount) / 100);
		} else print("No aplica el descuento");
		print("Total es: " + total);
		in.close();
	}
	
	public static <T> void print(T txt) {
		System.out.println(txt);
	}
}
