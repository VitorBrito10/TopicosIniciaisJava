package estruturaRepetitiva;

import java.util.Scanner;

public class exemploFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o n�mero de elementos que ser�o somados: ");
		int n = scan.nextInt();
		int total = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("digite  um elemento: ");
			int soma = scan.nextInt();
			total = total + soma;

		}

		System.out.println("a soma dos elementos �: " + total);
		scan.close();

	}

}
