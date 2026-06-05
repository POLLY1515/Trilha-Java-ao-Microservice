package POOExercicio3;

public class Vendedor extends Funcionario {

	@Override
	public double calcularSalarioFinal() {
		
		double salario = getSalarioBase() * 0.10;
		return getSalarioBase() + salario;
	}

}
