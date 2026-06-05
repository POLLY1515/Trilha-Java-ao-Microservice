package POOExercicio1;

public class Program {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Poliana", 33, "Ativo");
		
		System.out.println("Nome:" +  aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Status matricula: " + aluno1.getMatricula());
		
		
	}

}
