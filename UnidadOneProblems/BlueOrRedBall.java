package UnidadOneProblems;

import java.util.Scanner;
import Utils.Print;

public class BlueOrRedBall {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Print print = new Print();
		
		print.pr("Ingresa pelota seleccionada (azul o roja):", null);
		String ball = in.nextLine();
		boolean hasValidBall = validBall(ball);
		
		if (hasValidBall) {
			print.pr("Ingresa total de compra:", null);
			double totalPurchase = in.nextInt();
		
			print.pr("Ingresa la cantidad de articulos:", null);
			int arts = in.nextInt();
		
			double desc = 0;
			if (ball.equals("roja")) {			
				desc =  0.7;
				totalPurchase = (double)totalPurchase * desc;
			} else if (ball.equals("azul")) {
				desc = 0.65;
				totalPurchase = (double)totalPurchase * desc;
			} 
		
			if (arts >= 4) {
				print.pr("Tu total con el descuento es: " + totalPurchase * 0.95, null);	
			} else {
				print.pr("Para aplicar el descuento exra necesitas 4 articulos o mas, $" + totalPurchase, null);
			}
		} else {
			print.pr("Ingresa una bola valida", null);
		}
		
		in.close();
	}
	
	private static boolean validBall(String ball) {
		boolean isValidBall = ball.equals("roja") || ball.equals("azul");
		return isValidBall;
	}
}
