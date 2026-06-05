package POOExercicio3;

public class Gerente extends Funcionario{

	
	@Override
	public double calcularSalarioFinal() {
		double salario = getSalarioBase() * 0.60;
		return salario + getSalarioBase();
		
	}

	
}
