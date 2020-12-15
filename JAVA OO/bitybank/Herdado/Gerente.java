// Classe gerente herda os atributos da classe Funcionario.
public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// reescrita do metodo da classe pai
	public double bonificacao() {
		System.out.println("Cargo: Gerente");
	return super.salario * 0.3; // "super" explicita que o atributo salario pertence a classe pai; 

	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
