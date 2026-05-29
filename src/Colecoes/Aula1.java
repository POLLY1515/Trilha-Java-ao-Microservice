package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Aula1 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Poliana");
		nomes.add("Tadeu");
		nomes.add("Junior");
		nomes.add("Jose");
		
		for (String nome : nomes) {
			System.out.println("Nome: "+ nome);
		}
		
	}

}
