public class Metodo {
	public static void main(String[] args) {
		Cliente contaA = new Cliente(); // Cria cliente
		contaA.nome = "Maria Eduarda";
		contaA.profissao = "Analista";
		contaA.cpf = "123.456.789-01";
		
		Conta testeA = new Conta(); // cria conta
		testeA.deposita(800);
		
		testeA.titular = contaA; // seta contaA criada anteriormente para testeA
		
		// imprime testeA com atributos dos dois metodos criados (conta e cliente)
		System.out.println(testeA.titular.nome);
	}
}
