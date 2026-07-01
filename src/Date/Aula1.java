package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aula1 {

	public static void main(String[] args) {

		//criando data
		LocalDate hoje = LocalDate.now();
		LocalDate vencimento = LocalDate.of(2026, 6, 10);//.of cria uma data especifica
		
		//Operaçoes com data
		LocalDate daquiASeteDias = hoje.plusDays(7);
		LocalDate mesPassado = hoje.minusMonths(1);
		LocalDate proximoAno = hoje.plusYears(1);
		
		
		
		System.out.println("Hoje:" + hoje);
		System.out.println("Vencimento:" +vencimento);
		System.out.println("Data daqui a sete dias:" +daquiASeteDias);
		System.out.println("Data no mes passado:" +mesPassado);
		System.out.println("Data no proximo ano:" +proximoAno);
		
		//Comparando datas
		
		//isBefore() data anterior
		//isEqual() data é igual
		//isAfter() data é futura
		if(vencimento.isBefore(hoje)) {
			System.out.println("Conta vencida");
		}
		
		
		if(vencimento.isEqual(hoje)) {
			System.out.println("Vence hoje");
		}
		
		//Formatando datas
		
		LocalDate data = LocalDate.of(2026, 7, 23);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Usado para exibir uma data em formato brasileiro
		
		String texto = data.format(formato);
		System.out.println(texto);
		
		
	}

}
