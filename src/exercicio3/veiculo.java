package exercicio3;

public class veiculo {
	String modelo;
	String marca;
	int ano;
	int diasLocacao;
	int locacaoFixo;
	int totalUtilitario;
	int totalLocacao;

	public void calculaUtilitario() {
		totalLocacao = diasLocacao * (locacaoFixo + 40);
		System.out.println("Total da locação: R$ " + totalLocacao + ",00.");
	}

	public void calculaPasseio() {
		totalLocacao = diasLocacao * (locacaoFixo - 20);
		System.out.println("Total da locação: R$ " + totalLocacao + ",00.");
	}
}
