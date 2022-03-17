package NellyTasks;
import java.util.Scanner;
import java.io.IOException;
/*
 * Alumnos:
 *	- Alvarez Manriquez Luis Fernando
 *	- Anguiano Jimenez Nayma Morelia
 * 
 * Problema 17:
 * En un supermercado, se realizan descuentos por las compras a partir de unas bolitas de colores. 
 * Si el cliente saca una bolita color azul(‘a’), tiene un descuento del 20%, si la bolita es roja( ́r ́), 
 * se aplica un descuento del 30% y si saca una bolita  color  blanca( ́b ́),  
 * no  se  aplica  ningún  descuento.  
 * Diseñe  un  algoritmo en elque  a  partir  del  
 * importe  total  de  la compra y el color de la bolitaobtenida, 
 * muestre lo que debe pagar dicho cliente. 
 */
public class Excercise17 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);	
		System.out.println("Ingresa total de compra:");
		double cost = in.nextDouble();
		System.out.println("Ingresa color de la bolita:");
		char ball = (char) System.in.read();
		System.in.read();
		double total = cost;
		switch(ball) {
			case 'a':
				System.out.println("Su descuento es del 20%");
				total = (double) cost * 0.2;
				break;
			case 'r':
				System.out.println("Su descuento es del 30%");
				total = (double) cost * 0.3;
				break;
			default:
				System.out.println("No aplica descuento");
				total = (int) cost * 1;
		}
		System.out.println("Su total es: $" + total);
		in.close();
	}
}
