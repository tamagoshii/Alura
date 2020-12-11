public class Fatorial {
	public static void main(String[] args) {
		System.out.println("== Fatorial ==");

		int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
			fatorial = fatorial * n;
			System.out.println(n + "=" + fatorial);
		}
	}
}
