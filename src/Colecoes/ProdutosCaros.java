package Colecoes;

public class ProdutosCaros {
	
	private String nome;
	private double preco;
	
	
	public ProdutosCaros(String nome, double preco) {
		if(preco <= 0) {
			throw new IllegalArgumentException("Valor inválido!");
		
		}
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	@Override
	public String toString() {
		return "ProdutosCaros [nome=" + nome + ", preco=" + preco + "]";
	}

	
	

}
