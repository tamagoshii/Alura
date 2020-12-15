
public class TestaGerente {
	public static void main(String[] args) {
		Gerente novoGerente = new Gerente();
		
		novoGerente.setNome("Carol");
		novoGerente.setCpf("123.456.789-99");
		novoGerente.setSalario(7000.00);
		
		System.out.println("Nome: " + novoGerente.getNome());
		System.out.println("CPF: " + novoGerente.getCpf());
		System.out.println("Salario: " + novoGerente.getSalario());
		
		novoGerente.setSenha(2222);
		boolean teste = novoGerente.autentica(2222);
		
		System.out.println(teste);
		System.out.println("Bonificação: " + novoGerente.bonificacao());
	}
}
