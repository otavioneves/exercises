package com.otavio.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int [vetorA.length];
		
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print("Digite o " + (i+1)+"� n�mero: ");
			vetorA[i] = scanner.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		System.out.println();
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();

		for (int i=0;i<vetorA.length;i++) {
			System.out.print(vetorB[i] + " ");
			
		}
		
		scanner.close();
		
	}

}
