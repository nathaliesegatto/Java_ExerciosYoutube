package exercicio3;

public class testaLocacao {
	public static void main(String[] args) {
		
		veiculo fiorino = new veiculo();
		fiorino.modelo = "fiorino 1.4";
		fiorino.marca = "Fiat";
		fiorino.ano = 2015;
		fiorino.diasLocacao = 2;
		fiorino.locacaoFixo = 200;
		fiorino.calculaUtilitario();
		
		veiculo ka = new veiculo();
		ka.modelo = "Ford Ka 1.0 Fast";
		ka.marca = "Ford";
		ka.ano = 2019;
		ka.diasLocacao = 2;
		ka.locacaoFixo = 180;
		ka.calculaPasseio();
	}

}
