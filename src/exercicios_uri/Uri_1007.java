package exercicios_uri;

import java.util.Scanner;

public class Uri_1007 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);

		int A = sc1.nextInt();
		int B = sc2.nextInt();
		int C = sc3.nextInt();
		int D = sc4.nextInt();

		int DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);

		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
	}

}
