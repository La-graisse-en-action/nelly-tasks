package NellyTasks;

import java.util.Scanner;
import java.io.IOException;

/*
 * Alumnos:
 *	- Alvarez Manriquez Luis Fernando
 *	- Anguiano Jimenez Nayma Morelia
 * 
 * Problema 20:
 * Realizar un algoritmo que calcule y muestre el importe a pagar por un vehículo al circular por una autopista.
 * El vehículo puede ser  una  bicicleta( ́b ́),  una  moto( ́m ́),  un automóvil (‘a’) o  un  camión(‘c’).
 * El  importe  se  calculará  según  los siguientes datos:
 * 
 * a) Un importe  de $1.5  por km para la bicicleta. 
 * b) Las motos y los automóviles pagarán $7.5 por Km.
 * c) Los camiones pagarán $27 por Km. más $12 por tonelada de carga
 *
*/

public class Excercise20 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingresa vehiculo:");
		char vehicle = (char) System.in.read();
		System.in.read();
		
		System.out.println("Ingresar Kilometros:");
		int km = (int) in.nextInt();
		
		double total;
		double amount;
		if(vehicle == 'b') {
			amount = 1.5;
			total = (double) (km * amount);
			System.out.println("El total es: $" + total);
		} else if(vehicle == 'm' || vehicle == 'a') {
			amount = 7.5;
			total = (double) (km * amount);
			System.out.println("El total es: $" + total);
		} else if(vehicle == 'c') {
			System.out.println("Ingresa tolenadas de carga");
			int tons = in.nextInt();
			amount = 27;
			total = (double) (km * amount) + (12 * tons);
			System.out.println("El total es: $" + total);
		} else System.err.println("Vehiculo no valido");
		
		in.close();
	}
}
