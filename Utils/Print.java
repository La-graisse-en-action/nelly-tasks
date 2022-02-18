package Utils;

public class Print {
	public <T> void pr(T any, String color) {
		
		if (color.equals(null)) color = Colors.RESET;
		String txt = (String)(color + any);
		System.out.println(txt);
		System.out.println(Colors.RESET);
	}
}
