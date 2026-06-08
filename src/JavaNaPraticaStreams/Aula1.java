package JavaNaPraticaStreams;

import java.util.Arrays;
import java.util.List;

public class Aula1 {

	public static void main(String[] args) {

		List<String> nomes = Arrays.asList("Pablo","Josiane", "Beatriz","Joana","André");
		//Percorrendo a lista com for
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		//Percorendo a lista com stream
		
		nomes.stream().forEach(nome -> System.out.println(nome));
		//Mais curto 
		nomes.stream().forEach(System.out::print);
		
		//Filter
		nomes.stream()
	     .filter(nome -> nome.startsWith("A"))
	     .forEach(System.out::println);
		
		//Map
		nomes.stream()
		.map(nome -> nome.toUpperCase())//Transformar nomes em letras maiusculas
		.forEach(System.out::print);
		
		nomes.stream()
	     .filter(nome -> nome.startsWith("A"))
	     .forEach(System.out::println);
		
		/*Se fizermos:

			nomes.stream()

			Significa:

			Peguei a lista nomes
			Abri um fluxo de elementos que posso percorrer (forEach),	
			filtrar (filter), transformar (map) ou coletar (collect)
			Ainda não mexi na lista original, estou apenas criando uma 
			pipeline de processamento

			Então esta linha:

			nomes.stream().forEach(System.out::println);

			lê-se:

		“Transforme a lista nomes em um fluxo e, para cada elemento desse fluxo,	
		 imprima na tela.”

💡		 Resumo simples:

			lista.stream() → abre a lista para ser processada passo a passo
		 * É como olhar a lista com uma lupa e fazer coisas com cada elemento,
		 *  sem alterar a lista original.
		 *  
		 *  
		 *  1️⃣ Expressão genérica de um Stream
			colecao.stream()
       		.operacao1(parametro1)
       		.operacao2(parametro2)
       ...
       			.operacaoN(parametroN)
       			.terminalOperation();

				Explicando:

			Parte	Significado
			colecao	Qualquer lista, conjunto ou array que você quer processar
			.stream()	Abre um fluxo de elementos da coleção
			.operacao1(), .operacao2()	Operações intermediárias: 
			filtragem (filter), transformação (map), ordenação (sorted),
			 limite (limit)…
			.terminalOperation()	Operação final que fecha o fluxo: imprime (forEach),
			 coleta em lista (collect), soma (sum), conta elementos (count)…
			 
		2️⃣ Operações intermediárias mais comuns
			Operação	O que faz
		filter(x -> condição)	Seleciona apenas elementos que cumprem a condição
		map(x -> transformação)	Transforma cada elemento em outro
		sorted()	Ordena elementos naturais (ou sorted(comparator) para customizado)
		distinct()	Remove elementos duplicados
		limit(n)	Pega apenas os primeiros n elementos
		skip(n)	Ignora os primeiros n elementos

		Essas operações não mudam a coleção original, só definem o que será processado.

		3️⃣ Operações finais (terminal)
		Operação	O que faz
		forEach(x -> ação)	Percorre e faz algo com cada elemento
		 (imprimir, somar, etc.)
		collect(Collectors.toList())	Cria uma nova lista com os elementos processados
		count()	Conta quantos elementos passaram
		reduce()	Combina todos os elementos em um único valor (ex: soma, multiplicação)
		anyMatch(condição)	Retorna true se algum elemento cumprir a condição
		4️⃣ Exemplo genérico completo
		
		List<String> lista = Arrays.asList("Ana", "João", "Carlos", "Amanda");

		List<String> resultado = lista.stream()   // abre o fluxo
                              .filter(nome -> nome.startsWith("A"))  // filtra
                              .map(nome -> nome.toUpperCase())       // transforma
                              .sorted()                              // ordena
                              .collect(Collectors.toList());         // coleta em lista

		resultado.forEach(System.out::println);

		Resultado:

		ANA	
		AMANDA

	✅ Resumo prático:

	Sempre começa com colecao.stream().
	Coloque quantas operações intermediárias precisar (filter, map, sorted, etc.).
	Finalize com uma operação terminal (forEach, collect, count, reduce).
		 * 
		 * */
	}

}
