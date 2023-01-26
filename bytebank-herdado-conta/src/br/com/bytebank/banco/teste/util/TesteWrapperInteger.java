package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		 
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; // Integer
		
//		Integer idadeRef = new Integer(29);
		
		Integer idadeRef = new Integer(29); // autoboxing
		System.out.println(idadeRef.intValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); // unboxing
		
		String s = args[0]; // "10"
		
//		Integer numero = Integer.valueOf(s);
		
		int numero = Integer.parseInt(s);
		
		System.out.println(numero); // run config..
		
 
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade); // Autoboxing 
		
		System.out.println(idade);
	}

}
