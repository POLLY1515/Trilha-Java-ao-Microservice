package ExceptionsExercicio2;

public class Usuario {
	private String nome;
	private String email;
	
	
	public Usuario(String nome, String email) {
		if(nome == null || nome.isBlank() ) {
			throw new RegraNegocioException("Nome inválido");
		}if(email == null || !email.contains("@")) {
			throw new RegraNegocioException("Email inválido");

		}
		
		this.nome = nome;
		this.email = email;
	}
	
	

}
