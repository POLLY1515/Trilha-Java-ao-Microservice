package ProjetoControlePedidos;

import java.math.BigDecimal;

public class Produto {

	
	private int codigoProduto;
	private String nomeProduto;
	private BigDecimal preco;
	private String categoria;
	
	
	
	
	public Produto(int codigoProduto, String nomeProduto, BigDecimal preco, String categoria) {
		super();
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.categoria = categoria;
	}




	public Produto() {
		super();
	}




	public int getCodigoProduto() {
		return codigoProduto;
	}




	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}




	public String getNomeProduto() {
		return nomeProduto;
	}




	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}




	public BigDecimal getPreco() {
		return preco;
	}



	public String getCategoria() {
		return categoria;
	}




	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}




	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", preco=" + preco
				+ ", categoria=" + categoria + "]";
	}
	
	
}
