public class Conta {
	private int agencia;
	private double saldo; // encapsulamento de atributo
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++; // é igual á conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("teste");
	}
	
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
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(agencia <= 0) {
			System.out.println("Agencia Inalida");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(numero <= 0) {
			System.out.println("Numero Invalido");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}

}
