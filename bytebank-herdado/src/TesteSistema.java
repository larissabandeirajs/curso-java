
public class TesteSistema {
	
	public static void main(String[] args) {
		
		
		Gerente g = new Gerente();
		 g.setSenha(1234);
		
		Administrador admin = new Administrador();
	 	admin.setSenha(123);
	 	
	 	Cliente cliente = new Cliente();
	 	cliente.setSenha(666);
		
		SistemaInterno si = new SistemaInterno();
		 si.autentica(g);
		 si.autentica(admin);
		 si.autentica(cliente);
	}

}
