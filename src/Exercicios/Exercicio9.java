package Exercicios;

import java.util.ArrayList;
import java.util.List;

import MineProjetoComCarrinhoDeCompras.Produto;

public class Exercicio9 {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Arroz", 32.67));
		produtos.add(new Produto("Feijão", 5.68));
		produtos.add(new Produto("Fuba", 2.30));
		produtos.add(new Produto("Macarrão", 3.29));
		produtos.add(new Produto("Farinha de trigo", 2.95));
		produtos.add(new Produto("Farinha de mandioca", 4.45));
		produtos.add(new Produto("Trigo para quibe", 5.90));
		produtos.add(new Produto("Oleo", 7.99 ));
		produtos.add(new Produto("Lenço umidecido", 15.99 ));
		produtos.add(new Produto("Fralda turma da monica", 45.99 ));
		produtos.add(new Produto("Bico antialergico", 17.80 ));
		produtos.add(new Produto("Pasta dental infatil ", 10.01 ));
		produtos.add(new Produto("Sabonete liquido", 09.99 ));


		
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		System.out.println("Total: " + total);	
		System.out.println("Removendo produtos abaixo de 10 reais");
		produtos.removeIf(produto -> produto.getPreco() < 10);
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + "R$: " + produto.getPreco());
		}


	
		


		

	}

}
