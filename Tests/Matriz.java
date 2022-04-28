package Tests;

import java.util.Random;

import Unidad3.TareaCiclos.Print;

public class Matriz {
	public static void main(String[] args) {
		Random r = new Random();
		int ren, col, num, sum = 0;
		num = r.nextInt(15) + 3;
		int matriz[][] = new int[num][num];

		Print.ln("Se creo de " + matriz.length + " por " + matriz[0].length);
		for (ren = 0; ren < matriz.length; ren++) {
			for (col = 0; col < matriz[0].length; col++) {
				num = r.nextInt(16) + 5;
				matriz[ren][col] = num;
				Print.print(matriz[ren][col] + "\t");
				if (ren == col)
					sum += matriz[ren][col];
			}
			Print.ln("");
		}
		Print.ln("La suma final es:" + sum);
	}
}
