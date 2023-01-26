package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta no Bytebank.
 * 
 * @author Larissa Bandeira de Jesus
 *
 */

public abstract class Conta extends Object implements Comparable<Conta> {
	
  protected double saldo;  
  private int agencia;
  private int ContaCorrente;
  private Cliente titular; // classe de Cliente recebe titular  
  private static int total = 0;
  
  /**
   * Construtor para inicializar o objeto conta a partir da agencia e numero (ContaCorrente).
   * 
   * @param agencia
   * @param ContaCorrente
   */
  
  	
  public Conta(int agencia, int ContaCorrente) {
  		Conta.total++;
  		this.agencia = agencia;
  		this.ContaCorrente = ContaCorrente;
  		//System.out.println("Estou criando uma conta " + this.ContaCorrente);
  		
  	}
    
  public abstract void deposita(double valor);
  
  /**
   * Valor precisa ser maior do que o saldo.
   * 
   * @param valor
   */
   
  public void retirar(double valor) {
	 
	    this.saldo = this.saldo - valor;
 }
 
  public void saca(double valor) throws SaldoInsuficienteException{
	
    	if(this.saldo < valor) {	
    		//problema
 		throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);    
    	}
    	
    	this.saldo = this.saldo - valor;
		// utilização padrao this.saldo -= valor;    	
    }
    	
  public void transfere(double valor, Conta destino) throws SaldoInsuficienteException { 
            this.saca(valor);
            destino.deposita(valor); 
    	
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
  
  @Override
  public boolean equals(Object ref) {
	  
	  Conta outra = (Conta) ref;
	  
	  if(this.agencia != outra.agencia) {
		  return false;
	  }
	  
	  if(this.ContaCorrente != outra.ContaCorrente) {
		  return false;
	  }
	  
	  return true;
	  
  }
  
  @Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo); 
	}
  
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta: " + this.ContaCorrente + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}
    	
   	
}