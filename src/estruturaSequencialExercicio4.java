import java.util.Locale;
import java.util.Scanner;

public class estruturaSequencialExercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o n�mero do funcion�rio:");
		int numFuncionario = scan.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas:");
		int horas = scan.nextInt();
		System.out.println("Digite o sal�rio do funcion�rio");
		double salario = scan.nextDouble();
		double valor = salario * horas;
		System.out.printf("o n�mero do funcion�rio � " + numFuncionario + " e o valor a ser recebido por ele � %.2f%n",valor );
		scan.close();
		
	}
}
