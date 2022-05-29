package omegaUpChallenges;

import java.io.IOException;
import java.util.Scanner;

public class PrintingIntegers {

	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int arrValue = sn.nextInt();
			arr[i] = arrValue;
		}
		int p = sn.nextInt();
		for (int j = 0; j < arr.length; j++) {
			int val = arr[j];
			if (val % 2 == 0 && p == 0) {
				System.out.print(val + " ");
			} else if (val % 2 == 1 && p == 1) {
				System.out.print(val + " ");
			}
		}
		sn.close();
	}
}
