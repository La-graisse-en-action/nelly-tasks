package Unidad5;

import java.util.Random;

public class ArrMethodClassroom {

	public static void main(String[] args) {

		int[] arr = met4(10);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] met4(int numero) {
		int arr[] = new int[numero];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(51) + 50;
		}

		return arr;
	}
}
