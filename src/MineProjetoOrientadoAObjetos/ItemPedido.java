package MineProjetoOrientadoAObjetos;

public class ItemPedido {

	private Produto produto;
	private int quantidade;
	
	
	public ItemPedido(Produto produto, int quantidade) {
		if(quantidade <= 0) {
			throw new IllegalArgumentException("Quantidade inválida");
		}
		
		this.produto = produto;
		this.quantidade = quantidade;
	}


	public ItemPedido() {
		super();
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	public double calcularSubtotal() {
		return produto.getPreco() * this.quantidade;
	}

	


	@Override
	public String toString() {
		return "ItemPedido [produto=" + produto + ", quantidade=" + quantidade + "]";
	}
}
