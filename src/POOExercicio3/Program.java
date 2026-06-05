package POOExercicio3;

public class Program {

	public static void main(String[] args) {

		Funcionario gerente = new Gerente();
		gerente.setNome("Poliana");
		gerente.setSalarioBase(5000);
		System.out.println("Salario gerente " + gerente.getNome()+ " R$:" +  gerente.calcularSalarioFinal());
		
		Funcionario vendedor = new Vendedor();
		vendedor.setNome("Paulo");
		vendedor.setSalarioBase(1900);
		System.out.println("Salario vendedor "+ vendedor.getNome()+ " R$:" +vendedor.calcularSalarioFinal());


	}

}
