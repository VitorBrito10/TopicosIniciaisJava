package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("digite sua senha:");
		int senha = scan.nextInt();
		
		while (senha != 2002) {
			System.out.println("senha inválida, digite novamente:");
			senha = scan.nextInt();
		}
		System.out.println("acesso permitido");
		scan.close();
	}

}
