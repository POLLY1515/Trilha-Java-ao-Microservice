package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<ProdutosCaros> produto = new ArrayList<>();
		produto.add(new ProdutosCaros("Meia", 7.90));
		produto.add(new ProdutosCaros("lenço cabelo", 1.99));
		produto.add(new ProdutosCaros("Calça jeans", 168.70));
		produto.add(new ProdutosCaros("Calça Moleton", 198.70));
		produto.add(new ProdutosCaros("Calça Masculina", 145.70));
		produto.add(new ProdutosCaros("Calça feminina moleton", 144.70));
		produto.add(new ProdutosCaros("Calça jeans infantil masculina", 99.70));
		produto.add(new ProdutosCaros("Camisa feminina", 368.70));
		produto.add(new ProdutosCaros("Camisa masculina", 248.70));
		produto.add(new ProdutosCaros("Short jeans", 168.70));
		produto.add(new ProdutosCaros("Bermuda masculino", 168.70));
		produto.add(new ProdutosCaros("Short infantil", 48.70));
		produto.add(new ProdutosCaros("Calcinha de algodão jeans", 38.70));
		produto.add(new ProdutosCaros("Cueca algodão", 16.70));

		System.out.println("Produtos:");
		for (ProdutosCaros produtos : produto) {
			if(produtos.getPreco() > 100) {
				System.out.println("Nome produto: "+ produtos.getNome());
				System.out.println("Preço: " + produtos.getPreco());
			}
		}
	}
	

	

}
