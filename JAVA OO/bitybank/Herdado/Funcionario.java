
public class Funcionario {

		private String nome;
		private String cpf;
		private double salario;
		private int tipo = 0; // 0 = comun, 1 = gerente e 2 = diretor;
		
		
		public double bonificacao() {
			
			if(this.tipo == 0 ) {
				System.out.println("Comun");
				return this.salario * 0.1;
			} else if (this.tipo == 1) {
				System.out.println("Gerente");
				return this.salario * 0.3;
			}
				System.out.println("Diretor");
				return this.salario * 0.5;
		}
		
		public int getTipo() {
			return tipo;
		}
		
		public void setTipo(int tipo) {
			this.tipo = tipo;
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
