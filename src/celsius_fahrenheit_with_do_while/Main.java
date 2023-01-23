package celsius_fahrenheit_with_do_while;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char r;
		do {
			System.out.print("Write the temperature in Celsius: ");
			
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Equivalent in Fahrenheit: %.1f%n", F);
			System.out.printf("Want to repeat (y/n)? ");
			r = sc.next().charAt(0);
				
		} while (r != 'n');
		
		sc.close();
		
	}

}
