package exercicios_uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1006 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		double A = sc1.nextDouble();
		double B = sc2.nextDouble();
		double C = sc3.nextDouble();
		
		double MEDIA = (A * 2.0 + B * 3.0 + C * 5.0) / (2.0 + 3.0 + 5.0);
		
		System.out.printf("MEDIA = %.1f%n", MEDIA);
		
		sc1.close();
		sc2.close();
		sc3.close();
		
	}

}
