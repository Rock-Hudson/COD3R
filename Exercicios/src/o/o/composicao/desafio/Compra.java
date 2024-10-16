package o.o.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();

	void adicionarItem(Produto p, int qtdade) {

		this.itens.add(new Item(p, qtdade));

	}

	double obtervalorTotal() {

		double total = 0;

		for (Item item : itens) {

			total += item.quantidade * item.produto.preco;

		}

		return total;
	}

}
