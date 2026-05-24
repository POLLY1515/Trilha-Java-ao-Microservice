package MineProjetoOrientadoAObjetos;

public class Pedido {
	
	private ItemPedido item;

	public Pedido(ItemPedido item) {
		this.item = item;
	}
	
	public double calcularTotal() {
		return item.calcularSubtotal();
	}

}
