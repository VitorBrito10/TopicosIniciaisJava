package outrosTopicosBasicos;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();

	}

//quando a fun��o retornar um valor, colocar o tipo, nesse caso, retornou um int	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
		aux = x;
		} else if (y > z) {
		aux = y;
		} else {
		aux = z;
		}
		return aux;
		}

//quando a fun��o n�o retornar valor precisa colocar void
		public static void showResult(int value) {
		System.out.println("Higher = " + value);
		}

}
