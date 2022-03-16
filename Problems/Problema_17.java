package solutions;

import java.util.Scanner;

public class Problema_17 
{
	public static void main(String[] args)
	{
			Scanner read = new Scanner(System.in);
			
			char color_pel;
			double monto;
			
			System.out.println("Ingresa el color de la pelota: ");
			color_pel = read.next().charAt(0);
			
			System.out.println("Ingresa el monto a pagar: ");
			monto = read.nextInt();
			
			if(color_pel == 'a' || color_pel == 'A')
			{
				monto = monto * 0.80;
			}
			else if(color_pel == 'r' || color_pel == 'R')
			{
				monto = monto * 0.70;
			}
			
			System.out.println("El monto a pagar es: "+monto);
		}
}
