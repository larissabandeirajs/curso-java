public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setContaCorrente(1337); //set inserir
		
		System.out.println(conta.getContaCorrente()); // get pegar
		
		conta.setAgencia(666); // inserir informação
		
		System.out.println(conta.getAgencia());
		
		Cliente Larissa = new Cliente();
		
		conta.setTitular(Larissa);
		
	    Larissa.setNome("Larissa Bandeira de Jesus");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programadora");
		
		System.out.println(conta.getTitular().getProfissao());
		
		// *****SEGUNDA OPÇÃO ****
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programadora");
		
		
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		
	}

}
