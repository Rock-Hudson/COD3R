package classes;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		
		Produto p1 =  new Produto();
		p1.nome = "Arroz";
		p1.desconto = 0.1;
		p1.preco = 10.99;
		
		var p2 = new Produto();
		p2.nome = "Notebook";
		p2.desconto = 0.25;
		p2.preco = 10.20;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.println(p2.desconto);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p1.preco * (1 - p1.desconto);
		
		double mediaPrecoFinal = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Preço final é R$ %.2f", mediaPrecoFinal);
		
		
	}
	
	
	
}
