package Utils;

public class Print {
	public static <T> void ln(T txt) {
		System.out.println(txt);
	}

	public static <T> void print(T txt) {
		System.out.print(txt);
	}

	public static <T> void error(T error) {
		System.err.println(error);
	}
}
