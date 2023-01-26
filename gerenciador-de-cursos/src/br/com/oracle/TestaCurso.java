package br.com.oracle;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
		
		System.out.println(aulas == javaColecoes.getAulas());
		System.out.println("------");
		javaColecoes.adiciona(new Aula("Trabalhando com  ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleçoes", 22));
		
		System.out.println(aulas);
		
		
	}
	
}
