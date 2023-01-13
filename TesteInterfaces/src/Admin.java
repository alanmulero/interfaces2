
public class Admin extends Main implements Autentica {

	private AutenticacaoUtil autenticacaoUtil; // Guardando o valor como um atributo.
	// Composição, um depende do outro.

	public Admin() {
		autenticacaoUtil = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha); // delegando
	}

	@Override
	public boolean valida(int senha) {
		return autenticacaoUtil.valida(senha); // Delegando

	}

}
