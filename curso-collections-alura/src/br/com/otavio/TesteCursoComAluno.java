package br.com.otavio;

import java.util.Collections;
import java.util.Set;

public class TesteCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Cole��es", 22));
		
        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
    
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
	}

}
