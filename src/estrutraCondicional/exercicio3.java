package estrutraCondicional;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		int a = scan.nextInt();
		System.out.println("Digite o valor de B:");
		int b = scan.nextInt();
		
		if (a % 2 == 0 || b % 2 == 0) {
			System.out.println("S�o m�ltiplos");
		}
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
		scan.close();
	}

}
