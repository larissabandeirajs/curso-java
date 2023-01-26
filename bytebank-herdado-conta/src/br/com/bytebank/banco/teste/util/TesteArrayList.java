package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
	
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 11);
		lista.add(cc2);

		System.out.println("Quantidade de contas: "+ lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getContaCorrente());
		
		lista.remove(0);
		
		System.out.println("Quantidade de contas: " + lista.size());
		
		Conta cc3 = new ContaCorrente(13, 77);
		lista.add(cc);
		System.out.println(cc3);
		
		Conta cc4 = new ContaCorrente(18, 66);
		lista.add(cc2);
		System.out.println(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
//			Object oRef = lista.get(i);
			System.out.println(lista.get(i));
		}
		System.out.println("---------");
		System.out.println("Utilizada a forma atual:");
		
//		for(Object oRef : lista){
//			System.out.println(oRef);
//		}
		
		for(Conta conta : lista){
			System.out.println(conta);
		}
		
		System.out.println("Quantidade de contas atual: "+ lista.size());
	}

}
