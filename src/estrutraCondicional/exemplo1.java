package estrutraCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exemplo1 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite os minutos utilizados para saber o valor da conta!");
		int minutos = scan.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor a pagar: R$%.2f", conta);
		scan.close();
		
	}

}
