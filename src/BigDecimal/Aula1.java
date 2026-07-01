package BigDecimal;

import java.math.BigDecimal;

public class Aula1 {

	public static void main(String[] args) {

		BigDecimal preco = new BigDecimal("99.90");
		BigDecimal frete = new BigDecimal("15.00");
		
		BigDecimal total = preco.add(frete);
		
		System.out.println(preco);
		System.out.println(frete);
		System.out.println(total);

//Usar String evita erros de precisao vindo do double 

	}

}
