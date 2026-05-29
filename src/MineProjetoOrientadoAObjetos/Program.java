package MineProjetoOrientadoAObjetos;



public class Program {

	public static void main(String[] args) {
		
		

		Produto produto = new Produto("Arroz", 25.89);
		ItemPedido itemPedido = new ItemPedido(produto, 3);
		itemPedido.calcularSubtotal();
		
		Pedido pedido = new Pedido(itemPedido);
		System.out.println("Produto: "+ produto.getNome());
		System.out.println("Valor unitário R$: "+ produto.getPreco());
		System.out.println("Quantidade: "+ itemPedido.getQuantidade());
		System.out.println("Total R$: "+pedido.calcularTotal());

		
		System.out.println("=================================================");
		Produto produto2 = new Produto("Feijao", 8.90);
		ItemPedido itemPedido2 = new ItemPedido(produto2, 10);
		itemPedido2.calcularSubtotal();
		
		Pedido pedido2 = new Pedido(itemPedido2);
		System.out.println("Produto: " + produto2.getNome());
		System.out.println( "Valor unitário R$:" + produto2.getPreco());
		System.out.println("Quantidade: " + itemPedido2.getQuantidade());
		System.out.println("Total R$: " + pedido2.calcularTotal());
		
		System.out.println("=================================================");

		Produto produto3 = new Produto("Pão doce", 2.00);
		ItemPedido itemPedido3 = new ItemPedido(produto3, 6);
		itemPedido3.calcularSubtotal();
		
		Pedido pedido3 = new Pedido(itemPedido3);
		System.out.println("Produto: " + produto3.getNome());
		System.out.println( "Valor unitário R$:" + produto3.getPreco());
		System.out.println("Quantidade: " + itemPedido3.getQuantidade());
		System.out.println("Total R$: " + pedido3.calcularTotal());
		
		
		
		Produto produto4 = new Produto("Pão de sal",0.50);
		Produto produto5 = new Produto("Achocolatado", 8.99);
		Produto produto6 = new Produto("Polvilho", 6.60);
		Produto produto7 = new Produto("biscoito recheado", 2.95);
		
		
		
		
		


		
	}

}
