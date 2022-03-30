package exercicio1;

public class classeImparesEPares {
int numerosPares;
int numerosImpares;

	public void imprimePares() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void imprimeImpares() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}



}
