package exercicio4;

public class testaFatura {
	public static void main(String[] args) {
		
		Fatura produto1 = new Fatura();
		System.out.println("Número: " + (produto1.numero = "20220301"));
		System.out.println("Descrição: " + (produto1.descricao = "Mouse Sem Fio Mobile Usb Roxo"));
		System.out.println("Quantidade: " + (produto1.quantidade = 1));
		System.out.println("Preço Unitário: R$ " + (produto1.precoUnitario = 89.90));
		produto1.getValorFatura();
		System.out.println();
		
		
		Fatura produto2 = new Fatura();
		System.out.println("Número: " + (produto2.numero = "20220302"));
		System.out.println("Descrição: " + (produto2.descricao = "Teclado Mecanico Mancer Shade Rgb Rainbow Switch Outemu"));
		System.out.println("Quantidade: " + (produto2.quantidade = 2));
		System.out.println("Preço Unitário: R$ " + (produto2.precoUnitario = 182.99));
		produto2.getValorFatura();
		
		
	}
}
