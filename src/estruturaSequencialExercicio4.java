import java.util.Locale;
import java.util.Scanner;

public class estruturaSequencialExercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o número do funcionário:");
		int numFuncionario = scan.nextInt();
		System.out.println("Digite o número de horas trabalhadas:");
		int horas = scan.nextInt();
		System.out.println("Digite o salário do funcionário");
		double salario = scan.nextDouble();
		double valor = salario * horas;
		System.out.printf("o número do funcionário é " + numFuncionario + " e o valor a ser recebido por ele é %.2f%n",valor );
		scan.close();
		
	}
}
