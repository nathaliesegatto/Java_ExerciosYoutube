package exercicio4;

public class Fatura {
	String numero;
	String descricao;
	int quantidade;
	double precoUnitario;

	public void getValorFatura() {
		double valor = quantidade * precoUnitario;
		System.out.println("Valor total: R$ " + valor);
	}
}
