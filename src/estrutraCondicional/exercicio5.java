package estrutraCondicional;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		System.out.println("==========================");
		System.out.println("Código Especificação Preço");
		System.out.println("1	   Mel			 5.00");
		System.out.println("2	   Leite		 6.00");
		System.out.println("3	   Café		     	 7.00");
		System.out.println("4	   Quick		 8.00");
		System.out.println("==========================");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o número do seu pedido:");
		int num = scan.nextInt();
		System.out.println("Digite a quantidade:");
		int qtd = scan.nextInt();
		
		
		if (num == 1) {
			double valorUnidade = 5.00;
			double valorTotal = valorUnidade * qtd;
			System.out.printf("o valor foi de: R$%.2f", valorTotal);
		}
		else if (num == 2) {
			double valorUnidade = 6.00;
			double valorTotal = valorUnidade * qtd;
			System.out.printf("o valor foi de: R$%.2f",valorTotal);
		}
		else if (num == 3) {
			double valorUnidade = 7.00;
			double valorTotal = valorUnidade * qtd;
			System.out.printf("o valor foi de: R$%.2f", valorTotal);
		}
		else if (num == 4) {
			double valorUnidade = 8.00;
			double valorTotal = valorUnidade * qtd;
			System.out.printf("o valor foi de: R$%.2f",valorTotal);
		}
		else {
			System.out.println("não possuimos um produto com este código!");
		}
		
		scan.close();
	}
}
