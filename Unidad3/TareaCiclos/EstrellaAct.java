package Unidad3.TareaCiclos;
import java.util.Scanner;

public class EstrellaAct {

	    public static void main(String[] args) {
	        Scanner leer= new Scanner(System.in);
	        double potencia=0;
	        double suma=0;
	        double mod;
	        
	        System.out.println("Ingrese su valor binario (solo ceros (0) y unos(1)");
	        int valor= leer.nextInt();
	        while(valor>0){
	            mod=valor%10;
	            mod=mod*2;
	            mod = Math.pow(mod,potencia);
	            suma=suma+mod;
	            valor=valor/10;
	            potencia++;
	        }
	       
	         System.out.println("La suma de potencias es "+suma);
	    }
}
