package estrutraCondicional;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número para saber entre quais dos seguintes intervalos ele está ([0,25], (25,50], (50,75], (75,100])");
		double num = scan.nextDouble();
		
		if (num >=0 && num < 25) {
			System.out.println("ele está entre 0 e 24");
		}
		
		else if (num >= 25 && num < 50) {
			System.out.println("ele está entre 25 e 49");
		}
		
		else if (num >= 50 && num < 75) {
			System.out.println("ele está entre 50 e 74");
		}
		
		else if (num >= 75 && num <= 100) {
			System.out.println("ele está entre 75 e 100");
		}
		else {
			System.out.println("o número digitado não está entre os intervalos estebelicidos!");
		}
		scan.close();
	}

}
