public class TestaValores {
	public static void main(String[] args) {

		Conta conta = new Conta(1112, 2552);
		System.out.println(conta.getAgencia());
		
		Conta conta1 = new Conta(1113, 2522);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1114, 5522);
		System.out.println(conta.getAgencia());
		
		Conta conta3 = new Conta(1115, 2551);
		System.out.println(conta.getAgencia());
		
		System.out.println(conta.getTotal());
	}
}
