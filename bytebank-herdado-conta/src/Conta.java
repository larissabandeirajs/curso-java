
public abstract class Conta {
  protected double saldo;
  private int agencia;
  private int ContaCorrente;
  private Cliente titular; // classe de Cliente recebe titular  
  private static int total = 0;
  
  	
  	public Conta(int agencia, int ContaCorrente) {
  		Conta.total++;
  		this.agencia = agencia;
  		this.ContaCorrente = ContaCorrente;
  		//System.out.println("Estou criando uma conta " + this.ContaCorrente);
  		
  	}
    
    public abstract void deposita(double valor);
   
    public void retirar(double valor) {
	 
	    this.saldo = this.saldo - valor;
 }
 
    public boolean saca(double valor) {
	
    	if(this.saldo >= valor) {	
 		    this.saldo	= this.saldo - valor;
 		    // utilização padrao this.saldo -= valor;
 		    
 		    return true;

    	}else {
    		
    		return false;
    		
    	}
    }
    	
    	public boolean transfere(double valor, Conta destino) { 
            if(this.saca(valor)) { 
                destino.deposita(valor); 
                return true;
            } else {
                return false;
            }
    	
 }
    	
    	public double getSaldo() {
    		return this.saldo;
    	
    }
       public int getContaCorrente() {
    	   return this.ContaCorrente;
       } 
       
       public void setContaCorrente(int novaContaCorrente){ //altera um atributo e nao devolve nada utilizar VOID
    	   if(ContaCorrente <=0) {
    		   System.out.println("Não pode valor menor igual a 0");
    		   return;
    	   }
    	   this.ContaCorrente = novaContaCorrente;
    	   
       }
       
       public int getAgencia() {
    	   return this.agencia;
       }
       
       public void setAgencia(int novaAgencia) {
    	   if(agencia <=0) {
    		   System.out.println("Não pode valor menor igual a 0");
    		   return;
    	   }
    	   this.agencia = novaAgencia;
       }
    	
    	
    	
       public void setTitular(Cliente titular) {
    	   this.titular = titular;
       }
       
       public Cliente getTitular() {
           return titular;
       }
    
      
    public static int getTotal() {
    	return Conta.total;
    }	
    	
    	
    	
}