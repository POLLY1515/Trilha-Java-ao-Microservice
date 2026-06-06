package POOExercicio5;

public class TaxaPessoaFisica implements CalculadoraTaxa {


	@Override
	public double calcular(double valor) {
		double calculo = valor * 0.10;
		return calculo;
	}


	
}
