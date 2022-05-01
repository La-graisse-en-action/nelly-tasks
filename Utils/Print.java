package Utils;

/**
 * @apiNote (English) This class is only useful for printing text to the
 *          terminal. (Español) Esta clase solo es útil para imprimir texto en
 *          la terminal.
 * @author mrluisfer
 */
public class Print {
	public static <T> void ln(T txt) {
		System.out.println(txt);
	}

	public static <T> void print(T txt) {
		System.out.print(txt);
	}

	/**
	 * Print an error message on your terminal with red color
	 * 
	 * @param <String>
	 * @param error
	 */
	public static <T> void error(T error) {
		System.err.println(error);
	}

	public static void print(String string, String cyan) {
		// TODO Auto-generated method stub
		
	}
}
