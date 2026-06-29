package ExceptionsExercicio4;

import MineProjetoDePedidos.RegraNegocioException;

public class Tarefa {

	private StatusTarefa status = StatusTarefa.PENDENTE;
	public void concluir() {
		if(status == StatusTarefa.CONCLUIDA) {
			throw new RegraNegocioException("Tarefa ja esta concluida");
		}
			status = StatusTarefa.CONCLUIDA;
	}
}
