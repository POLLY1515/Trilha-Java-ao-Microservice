package Exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio8 {

	public static void main(String[] args) {
			/*Crie um Map<Integer, String> para associar matricula e nome do aluno. Adicione
				 alunos e busque um deles pela matricula.*/
		
		Map<Integer, String> matricula = new HashMap<>();
		matricula.put(1, "Poliana");
		matricula.put(2, "Jose Carlos");
		matricula.put(3, "Vinívius");
		matricula.put(4, "Patricia");
		matricula.put(5, "Tadeu");
		
		String aluno = matricula.get(4);
		System.out.println(aluno);
		

	}
	

}
