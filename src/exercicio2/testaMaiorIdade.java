package exercicio2;

public class testaMaiorIdade {
	public static void main(String[] args) {
		
		Pessoa marcos = new Pessoa();
		marcos.nome = "Marcos Rogerio Silva";
		marcos.sexo = "Masculino";
		marcos.idade = 16;
		marcos.maiorDeIdade();
		System.out.println();
		
		Pessoa priscila = new Pessoa();
		priscila.nome = "Priscila Fernandes Gonçalves";
		priscila.sexo = "Feminino";
		priscila.idade = 21;
		priscila.maiorDeIdade();
		System.out.println();
		
		
	}
}
		