package exercicio2;

public class Pessoa {
	String nome;
	String sexo;
	int idade;
	
	public void maiorDeIdade() {
		boolean maioridade;
		if (idade >= 18) {
			maioridade = true;
			System.out.println(maioridade);
		} else {
			maioridade = false;
			System.out.println(maioridade);
		}
	}
}



