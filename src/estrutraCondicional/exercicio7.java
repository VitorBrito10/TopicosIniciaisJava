package estrutraCondicional;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite 2 valores para saber em que lugar do plano cartesiano ele está");
		System.out.println("Digite o primeiro valor:");
		int x = scan.nextInt();
		System.out.println("Digite o segundo valor:");
		int y = scan.nextInt();
		
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		
		else if (x > 0 && y < 0) {
			System.out.println("Q3");
		}
		
		else if (x < 0 && y < 0) {
			System.out.println("Q4");
		}
		
		else {
			System.out.println("Origem");
		}
		
		scan.close();
	}

}
