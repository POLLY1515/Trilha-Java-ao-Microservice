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
	public int hashCode() {
		return Objects.hash(produto, quantidade);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		return Objects.equals(produto, other.produto) && quantidade == other.quantidade;
	}


	@Override
	public String toString() {
		return "ItemPedido [produto=" + produto + ", quantidade=" + quantidade + "]";
	}
}
