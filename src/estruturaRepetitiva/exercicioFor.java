package estruturaRepetitiva;

import java.util.Scanner;

public class exercicioFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um valor para saber os números ímpares anteriores a ele: ");
		int valor = scan.nextInt();
		
		for (int i = 0; i <= valor; i++) {
			
			int divisao = i;
			
			if(divisao %2 != 0) {
				System.out.println(divisao);
			}
		}
		
		scan.close();
	}

}
