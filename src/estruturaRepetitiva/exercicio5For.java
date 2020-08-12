package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio5For {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("digite o valor a ser fatorado: ");
		int operacoes = scan.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= operacoes; i++) {
			
			fatorial = fatorial * i;
			
			System.out.println(fatorial);
			
			
		}
		
		
		scan.close();

	}

}
