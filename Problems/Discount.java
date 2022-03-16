package Problems;
// This is the problem 3 of the Programming Fundamentals class
import java.util.Scanner;

class Discount {
	public static void main(String[] args) {
		
		String availableStudentName = "Juan Perez";
		Scanner scanner = new Scanner(System.in);

		print("Ingress the student name:");
		String studentName = scanner.nextLine();

		print("Enter the inscription price:");
		int inscription = scanner.nextInt();

		if (studentName.equals(availableStudentName)) {
			int total = getDiscount(inscription);
			print(studentName + " your total is: " + total);
		} else {
			print("Discount isnt available, your total is: " + inscription);
		}

		scanner.close();
	}

	private static <T> void print(T x) {
		System.out.println(x);
	}

	private static int getDiscount(int x) {
		int y = (int)(x * 0.5);
		return y;
	}
}