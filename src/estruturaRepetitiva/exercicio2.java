package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o primeiro valor");
		int x = scan.nextInt();
		System.out.println("digite o segundo valor");
		int y = scan.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Resultado: primeiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Resultado: segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Resultado: terceiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Resultado: quarto");
			}
			System.out.println("digite o primeiro valor novamente: ");
			x = scan.nextInt();
			System.out.println("digite o segundo valor novamente: ");
			y = scan.nextInt();
		}
		System.out.println("valor inválido");
		scan.close();
	}

}
