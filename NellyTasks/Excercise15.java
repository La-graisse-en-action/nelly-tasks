package NellyTasks;
import java.util.Scanner;
/*
 * Alumnos:
 *	- Alvarez Manriquez Luis Fernando
 *	- Anguiano Jimenez Nayma Morelia
 * 
 * Problema 15:
 * Hacer un algoritmo para escribir un programa que devuelva el nombre del día de la semana siguiendo un orden de 
 * correspondencia (1, 2, 3...7) para (domingo, lunes, martes, miércoles... sábado) respectivamente.  
 * El dato de entrada debe ser un valor entero y si sale del rango de 1 a 7 mostrar un mensaje de error.
 * 
 */
public class Excercise15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		System.out.println("Ingresa dia de la semana en numero:");
		int nday = (int) in.nextInt();
		if(!(nday < 1) && !(nday > 7)) {
			String day = "";
			switch(nday) {
				case 1: day = "Domingo";
					break;
				case 2: day = "Lunes";
					break;
				case 3: day = "Martes";
					break;
				case 4: day = "Miercoles";
					break;
				case 5: day = "Jueves";
					break;
				case 6: day = "Viernes";
					break;
				case 7: day = "Sabado";
					break;
			}
			System.out.println("Dia, "+ day);
		} else System.err.println("Dia de la semana no valido");
		
		in.close();
	}
}
