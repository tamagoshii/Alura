public class Conta {
	int agencia;
	private double saldo; // encapsulamento de atributo
	int numero;
	Cliente titular;
	
	// pesquisar mais sobre metodo
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else
			return false;
	}
	
	boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); // chama metodo deposita, atribuido valor em destino.
			return true;
		}
			return false;
	}
	
	public double extrato() {
		return this.saldo;
	}
}
