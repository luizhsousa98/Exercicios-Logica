package exercicios_uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double n = 3.14159;

		double r = sc.nextDouble();

		double a = n * Math.pow(r, 2);

		System.out.printf("A=%.4f%n", a);

		sc.close();

	}

}
