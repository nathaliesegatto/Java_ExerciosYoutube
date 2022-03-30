package exercicio5;

public class testaAluno {
public static void main(String[] args) {
	
	Aluno luciana = new Aluno();
	System.out.println("Nome: " + (luciana.nome = "Luciana Almeida"));
	System.out.println("CPF: " + (luciana.cpf = "002.003.543-94"));
	System.out.println("Matrícula: " + (luciana.matricula = "10248"));
	System.out.println("E-mail: " + (luciana.email = "lucianaavoi@hotmail.com"));
	System.out.println();
	
	
	Aluno washington = new Aluno();
	System.out.println("Nome: " + (washington.nome = "Washingthon Shultz Albuquerque"));
	System.out.println("CPF: " + (washington.cpf = "042.673.902-00"));
	System.out.println("Matrícula: " + (washington.matricula = "10327"));
	System.out.println("E-mail: " + (washington.email = "wsalbuquerque@gmail.com"));
	
}
}
