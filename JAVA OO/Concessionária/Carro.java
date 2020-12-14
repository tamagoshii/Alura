package consecionaria;

public class Carro {
	private int ano;
	private String marca;
	private String modelo;
	private double valor;
	
	public Carro(int ano, String marca, String modelo, double valor) {

		if(ano >= 2000) {
			this.ano = ano;
		} else {
			System.out.println("Ano não permitido!");
			return;
		}
			
		if(modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("Modelo invalido!");
			return;
		}
		
		if(marca != null) {
			this.marca = marca;
		} else {
			System.out.println("Marca invalida!");
			return;
		}
		
		if(valor > 0 ) {
			this.valor = valor;
		} else {
			System.out.println("Valor não permitido!");
		}
		
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
