
public class Metodo {
	
	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		// Chama Metodo
		contaA.deposita(100);
		
		System.out.println("Saldo: " + contaA.saldo);
		
		contaA.saca(20);
		
		System.out.println("Saldo: " + contaA.saldo);
		
		Conta contaB = new Conta();
		contaB.deposita(500);
		System.out.println("Saldo " + contaB.saldo);
		
		if(contaB.transfere(600, contaA)) {
			System.out.println("Transferencia realizada com sucesso");
		} else
			System.out.println("Transferencia negada");
		
		System.out.println("Saldo Conta A: " + contaA.saldo);
		System.out.println("Saldo Conta B: " + contaB.saldo);
	}
}
