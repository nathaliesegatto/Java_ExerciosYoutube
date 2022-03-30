package exercicio2;

public class Pessoa2 {
	String nome;
	String sexo;
	int idade;
	
	public void maiorDeIdade() {
		boolean maioridade;
		if (idade >= 18) {
			maioridade = true;
			System.out.println(maioridade + " (" + nome + " É maior de idade).");
		} else {
			maioridade = false;
			System.out.println(maioridade + " (" + nome + " NÃO É maior de idade).");
		}
	}
}