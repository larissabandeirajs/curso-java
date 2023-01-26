package br.com.oracle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Larissa Bandeira");
		alunos.add("Alberto Silva");
		alunos.add("Maria Pereira");
		alunos.add("Nico Steppat");
		
		boolean LarissaEstaMatriculado = alunos.contains("Larissa Bandeira");
		
		alunos.remove("Maria Pereira");
		
		System.out.println("Esta matriculado: " + LarissaEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	 
//		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
		
	}

}
