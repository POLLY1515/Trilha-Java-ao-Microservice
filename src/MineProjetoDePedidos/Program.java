package MineProjetoDePedidos;

public class Program {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		
		pedido.adicionarItem("Notbook");
		pedido.adicionarItem("Mouse");
		pedido.finalizar();
		System.out.println("Pedido finalizado");
	}

}
