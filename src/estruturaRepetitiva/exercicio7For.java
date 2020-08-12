package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio7For {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("digite o número de linhas para efetuar o cálculo do quadrado e o cubo: ");
		int linhas = scan.nextInt();
		
		for (int i = 1; i <= linhas; i++) {
			double a = 0;
			System.out.println(i + " " + (a = Math.pow(i, 2)) + " " + (a = Math.pow(i, 3)));
		}
		scan.close();

	}

}
