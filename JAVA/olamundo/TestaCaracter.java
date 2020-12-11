
public class TestandoCaracter {

	public static void main(String[] args) {

		char valor = 65;
		char letra = 'b';
		// implicito casting
		letra = (char) (letra + 1);

		System.out.println("Valor de 65 = " + valor + "\nValor de Letra = " + letra);

		String linha = "Meu nome é estela, tenho " + 26 + " anos";

		System.out.println(linha);

	}
}
