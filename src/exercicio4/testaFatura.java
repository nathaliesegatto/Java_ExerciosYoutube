package exercicio4;

public class testaFatura {
	public static void main(String[] args) {
		
		Fatura produto1 = new Fatura();
		System.out.println("N�mero: " + (produto1.numero = "20220301"));
		System.out.println("Descri��o: " + (produto1.descricao = "Mouse Sem Fio Mobile Usb Roxo"));
		System.out.println("Quantidade: " + (produto1.quantidade = 1));
		System.out.println("Pre�o Unit�rio: R$ " + (produto1.precoUnitario = 89.90));
		produto1.getValorFatura();
		System.out.println();
		
		
		Fatura produto2 = new Fatura();
		System.out.println("N�mero: " + (produto2.numero = "20220302"));
		System.out.println("Descri��o: " + (produto2.descricao = "Teclado Mecanico Mancer Shade Rgb Rainbow Switch Outemu"));
		System.out.println("Quantidade: " + (produto2.quantidade = 2));
		System.out.println("Pre�o Unit�rio: R$ " + (produto2.precoUnitario = 182.99));
		produto2.getValorFatura();
		
		
	}
}
