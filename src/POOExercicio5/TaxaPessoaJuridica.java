package POOExercicio5;

public class TaxaPessoaJuridica implements CalculadoraTaxa{

	@Override
	public double calcular(double valor) {
		 double calculo = valor * 0.15;
		return calculo;
	}

}
