package exercicio1;

public class classeMultiplosDeTres {
	int multiplos;

	public void imprimeMultiplos() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}