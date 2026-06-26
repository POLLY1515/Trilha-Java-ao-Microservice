package MineProjetoDePedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<String> itens = new ArrayList<>();
	private StatusPedido status = StatusPedido.ABERTO;
	
	public void adicionarItem(String item) {
		if(status != StatusPedido.ABERTO) {
			throw new RegraNegocioException("Pedido não aceita novos intens!");
		}
		
		if(item == null || item.isBlank()) {
			throw new RegraNegocioException("Item inválido!");
				
		}
		
		itens.add(item);
	}
	
	public void finalizar() {
		if(itens.isEmpty()) {
			throw new RegraNegocioException("Pedido precisa ter pelo menos um item");
			
		}
		
		if(status != StatusPedido.ABERTO) {
			throw new RegraNegocioException("Somente pedido aberto pode ser finalizado");
			
		}
		
		status = StatusPedido.FECHADO;
	}

}
