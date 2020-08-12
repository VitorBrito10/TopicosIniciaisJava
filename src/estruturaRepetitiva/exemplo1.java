package estruturaRepetitiva;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("digite um número");
		int num = scan.nextInt();
		int total = 0;

		while (num != 0) {

			total += num;
			num = scan.nextInt();

		}

		System.out.println(total);
		scan.close();

	}

}
