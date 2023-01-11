
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente larissa = new Cliente();
		
		larissa.nome = "Larissa Bandeira de Jesus";
		larissa.cpf = "222.222.222.22";
		larissa.profissao = "analista";
		
		Conta contaDaLarissa = new Conta();
		contaDaLarissa.deposita(100);
		
		contaDaLarissa.titular = larissa; // composição
				
				System.out.println(contaDaLarissa.titular);
				System.out.println(larissa);
				
	}
	
}
