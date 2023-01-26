package br.com.oracle;

public class TestaBuscaAlunosNoCurso {
 
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
		
		System.out.println("Quem eh o aluno com a matricula 666777 ");
		
		Aluno aluno = javaColecoes.buscaMatriculado(66677);

		
		System.out.println("Aluno: " + aluno);
		
		
 }
}
