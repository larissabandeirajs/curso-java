package br.com.oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaLiscaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayList", 21);
		Aula a2 = new Aula("Lista de ibjetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		System.out.println("----------Ordenacao-----------");
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
//		Ordenação entre aulas e minutos, utilizando dois crierios
//		00
		
		System.out.println("----------Ordenacao com tempo-----------");
		
//		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
