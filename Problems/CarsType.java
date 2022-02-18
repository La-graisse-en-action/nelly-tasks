package Problems;
import java.util.Scanner;
import Utils.Print;

public class CarsType {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Print print = new Print();
		
		print.pr("Ingresa el tipo de vehiculo: bicicleta-'b' motocicleta-'m' auto-'a' trailer-'t'");
		String v = in.nextLine();
		
		print.pr("Ingresar la velocidad en Km:");
		double km = in.nextDouble();
		
		double p = 0;
		if (v.equals("b")) {
			p = (double)(km * 1.5);
		} else if(v.equals("m") || v.equals("a")) {
			p = (double)(km * 7.5);
		} else if(v.equals("t")) {
			print.pr("Ingresa toneladas de carga:");
			int t = in.nextInt();
			
			p = (double)(t * 12 + km * 12.5);
		} else {
			print.pr("Vehiculo no valido");
		}
		
		if (p > 0) {
			print.pr("El valor total de tu " + v + " es de " + p);
		} else {
			print.pr("Algo salio mal");
		}
		
		in.close();
	}
}
