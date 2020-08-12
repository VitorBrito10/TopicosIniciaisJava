package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio3For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite a quantidade de valores que serão lidos: ");
		int qtd = scan.nextInt();
		double mediaPonderada = 0.0;

		for (int i = 0; i < qtd; i++) {

			System.out.println("digite o primeiro valor: ");
			double a = scan.nextDouble();
			System.out.println("digite o segundo valor: ");
			double b = scan.nextDouble();
			System.out.println("digite o terceiro valor: ");
			double c = scan.nextDouble();

			mediaPonderada = (a * 2 + b * 3 + c * 5) / 10;

			System.out.printf("média ponderada dos valores informados: %.1f%n", mediaPonderada);
			System.out.println("===========================================================");
			System.out.println("calculos resolvidos "+ (i + 1) + " / " + qtd);

		}

		scan.close();
	}

}
