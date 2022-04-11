package ClassProblems;

import Unidad3.TareaCiclos.Print;
import java.util.Scanner;

public class Tests {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		y /= ++x;
		Print.ln(y);
	}
}
