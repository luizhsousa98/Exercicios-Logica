package exercicios_uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1005 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		double A = sc1.nextDouble();
		double B = sc2.nextDouble();
		
		double MEDIA = (A * 3.5 + B * 7.5) / (3.5 + 7.5) ;
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
				
		sc1.close();
		sc2.close();
	}

}
