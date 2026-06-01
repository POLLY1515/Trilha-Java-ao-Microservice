package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Poliana");
		nomes.add("Matheus");
		nomes.add("João");
		nomes.add("Isaias");
		nomes.add("Pablo");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		nomes.remove(4);
		
		System.out.println("Removendo Pablo");
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
