package solutions;

import java.util.Scanner;

public class Problema_11
{
	public static void main(String[] args)
	{
			Scanner read = new Scanner(System.in);
			
			System.out.println("Ingresa un valor:");
			int x = read.nextInt();
			
			if(x < 100 || x > 999)
			{
				System.out.println("El numero no es de 3 digitos");
			}
			else
			{
				if(x%10 == x/100)
				{
					System.out.println("Es palindromo");
				}
				else
				{
					System.out.println("No es palindromo");
				}
			}
		}
}
