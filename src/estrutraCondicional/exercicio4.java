package estrutraCondicional;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite a hora inicial: ");
		int horaInicial = scan.nextInt();
		System.out.println("Digite a hora final: ");
		int horaFinal = scan.nextInt();
		
		if (horaInicial < horaFinal) {
			int duracao = horaInicial - horaFinal;
			System.out.println("a duração foi de: " + duracao);
		}
		else if (horaFinal < horaInicial) {
			int duracao = 24 + horaFinal - horaInicial;
			System.out.println("a duração foi de: " + duracao);
		}
		
		else {
			System.out.println("valores inválidos");
			
		}
		
		scan.close();
	}

}
