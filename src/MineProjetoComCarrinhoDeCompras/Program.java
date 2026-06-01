package MineProjetoComCarrinhoDeCompras;

public class Program {

	public static void main(String[] args) {

		Produto produto = new Produto("Tenis nake", 345.90);
		Produto produto2 = new Produto("Bolsa prada", 499.90);
		Produto produto3 = new Produto("Oculos de sol", 567.00);
		
		ItemCarrinho tenis = new ItemCarrinho(produto, 5);
		ItemCarrinho bolsa = new ItemCarrinho(produto2, 10);
		ItemCarrinho oculos = new ItemCarrinho(produto3, 15);
		
		Carrinho carrinho = new Carrinho();
		carrinho.adicionar(tenis);
		carrinho.adicionar(bolsa);
		carrinho.adicionar(oculos);
		
		System.out.println("============= Compras ==============");
		System.out.println("Item: " + produto.getNome());
		System.out.println("Valor unitário: "+ produto.getPreco());
		System.out.println("Quantidade: "+ tenis.getQuantidade());
		System.out.println("Subtotal: " + tenis.subTotal());
		System.out.println("======================================");
		System.out.println("Item: " + produto2.getNome());
		System.out.println("Valor unitário: "+ produto2.getPreco());
		System.out.println("Quantidade: "+ bolsa.getQuantidade());
		System.out.println("Subtotal: " + bolsa.subTotal());
		System.out.println("======================================");
		System.out.println("Item: " + produto3.getNome());
		System.out.println("Valor unitário: "+ produto3.getPreco());
		System.out.println("Quantidade: "+ oculos.getQuantidade());
		System.out.println("Subtotal: " + oculos.subTotal());
		System.out.println("======================================");

		System.out.println("Total: " + carrinho.calcularTotal());
		
		
	}

}
