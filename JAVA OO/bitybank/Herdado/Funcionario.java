
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; // protected fica entre publico e privado | Somente visivel para herdeiros (classes filhas);

	public double bonificacao() {
		System.out.println("Cargo: Comun");
		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
