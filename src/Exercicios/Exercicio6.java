package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {

	public static void main(String[] args) {

		/*Crie uma List<Double> com notas.
		 *  Calcule a media usando for-each.
		 *   Mostre se a
			media e maior ou igual a 75.
		 */
		
		
		List<Double> notas = new ArrayList<>();
		notas.add(9.9);
		notas.add(5.0);
		notas.add(10.0);
		notas.add(10.0);
		
		double soma = 0;
		for (Double nota : notas) {
			soma += nota;
		}
		double media = soma / notas.size();
		System.out.println("Nota final:" + media);
		if(media < 7) {
			System.out.println("Reprovado"); 
		}else {
			System.out.println("Aprovado!");
		}
		
	}
	

}
