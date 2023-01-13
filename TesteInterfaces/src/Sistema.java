
public class Sistema {
	private int senha = 11;
	
	public void autenticavel(Autentica conta) {
	//	boolean check = conta.valida(senha);
		if (conta.valida(senha)) {
			System.out.println("Pode entrar no sistema");
			
			
		}else {
			System.out.println("Não pode entrar no sistema");
			
		}
	}

}
