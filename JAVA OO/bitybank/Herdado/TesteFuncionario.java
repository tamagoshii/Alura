
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario novoFuncionario = new Funcionario();
		
		novoFuncionario.setNome("Funcionario");
		novoFuncionario.setSalario(3000.00);
		novoFuncionario.setTipo(1);
		
		System.out.println("Nome: " + novoFuncionario.getNome());
		System.out.println("Salario: " + novoFuncionario.getSalario());
		System.out.println("Bonificação: " + novoFuncionario.bonificacao());
		
	}
}
