package br.com.oracle;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Nathalia Moura", 666777);
		Aluno a2 = new Aluno("Guilherme Santos", 555444);
		Aluno a3 = new Aluno("Fernanda Ribeiro", 123456);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");

		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O Aluno" + a1 + " esta matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		System.out.println("------------");
		
		Aluno turini = new Aluno("Rodrigo Turini", 88888);
		
		String nome = "Rodrigo Turini";
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 eh == ao Turini? ");
		System.out.println(a1.equals(turini));
		
		// obrigatoriamente o seguinte é true:
		
//		System.out.println(a1.hashCode() == turini.hashCode());
		
		Set<Aluno>alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			
			System.out.println(proximo);
		}
		
//		for (Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
//		

	}

}
