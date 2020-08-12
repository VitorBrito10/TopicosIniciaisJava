package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio4For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite quantas divisões deseja fazer: ");
		int divisoes = scan.nextInt();

		for (int i = 0; i < divisoes; i++) {
			System.out.println("digite o primeiro valor: ");
			int x = scan.nextInt();
			System.out.println("digite o segundo valor: ");
			int y = scan.nextInt();

			if (y == 0) {
				System.out.println("divisão impossível!");
			} else {
				double valor  = (double) x / y;
				System.out.println("o resultado dessa operação foi: "+ valor);
				System.out.println("===========================================================");
				System.out.println("calculos resolvidos "+ (i + 1) + " / " + divisoes);
			}
		}

		scan.close();

	}

}
