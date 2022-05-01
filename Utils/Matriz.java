package Utils;

public class Matriz {
	public static void printIntMtr(int[][] mtr) {
		for (int i = 0; i < mtr[0].length; i++) {
			Print.print("\t" + i + ". ");
		}
		Print.ln("");

		for (int ren = 0; ren < mtr.length; ren++) {
			Print.print(ren + "- " + "\t");
			for (int col = 0; col < mtr[0].length; col++) {
				Print.print(mtr[ren][col] + "\t");
			}
			Print.print("\n");
		}
	}

	public static void printCharMtr(char[][] mtr) {
		for (int i = 0; i < mtr[0].length; i++) {
			Print.print("\t" + i + ". ");
		}
		Print.ln("");

		for (int ren = 0; ren < mtr.length; ren++) {
			Print.print(ren + "- " + "\t");
			for (int col = 0; col < mtr[0].length; col++) {
				Print.print(mtr[ren][col] + "\t");
			}
			Print.print("\n");
		}
	}
}
