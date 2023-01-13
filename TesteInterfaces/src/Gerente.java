
public class Gerente extends Main implements Autentica {

	// private int senha ; Isso é eliminado
	private AutenticacaoUtil autenticacaoUtil; // Guardar o autenticacaoUtil como um atributo.
	// Composição. Quando um nasce o outro tambem.

	public Gerente() {
		autenticacaoUtil = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha); // Delegando a chamada.
	}

	@Override
	public boolean valida(int senha) {
		return this.autenticacaoUtil.valida(senha);
		// Delegando o metodo

	}

}
