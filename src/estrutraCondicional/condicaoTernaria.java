package estrutraCondicional;

public class condicaoTernaria {

	public static void main(String[] args) {
		/*double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
		desconto = preco * 0.1;
		}
		else {
		desconto = preco * 0.05;
		}*/
		
		//a partir daqui � o jeito mais f�cil de se fazer a mesma coisa utilizando condi��o tern�ria
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
	}

}
