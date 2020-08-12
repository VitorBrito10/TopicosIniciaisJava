package estrutraCondicional;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o valor do seu salário para saber quanto deve pagar de imposto de renda!");
		double salario = scan.nextDouble();
		
		if (salario >= 0 && salario < 200.00) {
			System.out.println("Isento!");
		}
		else if (salario >= 1000.00 && salario <= 3000.00) {
			
			double valor = (salario * (8.00/100.00));
			System.out.printf("valor a ser pago: R$%.2f",valor);
		}
		
		else if (salario > 3000.00 && salario <= 4500.00) {
			
			double valor = (salario * (18.00/100.00));
			System.out.printf("valor a ser pago: R$%.2f",valor);
		}
		
		else if (salario > 4500.00 ) {
			
			double valor = (salario * (28.00/100.00));
			System.out.printf("valor a ser pago: R$%.2f",valor);
		}
		
		else {
			System.out.println("valor inválido!");
		}
		
		scan.close();
		

	}
	
	
}


