package ClassProblems;

import java.util.Scanner;

import Utils.Print;

public class Tests {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		y /= ++x;
		Print.ln(y);
	}
}
