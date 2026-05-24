package LacosDeRepeticao;

public class Aula1 {

	public static void main(String[] args) {
			//FOR
			// for é uma estrutura de repetição usada quando geralmente sabemos
			// quantas vezes o bloco de código deve ser executado.				
			for(int i = 0; i<= 20; i++) {
				
					System.out.println(i);
				}
				
				//===================================
				
				//WHILE
				// while é uma estrutura de repetição usada quando o bloco deve continuar
				// executando enquanto uma condição for verdadeira.
				
				
				int contador = 1; 
				while(contador != 30) {
					System.out.println("Estamos no numero: " + contador);
					contador++;
				}
				//=====================================
				
				//FOR EACH
				// forEach é usado para percorrer todos os elementos de uma coleção ou array,
				// executando uma ação para cada item.
				
				String[] nomes = {"Ana", "Maria","Bruno", "Carla"};
				
				for(String nome: nomes) {
					// Para cada item do tipo Tipo, -> String
					// guarde temporariamente esse item na variável, ->nome
					// vindo de dentro da coleção ou array. -> nomes
					System.out.println(nome);
				}
	}

}
