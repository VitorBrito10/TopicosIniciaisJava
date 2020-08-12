package estrutraCondicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas horas são?");
		int horas = scan.nextInt();

		if (horas > 0 && horas < 6) {
			System.out.println("Boa madrugada!");
		}
		else if (horas >= 6 && horas <= 12) {
			System.out.println("Bom dia!");
		}

		else if (horas >= 13 && horas < 18) {
			System.out.println("Boa tarde!");
		}
		else if (horas > 18 && horas <= 23) {
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Hora inválida");
		}
		scan.close();
	}
}
