package omegaUpChallenges;

import java.util.Scanner;

public class InterScaleStrings {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String cad = "";
		String s = sn.next().toUpperCase();
		String t = sn.next();
		int inter = sn.nextInt();
		for (int i = 0; i < s.length(); i++) {
			if (inter == 1) {
				cad += s.charAt(i);
				cad += t.charAt(i);
			} else if (inter == 2) {
				cad += t.charAt(i);
				cad += s.charAt(i);
			}
		}
		System.out.println(cad);
		sn.close();
	}
}
