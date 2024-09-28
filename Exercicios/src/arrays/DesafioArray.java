package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o tamanho do vetor: ");
		int tamanhoVetor = entrada.nextInt();
		
		int notas[] = new int[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {

			System.out.println("Insira a nota número " + (i + 1));
			notas[i] = entrada.nextInt();
			System.out.println("Nota número: " + (i + 1) + " foi: " + notas[i]);
			
			
			
			
		}
	}

}
