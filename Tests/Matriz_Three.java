package Tests;

import Utils.Print;

public class Matriz_Three {
	public static void main(String[] args) {

		int tri[][] = new int[7][13];
		int ren, col;

		tri[0][tri[0].length / 2] = 1; // middle column value

		for (ren = 1; ren < tri.length; ren++) {
			for (col = 1; col < tri[0].length - 1; col++) {
				tri[ren][col] = tri[ren - 1][col - 1] + tri[ren - 1][col + 1];

			}
			Print.ln("");
		}
		tri[tri.length - 1][0] = 1;
		tri[tri.length - 1][tri[0].length - 1] = 1;

		for (ren = 0; ren < tri.length; ren++) {
			for (col = 0; col < tri[0].length; col++) {
				int val = tri[ren][col];
				if (val != 0) {
					Print.print(val + "\t");
				} else {
					Print.print("\t");
				}
			}
			Print.ln("");
		}

	}
}
