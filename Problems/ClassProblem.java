package Problems;

import java.util.Scanner;

public class ClassProblem {
	static public void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		print("INGRESA MINUTOS OBSERVADOS");
		int minutes = in.nextInt();
		
		// int l = 0;
		long bacteries = 0;
		
		print("Tiempo (minutos): " + minutes);
		print("Tiempo" + "\t" + "Bacterias");
		/*
		while(l <= minutes) {
			if(bacteries == 0) bacteries = 1;
			else bacteries *= 2;
			
			print(l + "\t" + bacteries);
			l++;
		}
		*/
		
		/*
		do {
			if(bacteries == 0) bacteries = 1;
			else bacteries *= 2;
			print(l + "\t" + bacteries);
			l++;
		} while(l <= minutes);
		*/
		
		/*
		for (int l = 0; l <= minutes; l++) {
		 
			if(bacteries == 0) bacteries = 1;
			else bacteries *= 2;
			print(l + "\t" + bacteries);
		}
		*/
		
		in.close();
	}
	
	static public <T> void print(T txt) {
		System.out.println(txt);
	}
}
