import java.util.Scanner;

public class estruturaSequencialExercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("Digite o primeiro valor:");
		int x = scan.nextInt();
		System.out.println("Digite o segundo valor:");
		int y = scan.nextInt();
		int resultado = x + y;
		System.out.println("o resultado da soma dos valores digitados é: " + resultado);
		
		scan.close();
		
	}

}
