package solutions;

import java.util.Scanner;

public class Problema_15 
{
	public static void main(String[] args)
	{
			Scanner read = new Scanner(System.in);
			
			int dia;
			System.out.println("Ingresa un numero para el dia de la semana:");
			dia = read.nextInt();
			
			switch(dia)
			{
				case 1:
					
					System.out.println("Domingo");
					break;
				
				case 2:
					
					System.out.println("Lunes");
					break;
				
				case 3:
					
					System.out.println("Martes");
					break;
				
				case 4:
					
					System.out.println("Miercoles");
					break;
				
				case 5:
					
					System.out.println("Jueves");
					break;
					
				case 6:
					
					System.out.println("Viernes");
					break;
					
				case 7:
					
					System.out.println("Domingo");
					break;	
				
				default:
					System.out.println("Valor fuera de rango");
			}
			
		}
}
