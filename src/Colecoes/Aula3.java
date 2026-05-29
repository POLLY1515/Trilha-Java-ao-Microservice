package Colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula3 {

	public static void main(String[] args) {

		//|Set nao aceita elementos duplicados
		
		Set<String> emails = new HashSet<>();
		emails.add("amarante@teo.com.br");
		emails.add("amarante@teo2.com.br");
		emails.add("amarante@teo3.com.br");
		emails.add("amarante@cleo.com.br");
		emails.add("amarante@duda.com.br");
		emails.add("amarante@jose.com.br");
		emails.add("amarante@Maria.com.br");
		emails.add("amarante@teo.com.br");

		for (String email : emails) {
			System.out.println("Email " + email);

		}
		
		//1 HashSet
			//O que é:
			//Conjunto que não permite duplicatas e não garante ordem dos elementos.
			//Características:
			//Elementos armazenados de forma “aleatória” (hash table).
			//Operações add, remove, contains rápidas: O(1) média.
			//Não mantém a ordem de inserção.
			//Quando usar:
			//Quando não importa a ordem dos elementos.
			//Quando você precisa de alto desempenho para inserir, remover e buscar.

		
		//Exemplo:

		HashSet<String> nomes = new HashSet<>();
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Ana");

		//Ordem de impressão pode ser aleatória: Ana, João, Maria ou qualquer outra.

		//2️ LinkedHashSet
		//O que é:
		//Conjunto que não permite duplicatas e mantém a ordem de inserção.
		//Características:
		//Mantém uma lista ligada interna para guardar a ordem em que os elementos foram adicionados.
		//Operações ainda rápidas: O(1) média.
		//Útil quando a ordem importa, mas não precisa de ordenação natural.
		//Quando usar:
		//Quando você quer garantir que os elementos saiam na ordem que foram inseridos.
		//Bom para relatórios, logs ou listas que dependem da sequência de entrada.

		//Exemplo:

		LinkedHashSet<String> nomes2 = new LinkedHashSet<>();
		nomes2.add("Maria");
		nomes2.add("João");
		nomes2.add("Ana");

		//Ordem de impressão: Maria, João, Ana ✅

		//3️ TreeSet
		//O que é:
		//Conjunto que não permite duplicatas e mantém os elementos ordenados automaticamente.
		//Características:
		//Baseado em árvore rubro-negra (red-black tree).
		//Operações custam O(log n).
		//Ordenação natural (numérica crescente, alfabética) ou por Comparator.
		//Quando usar:
		//Quando você precisa que os elementos fiquem sempre ordenados.
		//Bom para rankings, listas classificadas, filtragem de dados em ordem.

		//Exemplo:

		TreeSet<Integer> numeros = new TreeSet<>();
		numeros.add(50);
		numeros.add(10);
		numeros.add(30);

		//Ordem de impressão: 10, 30, 50 ✅
	}

}
