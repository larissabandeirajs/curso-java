
public class Conta {
  private double saldo;
  private int agencia;
  private int ContaCorrente;
  private Cliente titular; // classe de Cliente recebe titular  
    
    public void deposita(double valor) {
    	
    	this.saldo = this.saldo + valor;
    }
   
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
            if(this.saldo >= valor) { 
                this.saldo -= valor; 
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
       
       public int getAgencia() {
    	   return this.agencia;
       }
       
       public void setAgencia(int novaAgencia) {
    	   this.agencia = novaAgencia;
       }
    	
    	
       public void setContaCorrente(int novaContaCorrente){ //altera um atributo e nao devolve nada utilizar VOID
    	   
    	   this.ContaCorrente = novaContaCorrente;
    	   
       }
    	
       public void setTitular(Cliente titular) {
    	   this.titular = titular;
       }
       
       public Cliente getTitular() {
           return titular;
       }
    
      
    	
    	
    	
    	
}