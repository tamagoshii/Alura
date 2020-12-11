
public class TestaVariavelFluturante {

	public static void main(String[] args) {

		System.out.println("==== Variavel flutuante =====");

		double precoBiscoito = 2.75;
		int qtdBiscoito = 10;

		System.out.println("Valor do biscoito:" + precoBiscoito + "\n" + "Qtd Biscoito: " + qtdBiscoito);

		System.out.println("==== Divisao de variaveis ====");

		double divFlutuantes = 3.0 / 2.0;
		double divFlutuantesInt = 3 / 2;
		double divFlutuantesIntDouble = 3.0 / 2;

		System.out.println("Divisão entre Flutuantes:" + divFlutuantes);
		System.out.println("Divisão entre Int na tipagem Flutuantes" + divFlutuantesInt);
		System.out.println("Divisão entre Int e Flutuantes" + divFlutuantesIntDouble);

		System.out.println("==== Multiplicação de variaveis ====");
		double valorDaBatataPorUnd = 3.50;
		int qtdDeBatatas = 5;

		System.out.println(valorDaBatataPorUnd * qtdDeBatatas);
	}
}
