package exercicios_uri;

import java.util.Scanner;

public class Uri_1004 {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc1.nextInt();
		B = sc2.nextInt();
		
		PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		
		sc1.close();
		sc2.close();
	}

}
