package Utils;

public class Matriz {
	public static void printIntMtr(int[][] matriz) {
		for (int ren = 0; ren < matriz.length; ren++) {
			Print.print(ren + "- " + "\t");
			for (int col = 0; col < matriz[0].length; col++) {
				Print.print(matriz[ren][col] + "\t");
			}
			Print.print("\n");
		}
	}
}
