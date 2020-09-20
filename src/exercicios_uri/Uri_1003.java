package exercicios_uri;

import java.util.Scanner;

public class Uri_1003 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		int A = sc1.nextInt();
		int B = sc2.nextInt();

		int SOMA = A + B;

		System.out.println("SOMA = " + SOMA);

		sc1.close();
		sc2.close();
	}

}
