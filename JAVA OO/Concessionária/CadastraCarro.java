package consecionaria;

public class TestaCarro {
	public static void main(String[] args) {

		Carro carro = new Carro(2000, "citroen", "c3", 13000);
		System.out.println("=== Carros ===");
		System.out.println("Modelo: " + carro.getModelo() + "\nMarca: " + carro.getMarca() + "\nAno: " + carro.getAno()
				+ "\nValor: " + carro.getValor());
	}
}
