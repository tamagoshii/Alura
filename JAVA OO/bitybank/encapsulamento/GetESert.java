
public class GetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1111);
		
		System.out.println(conta.getNumero());
		
		conta.setAgencia(4242);
		System.out.println(conta.getAgencia());
		
		Cliente clienteA = new Cliente();
		clienteA.setNome("Maria");
		conta.setTitular(clienteA);
		
		System.out.println(conta.getTitular().getNome());
		// em duas linhas
		Cliente titularDaconta = conta.getTitular();
		titularDaconta.setProfissao("Chef de cozinha");
		
		System.out.println(conta.getTitular().getProfissao());
	}

}
