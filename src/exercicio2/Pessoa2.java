package exercicio2;

public class Pessoa2 {
	String nome;
	String sexo;
	int idade;
	
	public void maiorDeIdade() {
		boolean maioridade;
		if (idade >= 18) {
			maioridade = true;
			System.out.println(maioridade + " (" + nome + " � maior de idade).");
		} else {
			maioridade = false;
			System.out.println(maioridade + " (" + nome + " N�O � maior de idade).");
		}
	}
}