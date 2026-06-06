package POOExercicio4;

public class Produtos implements Descontavel {

	private String nome;
	private double preco;
	
	
	
	public Produtos(String nome, double preco) {
		super();
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



	public void setPreco(double preco) {
		this.preco = preco;
	}



	@Override
	public double calcularDesconto(double taxa) {
		double desconto = 	this.getPreco() * (taxa / 100);	
		return desconto;
	}




		
	}
	
	

