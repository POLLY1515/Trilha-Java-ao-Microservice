package ExceptionsExercicio5;

import MineProjetoDePedidos.RegraNegocioException;

public class Pedido {

	private StatusPedido status = StatusPedido.ABERTO;
	
	public void cancelarPedido() {
		if(status != StatusPedido.ABERTO) {
			throw new RegraNegocioException("O pedido nao poder cancelado, pois aindaão foi aberto");
		}
		 status = StatusPedido.CANCELADO;
	}
}
