package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import java.lang.*;

//br.com.bytebank.banco.teste.TesteContas
public class TesteContas {
	 
	// java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaEspecial es = new ContaEspecial(777, 666);
		es.deposita(50);
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
	    cc.transfere(10.0, cp);
	    
	    System.out.println("CC:" + cc.getSaldo());
	    System.out.println("CP:" + cp.getSaldo());
	    System.out.println("ES:" + es.getSaldo());
	}
	
}
