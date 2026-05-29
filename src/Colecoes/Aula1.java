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
		System.out.println("===========================================");
		
		nomes.set(1, "Lucas");
		
		for (String nome : nomes) {
			System.out.println("Nome: "+ nome);
		}
		
		System.out.println("Buscando elemento por indice :" + nomes.get(0));
		System.out.println("Removendo elemento da lista: " + nomes.remove(2));
		for (String nome : nomes) {
			System.out.println("Nome: "+ nome);
		}
		
		
		System.out.println("===========================================");

		for (String nome : nomes) {
			System.out.println("Nome: "+ nome);
		}
		System.out.println("Retornado a quantidade de elementos: " + nomes.size());
		System.out.println("Verificando se a lisyta esta vazia: " + nomes.isEmpty());
	}

}
