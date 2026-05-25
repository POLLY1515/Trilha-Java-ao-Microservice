package MineProjetoOrientadoAObjetos;

public class Pedido {
	
	private ItemPedido item;

	public Pedido(ItemPedido item) {
		this.item = item;
	}
	
	
	
	public void setItem(ItemPedido item) {
		this.item = item;
	}



	public ItemPedido getItem() {
		return item;
	}



	@Override
	public String toString() {
		return "Pedido [item=" + item + "]";
	}



	public double calcularTotal() {
		return item.calcularSubtotal();
	}
	
	

}
