package Exercicios;

import java.util.HashSet;
import java.util.Set;

public class Exercicio7 {

	public static void main(String[] args) {

		Set<String> email = new HashSet<>();
		email.add("Geovana@gmail.com");
		email.add("Geovana@gmail.com");
		email.add("Geovani@gmail.com");
		email.add("Arthur@gmail.com");
		email.add("Pablo@gmail.com");
		email.add("Arthur@gmail.com");

		for (String emails : email) {
			System.out.println(emails);
		}
	}
	

}
