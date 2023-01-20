package br.com.oracle.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBlibioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(111,222);
		
		c.deposita(200);
		
		System.out.println(c.getSaldo());

	}

}
