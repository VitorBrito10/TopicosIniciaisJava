import java.util.Locale;
import java.util.Scanner;

public class estruturaSequencialExercicio6 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		double pi =  3.14159;
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o valor de A:");
		float a = scan.nextFloat();
		System.out.println("Digite o valor de B:");
		float b = scan.nextFloat();
		System.out.println("Digite o valor de C:");
		float c = scan.nextFloat();
		
		float areaTriangulo = (a * c)/2;
		double r = Math.pow(c, 2);
		float areaCirculo = (float) (pi * r);
		double areaTrapezio = (a + b)/2 *c;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf("Area do Triângulo Retângulo: %.3f%n", areaTriangulo);
		System.out.printf("Area do Circulo: %.3f%n", areaCirculo);
		System.out.printf("Area do Trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Area do Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Area do Retângulo: %.3f%n", areaRetangulo);
		scan.close();
	}
}
