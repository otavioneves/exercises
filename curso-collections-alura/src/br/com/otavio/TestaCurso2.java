package br.com.otavio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Cole��es", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
	}

}
