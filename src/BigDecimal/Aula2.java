package BigDecimal;

import java.math.BigDecimal;

public class Aula2 {

	public static void main(String[] args) {

		BigDecimal valor = new BigDecimal("100.00");
		BigDecimal taxa = new BigDecimal("10.00");
		
		BigDecimal a = new BigDecimal("10.0");
		BigDecimal b = new BigDecimal("10.00");

		
		BigDecimal soma = valor.add(taxa);
		System.out.println(soma);
		
		BigDecimal subtracao = valor.subtract(taxa);
		System.out.println(subtracao);
		
		BigDecimal multiplicacao = valor.multiply(taxa);
		System.out.println(multiplicacao);
		
		BigDecimal divisao = valor.divide(new BigDecimal("2"));
		System.out.println(divisao);

		System.out.println(a.equals(b));// Equal considera comsidera igualde exata(Valor + formato)
		System.out.println(a.compareTo(b)); //CompareTo, faz a comparacao do valor matematico

		//Big decimal é imutável, cada operacao devolve um novo bigDecimal
	}

}
