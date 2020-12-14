
public class Referencias {
	public static void main(String[] args) {
		
		// referencias iguais ao mesmo objetos
		Conta primeiraReferencia = new Conta();
		primeiraReferencia.agencia = 1234;
		
		Conta segundaReferencia = new Conta();
		segundaReferencia = primeiraReferencia;
		
		System.out.println(primeiraReferencia);
		System.out.println(segundaReferencia);
		
		// referencias destintas ao mesmo objetos
		Conta terceiraReferencia = new Conta();
		terceiraReferencia.agencia = 1234;
		
		Conta quartaReferencia = new Conta();
		quartaReferencia.agencia = 4321;
		
		System.out.println(terceiraReferencia);
		System.out.println(quartaReferencia);
		
	}
}
