package ExceptionsExercicio1;

public class Calculadora {

	
	
	public double dividir(double dividendo, double divisor) {
			if(divisor == 0) {
				throw new IllegalArgumentException("Divisor nao pode ser igual a zero");
			}
			return dividendo / divisor;


		
		
	}
}
