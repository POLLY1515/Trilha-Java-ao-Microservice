package ExceptionsExceptionExercicio3;

public class ControleAcesso {
	

	public boolean podeAcessarAdmin(NivelUsuario nivel) {
		return nivel == NivelUsuario.ADMIN
		|| nivel == NivelUsuario.MASTER;
	}
}
