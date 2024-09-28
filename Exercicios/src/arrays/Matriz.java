package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Matriz {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos alunos existem na turma: ");
		int quantidadeAlunos = input.nextInt();
		
		System.out.println("Quantas notas irão ser inseridadas: ");
		int quantidadeNotas = input.nextInt();
		
		double notas[][] = new double [quantidadeAlunos] [quantidadeNotas];
		
		double total = 0;
		
		 for(int a = 0; a < notas.length; a++) {
			 
			 for(int n = 0; n < notas[a].length; n++ ) {
				 
				 System.out.printf("Informe a nota %d do aluno %d ", 
						 n + 1, a + 1);
				 notas[a][n] = input.nextDouble();
				 total += notas[a][n];
				 
			 }
			 
		 }
		 
		 
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("Média da turma é: " + media);
		
		for(double notasAlunos[]: notas) {
			
			System.out.println(Arrays.toString(notasAlunos));			
			
		}
		
		input.close();
		
		
		
		
		
		
	}
	
	
	
}
