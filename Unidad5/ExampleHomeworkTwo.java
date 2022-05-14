package Unidad5;

import Utils.Print;

public class ExampleHomeworkTwo {
	public static void main(String[] args) {
		int var = plus(2,8);
		System.out.println(var); // Funciona
		
		System.out.println(plus(3, "3")); // No funciona
	}

	private static int plus(int x, int y) {
		return x + y;
	}
}
