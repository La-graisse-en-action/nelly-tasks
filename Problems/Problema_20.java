package solutions;

import java.util.Scanner;

public class Problema_20
{
	public static void main(String[] args)
	{
			Scanner read = new Scanner(System.in);
			
			char transporte;
			double km, monto=0;
			
			System.out.println("Ingrese el vehiculo usado: ");
			transporte = read.next().charAt(0);
			System.out.println("Ingrese los km recorridos: ");
			km = read.nextDouble();
			
			if(transporte == 'b')
			{
				monto = km * 1.5;
			}
			else if(transporte == 'm' || transporte == 'a')
			{
				monto = km * 7.5;
			}
			else if(transporte == 'c')
			{
				System.out.println("Ingrese las toneladas: ");
				int toneladas = read.nextInt();
				monto = km * 27+(toneladas*12);
			}
			System.out.println("Monto es: "+ monto);
		}
}
