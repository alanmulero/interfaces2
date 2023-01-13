
public class Executa {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(11);
		
		gerente.nome = "alan";
		System.out.println(gerente.nome);
		gerente.valida(11);
		
		
//		Sistema
//		teste barra
		Sistema sistema = new Sistema();
		sistema.autenticavel(gerente);
		
		// vendedor
		Vendedor vendedor = new Vendedor();
    	vendedor.nome = "Maria";
    	System.out.println(vendedor.nome);
//		vendedor.valida(11);
//		sistema.autenticavel(vendedor);
    	
    	// Admin
    	Admin admin = new Admin();
    	admin.setSenha(8);
    	sistema.autenticavel(admin);
//		
	}

}
