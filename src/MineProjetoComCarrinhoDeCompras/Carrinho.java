package MineProjetoComCarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<ItemCarrinho> itens = new ArrayList<>();
	
	
	public void adicionar(ItemCarrinho item) {
		itens.add(item);
	}
	
	public void removerPorNome(String nome) {
		itens.removeIf(item -> item.getProduto().getNome().equalsIgnoreCase(nome));
	}
	
	public double calcularTotal() {
		double total = 0;
		for (ItemCarrinho item : itens) {
			total += item.subTotal();
		}
		
		return total;
	}

}
