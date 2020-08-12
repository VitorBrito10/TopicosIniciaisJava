package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio6For {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("digite um valor para ver os seus divisores: ");
		int valor = scan.nextInt();
		
		for (int i = 1; i <= valor; i++) {
			
			if (valor % i == 0 ) {
				System.out.println(i);
			}
		}
		
		scan.close();

	}

}
