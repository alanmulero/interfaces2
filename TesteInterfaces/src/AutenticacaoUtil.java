
public class AutenticacaoUtil {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean valida(int senha) {
		if (this.senha == senha) {
			System.out.println("Senha de Autenticação Util:  ok");
			return true;

		} else {
			System.out.println("Erro na senha de Autenticação util");
			return false;
		}

	}

}
