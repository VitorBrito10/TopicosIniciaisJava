import java.util.Scanner;

public class estruturaSequencialExercicio5 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o c�digo da pe�a:");
		int codigoPeca = scan.nextInt();
		System.out.println("Digite a quantidade de pe�as:");
		int qtdPeca = scan.nextInt();
		System.out.println("Digite o valor da pe�a:");
		double valorPeca = scan.nextDouble();
		System.out.println("===============");
		System.out.println("Pr�ximo Produto");
		System.out.println("===============");
		System.out.println("Digite o c�digo da pe�a:");
		
		int codigoPeca2 = scan.nextInt();
		System.out.println("Digite a quantidade de pe�as:");
		int qtdPeca2 = scan.nextInt();
		System.out.println("Digite o valor da pe�a:");
		double valorPeca2 = scan.nextDouble();
		
		double valorTotal = (valorPeca * qtdPeca) + (valorPeca2 * qtdPeca2);
		System.out.printf("O valor a pagar: R$%.2f",valorTotal);
		
		scan.close();

	}

}
