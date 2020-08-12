import java.util.Scanner;

public class estruturaSequencialExercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = scan.nextInt();
		System.out.println("Digite o valor de B:");
		int b = scan.nextInt();
		System.out.println("Digite o valor de C:");
		int c = scan.nextInt();
		System.out.println("Digite o valor de D:");
		int d = scan.nextInt(); 
		int dif = (a * b - c * d);
		System.out.println(dif);
		scan.close();
	}
}
