package POOExercicio5;

public class PagamentoService  {

		private CalculadoraTaxa calculadoraTaxa;

		public PagamentoService(CalculadoraTaxa calculadoraTaxa) {
			this.calculadoraTaxa = calculadoraTaxa;
		}
		
		

		public double calcularValorFinal(double valor) {
			return valor + calculadoraTaxa.calcular(valor);
		}
	
	
	

}
