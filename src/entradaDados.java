import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		String x;
		int y;
		double z;
		
		x = scan.next();
		y = scan.nextInt();
		z = scan.nextDouble();
		System.out.println("você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		scan.close();
	}
}
