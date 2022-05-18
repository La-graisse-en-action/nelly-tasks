package Unidad5;

import Utils.Print;

public class TableMethods {
	public static void main(String[] args) {
		table(3, 7);
		vocals("SI UNnasf dsadf sadf asdfasdqaADSFJHSDJFH");
	}

	private static void table(int init, int last) {
		for (; init <= last; init++) {
			for (int j = 1; j <= 10; j++) {
				int product = init * j;
				Print.ln(init + "x" + j + " = " + product);
			}
			Print.ln("\n");
		}
	}

	private static void vocals(String cad) {
		int vocals = 0;
		String newCad = cad.toLowerCase();

		for (int i = 0; i < newCad.length(); i++) {
			char val = newCad.charAt(i);
			if (val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u') {
				vocals++;
			}
		}
		Print.ln("Cantidad de vocales: " + vocals);

	}
}
