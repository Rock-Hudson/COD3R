package arrays;

import java.util.Arrays;

public class exercicios {

	public static void main(String[] args) {
		
		// Declaranado um arry unidimensional
		double[] notasAlunosA = new double[3];
		notasAlunosA[0] = 7.9; //definindo o valor do primeiro indice
		notasAlunosA[1] = 6.6; //definindo o valor do segundo indice
		notasAlunosA[2] = 5.0; //definindo o valor do Terceiro indice

		//Utilizando método "Arrays" para imprimir de forma mais eficaz
		System.out.println(Arrays.toString(notasAlunosA));

		//Criando um for para varrer o array e somar os valores 
		double totaNotasAlunoA = 0;

		//Sempre utilizar o array.length para retornar o tamanho do array.
		for (int i = 0; i < notasAlunosA.length; i++) {

		totaNotasAlunoA += notasAlunosA[i];
		
		}
		 //Imprimindo e dividindo os valores do array notasAlunosA por 3.
		System.out.println(totaNotasAlunoA / 3);
		
		double [] notasAlunoB = {7.5, 2.4, 0, 10};
		
		double totalB = 0;
		
		for(int b = 0; b < notasAlunoB.length; b++) {
			
			totalB += notasAlunoB[b];
			
		}
		
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.println(totalB / notasAlunoB.length);
		
		
	}

}
