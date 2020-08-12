package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio2For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite a quantidade de valores que serão lidos" + 
		" para avaliar se estão entre [10,20]:");
		int qtd = scan.nextInt();
		int valor = 0;
		int dentro = 0;
		int fora = 0;
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("digite um valor: ");
			valor = scan.nextInt();
			if (valor >=10 && valor <= 20) {
				
				dentro++;
			} else {
				
				fora ++;
			}
			
		}
		System.out.println("Quantidade de valores dentro: " + dentro);
		System.out.println("Quantidade de valores fora: " + fora);
		scan.close();

	}

}
