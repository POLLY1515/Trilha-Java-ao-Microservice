package Exercicios;

import MineProjetoDePedidos.RegraNegocioException;

public class Usuario {
	
	private String nome;
	private String email;
	
	
	
	public Usuario(String nome, String email) {
		if(nome == null || nome.isEmpty()) {
			throw new RegraNegocioException("Nome inválido!");
		}
		if(email == null || !this.email.contains("@")) {
			throw new RegraNegocioException("Email inválido!");
		}
		this.nome = nome;
		this.email = email;
	}
	
	

}
