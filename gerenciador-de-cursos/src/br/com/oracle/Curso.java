package br.com.oracle;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer,Aluno> matriculaParaAluno = new LinkedHashMap<>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // nao deixar modificar
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
        + ", aulas: + " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
	    // adiciona no Set de alunos
	    this.alunos.add(aluno);
	    // cria a relação no Map
	    this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno a1uno) {
		return this.alunos.contains(a1uno);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();
		}
	    return matriculaParaAluno.get(numero);
	}
}
