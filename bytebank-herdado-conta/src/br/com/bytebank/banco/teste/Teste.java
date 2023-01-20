package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {


		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Cliente cliente = new Cliente();
		
		
		Object obcc = new ContaCorrente(22, 33);
		Object obCp = new ContaPoupanca(33, 22);
		Object obCliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		System.out.println(obcc);

		println(obcc);
		println(obCp);
		println(obCliente);
		
		println(cc);
		println(cp);
		println(cliente);
	}

	static void println() {
	}
	
	static void println(int a) {
	}

	static void println(boolean bool) {
	}
	static void println(Object conta) {
	    
	}
	
 
	
}
