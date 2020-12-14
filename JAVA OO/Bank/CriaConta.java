public class CriaConta {
	 public static void main(String[] args) {
		Conta referencia = new Conta();
		referencia.saldo = 200;
		
		System.out.println("=== Primeira conta === \n saldo: " + referencia.saldo);
		
		// trabalhando com referencuia a objeto!
		Conta segundaConta = new Conta();
		segundaConta.saldo = 400;
		
		System.out.println("=== Segunda conta === \n Saldo: " + segundaConta.saldo);
		
	}
}
