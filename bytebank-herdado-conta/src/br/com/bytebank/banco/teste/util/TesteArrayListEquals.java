package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 12);
//		Conta cc2 = new ContaCorrente(22, 11);
//		
//		boolean igual  = cc1.ehIgual(cc2);
//		
//		System.out.println(igual);
	
//		//Generics
		
		List<Conta> lista = new Vector<Conta>();
		
//		List<Conta> lista = new LinkedList<Conta>();
		
// 		ArrayList<Conta> lista = new ArrayList<Conta>();
 		
 		Conta cc = new ContaCorrente(22, 11);
 		lista.add(cc);
 		
     	Conta cc2 = new ContaCorrente(22, 11);
 		lista.add(cc2);
 		
 		Conta cc3 = new ContaCorrente(22, 11);
 		boolean existe = lista.contains(cc3);
 		
 	 	System.out.println("Ja existe? " + existe);
 	 	
// 	 	for(Conta conta : lista) {
// 	        if(conta.ehIgual(cc3)) {
// 	            System.out.println("Ja tenho essa conta!");
// 	        }
// 	}
 		
 
 		for(Conta conta : lista) {
 			System.out.println(conta);
 		}
 		
		
	}

}
