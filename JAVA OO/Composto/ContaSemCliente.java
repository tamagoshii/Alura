public class ContaSemCliente {
	public static void main(String[] args) {
		Conta contaNova = new Conta();
		System.out.println(contaNova.extrato());
		
		contaNova.titular = new Cliente();
		contaNova.titular.nome = "Evandro";
		System.out.println(contaNova.titular.nome);
		
	}
}
