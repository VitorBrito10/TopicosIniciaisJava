package estrutraCondicional;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um número para saber se ele é par ou ímpar");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("ìmpar");
		}
		scan.close();

	}

}
