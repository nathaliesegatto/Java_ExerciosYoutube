package exercicio3;

public class testaLocacao2 {
	public static void main(String[] args) {

		veiculo fiorino = new veiculo();
		System.out.println("Modelo: " + (fiorino.modelo = "fiorino 1.4"));
		System.out.println("Marca: " + (fiorino.marca = "Fiat"));
		System.out.println("Ano: " + (fiorino.ano = 2015));
		System.out.println("Dias: " + (fiorino.diasLocacao = 2));
		System.out.println("Preço Locação: " + (fiorino.locacaoFixo = 200));
		fiorino.calculaUtilitario();
		System.out.println();

		veiculo ka = new veiculo();
		System.out.println("Modelo: " + (ka.modelo = "Ford Ka 1.0 Fast"));
		System.out.println("Marca: " + (ka.marca = "Ford"));
		System.out.println("Ano: " + (ka.ano = 2019));
		System.out.println("Dias: " + (ka.diasLocacao = 3));
		System.out.println("Preço locação: " + (ka.locacaoFixo = 180));
		ka.calculaPasseio();
	}

}
