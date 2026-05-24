package ConversaoDeTipos;

public class Aula1 {

	public static void main(String[] args) {


		int idade = 25;
		double idadeComoDecimal = idade;
		
		System.out.println(idadeComoDecimal);
		
		//casting 
		// Casting é a conversão de um valor de um tipo de dado para outro,
		// podendo ser automática quando não há perda de dados ou explícita
		// quando o programador força a conversão.
		
		double preco = 19.99;
		int precoInteiro = (int) preco;
		
		System.out.println(precoInteiro);
		
		//string para numero
		
		String numeroTexto = "25";
		int numero = Integer.parseInt(numeroTexto);
		
		String numTexto = "19.90";
		double num = Double.parseDouble(numTexto);
		
		System.out.println(numero);
		System.out.println(num);
	}

}
