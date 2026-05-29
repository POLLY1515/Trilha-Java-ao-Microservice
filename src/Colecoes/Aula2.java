package Colecoes;

public class Aula2 {

	public static void main(String[] args) {

		//array de numero
		int[] numeros =  {1,23,45,67,89,03,44};
		
		System.out.println(numeros[3]);

		//array de nomes
		
		String[] nomes = {"brabara", "Jussara", "Josiane", "Cintia"};
		System.out.println(nomes[3]);
		
		//Percorrendo um array
		
		for(int i = 0;i < nomes.length; i++ ) {
			System.out.println( "Nome:"+ nomes[i]);
		}
	}

}
