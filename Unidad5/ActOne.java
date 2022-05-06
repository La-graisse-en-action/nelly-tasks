package Unidad5;

import java.util.Random;
import java.util.Scanner;

public class ActOne {

	private static int aVocals = 0, eVocals = 0, iVocals = 0, oVocals = 0, uVocals = 0;
	private static char mtr[][] = new char[3][4];

	public static void main(String[] args) {

		// 1.
		ingressVocal(mtr);

		// 2.
		printMtr(mtr);

		// 3.
		showVocals(mtr);

		// 4.
		showUserRow(mtr);

		// 5.
		boolean hasAVocal = hasVocal(mtr);
		println("La matriz tiene mas de 4 caracteres 'a'?: " + hasAVocal);
	}

	private static void ingressVocal(char[][] charMtr) {
		Random random = new Random();
		char vocals[] = { 'a', 'e', 'i', 'o', 'u' };

		for (int ren = 0; ren < charMtr.length; ren++) {
			for (int col = 0; col < charMtr[0].length; col++) {
				int index = random.nextInt(vocals.length);
				charMtr[ren][col] = vocals[index];
			}
		}
	}

	public static void printMtr(char[][] mtr) {
		for (int i = 0; i < mtr[0].length; i++) {
			print("\t" + i + ". ");
		}
		println("");
		for (int ren = 0; ren < mtr.length; ren++) {
			print(ren + "- " + "\t");
			for (int col = 0; col < mtr[0].length; col++) {
				print(mtr[ren][col] + "\t");
			}
			print("\n");
		}
		println("");
	}

	private static <T> void print(T txt) {
		System.out.print(txt);
	}

	private static <T> void println(T txt) {
		System.out.println(txt);
	}

	public static void showVocals(char[][] mtr) {

		for (int ren = 0; ren < mtr.length; ren++) {
			for (int col = 0; col < mtr[0].length; col++) {
				switch (mtr[ren][col]) {
				case 'a':
					aVocals++;
					break;
				case 'e':
					eVocals++;
					break;
				case 'i':
					iVocals++;
					break;
				case 'o':
					oVocals++;
					break;
				case 'u':
					uVocals++;
					break;
				}
			}
		}

		println("Vocal a: " + aVocals + " veces");
		println("Vocal e: " + eVocals + " veces");
		println("Vocal i: " + iVocals + " veces");
		println("Vocal o: " + oVocals + " veces");
		println("Vocal u: " + uVocals + " veces");
	}

	public static void showUserRow(char[][] mtr) {
		Scanner sn = new Scanner(System.in);
		println("");
		print("Ingrese numero de renglon: ");
		int ren = sn.nextInt();

		if (ren > mtr.length - 1) {
			System.err.println("Renglon no valido");
		} else {
			for (int col = 0; col < mtr[0].length; col++) {
				print(mtr[ren][col] + "\t");
			}
			/*
			 * for(int col = 0; col < mtr.length; col++ ) { print(mtr[col][ren] + "\t"); }
			 */
			println("");
			sn.close();
		}
	}

	public static boolean hasVocal(char[][] mtr) {
		return (aVocals > 4);
	}

}
