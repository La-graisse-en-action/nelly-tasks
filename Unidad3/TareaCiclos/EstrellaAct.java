package Unidad3.TareaCiclos;
import java.util.Scanner;

import Utils.Print;

public class EstrellaAct {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	    System.out.print("Ingrese su valor binario (solo ceros (0) y unos(1): ");
	    int valor= leer.nextInt();

	    double potencia = 0 ,suma = 0, mod;
	    while(valor > 0){
	    	mod = valor % 10;
	        mod *= 2;
	        mod = Math.pow(mod,potencia);
	        suma += mod;
	        valor /= 10;
	        potencia++;
	        Print.ln(suma);
	    }   
	    System.out.println("La suma de potencias es " + ((int) suma - 1));
	    leer.close();
	}
}
