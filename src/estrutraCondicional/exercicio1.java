package estrutraCondicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro para saber se ele é positivo ou negativo");
		int num = scan.nextInt();

		if (num >= 0) {
			System.out.println("Esse número é positivo");
		} else if (num < 0) {
			System.out.println("Esse número é negativo");
		} 
		scan.close();

	}

}
