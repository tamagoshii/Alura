
public class TestaConversao {

	public static void main(String[] args) {

//		double salario = 1300.75;
//		int valor = salario;

		double salario = 1300.75;
		int valor = (int) salario; // casting
		// casting transforma o valor do lado direito de (int) em inteiro.

		System.out.println("Valor de Salario: " + valor);

		// inconsistencia com double
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;

		System.out.println("Total: " + total);

		// float
//		float pontoFlutuante = 3.14; | Dessa forma para o Java é um double.
		// é necessario utilizar casting (float) ou f no final do valor
		float pontoFlutuante = 3.14f;

		System.out.println("valor do ponto flutuante: " + pontoFlutuante);
	}
}
