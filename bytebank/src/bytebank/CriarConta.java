package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Conta primeiraConta = new Conta();
		  primeiraConta.saldo = 200;
		  primeiraConta.agencia = 0605;
		  primeiraConta.ContaCorrente = 666;
		  primeiraConta.titular = "Larissa Bandeira de Jesus";
		  
		  System.out.println("Seja bem vindo! ");
	      System.out.println("Saldo: " + primeiraConta.saldo);
	      System.out.println("Agencia: " +primeiraConta.agencia);
	      System.out.println("Conta Corrente: " + primeiraConta.ContaCorrente);
	      System.out.println("Titular: " + primeiraConta.titular);
	      
	      System.out.println();
		
	Conta segundaConta = new Conta();
	      segundaConta.saldo = 3000;
	      segundaConta.agencia = 1208;
	      segundaConta.ContaCorrente = 131;
	      segundaConta.titular = "Nathalia Strehl Amoros";
	      
	      System.out.println("Seja bem vindo! ");
	      System.out.println("Saldo: " + segundaConta.saldo);
	      System.out.println("Agencia: " +segundaConta.agencia);
	      System.out.println("Conta Corrente: " + segundaConta.ContaCorrente);
	      System.out.println("Titular: " + segundaConta.titular);
		
		
	}

}
