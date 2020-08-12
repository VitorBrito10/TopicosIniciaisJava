import java.util.Scanner;

public class estruturaSequencialExercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double pi = 3.14159;
		System.out.println("Digite o valor do raio:");
		double raio = scan.nextDouble();
		double potenciaRaio = Math.pow(raio, 2);
		double area = pi * potenciaRaio;
		System.out.printf("O valor da área é: %.4f%n", area);
		scan.close();

	}

}
