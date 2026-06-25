package POOExercicio4;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Produtos> produto = new ArrayList<>();
		produto.add(new Produtos("Liquidificador", 89.90));
		produto.add(new Produtos("Ar condicionado", 7889.90));
		produto.add(new Produtos("Tv 40 polegadas", 4689.90));
		produto.add(new Produtos("Tv 55 polegadas", 4690.80));
		produto.add(new Produtos("Tv 65 polegadas", 4990.80));
		produto.add(new Produtos("Microondas", 700.97));
		produto.add(new Produtos("Secador Mondial", 345.90));
		produto.add(new Produtos("Secador phillco", 567.90));
		produto.add(new Produtos("Prancha ceramica Mondial", 189.90));
		produto.add(new Produtos("Prancha Taiff titanium", 489.90));
		produto.add(new Produtos("Prancha ceramica phillco", 899.90));
		produto.add(new Produtos("Sanduicheira Mondial", 49.90));
		produto.add(new Produtos("Barbeador Mondial", 89.90));
		produto.add(new Produtos("Lava e seca Britania", 6000.90));
		produto.add(new Produtos("Liquidificador copo de vidro", 289.90));

		for (Produtos produtos : produto) {
			double desconto = produtos.calcularDesconto(40);
			double valorComDesconto = produtos.getPreco() - desconto;
			
			System.out.println("Nome produto: " + produtos.getNome());
			System.out.println("Preço sem desconto: " + produtos.getPreco());
			System.out.println("Desconto R$: " + desconto);
			System.out.println("Total com desconto R$: " + valorComDesconto);
			System.out.println("=====================================================");


		}
		
		produto.stream()
		.filter(prod -> prod.getPreco() < 120.00)
		.forEach(System.out::println);
	}

}
