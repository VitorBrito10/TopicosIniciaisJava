package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("digite o c�digo do combust�vel: ");
		int codigo = scan.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (codigo != 4) {

			if (codigo == 1) {

				alcool = alcool + 1;
			} else if (codigo == 2) {

				gasolina = gasolina + 1;
			} else if (codigo == 3) {

				diesel = diesel + 1;
			} else {
				System.out.println("c�digo incorreto!");
			}

			System.out.println("digite o c�digo do combust�vel: ");
			codigo = scan.nextInt();

		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: "+ diesel);
		scan.close();
	}

}
