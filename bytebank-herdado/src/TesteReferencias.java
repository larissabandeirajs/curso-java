
public class TesteReferencias {

	public static void main(String[] args) {

		
	Gerente gerente1 = new Gerente();
	gerente1.setNome("Nathalia");
	gerente1.setSalario(5000.0);
	
	
	
	
	EditorVideo ev = new EditorVideo();
	ev.setSalario(1500.0);
	
	
	Designer d = new Designer();
	d.setSalario(2000.0);
	
	ControleBonificacao controle = new ControleBonificacao();
	controle.registra(gerente1);
	controle.registra(ev);
	controle.registra(d);
	 
	System.out.println(controle.getSoma());
	
	

	}

}