
public class TestaCodicional {

	public static void main(String[] args) {

		System.out.println("=== Testando Fluxos condicionais === ");

		int idade = 16;
		int idade2 = 18;
		boolean acompanhado = false;
		boolean acompanhado2 = true; // pode usar validação ex: acompanhado2 >= 2;
		// essa validação retorna true ou false.

		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			if (acompanhado == true) {
				System.out.println("Menor de idade, mas acompanhado por um adulto");
			} else {
				System.out.println("Menor de idade");

			}
		}

		System.out.println("==== Metodo adequado ====");

		if (idade2 >= 18 || acompanhado2 == true) {
			System.out.println("Bem vindo!");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
