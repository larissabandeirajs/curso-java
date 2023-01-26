package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
        Object[] referencia = new Conta[5];

        System.out.println(referencia.length);
        
        
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencia[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencia[1] = cc2;
        
//        Cliente cliente = new Cliente();
//        cliente.setNome("Larissa");
//        referencia[2] = cliente;
//        
//        
//        
//        Cliente ref1 = (Cliente) referencia[2]; // type cast
//        System.out.println(ref1.getNome());
        
        
        
//         Object referenciaGenerica = contas[1];
//
//        System.out.println(cc2.getNumero());

//        System.out.println( contas[1].getContaCorrente() );

        ContaPoupanca ref = (ContaPoupanca) referencia[1]; // type cast
        System.out.println(cc2.getContaCorrente());
        System.out.println(ref.getContaCorrente());
		
	}

}
