package solutions;

import java.util.Scanner;

public class Problema_7 
{
	public static void main(String[] args)
	{
			Scanner read = new Scanner(System.in);
			
			int x,y;
			System.out.println("Primer valor:");
			x = read.nextInt();
			System.out.println("Segundo valor:");
			y = read.nextInt();
			
			if(x==y) 
			{
				System.out.println("SON IGUALES");
			}
			else if (x>y)
			{
				System.out.println("El mayor es: "+x);
			}
			else
			{
				System.out.println("El mayor es: "+y);
			}
		}
}
