package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
 		int quantidadeNota = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			
		System.out.println("Insira o valor da nota para somar e calcular a media \nDigite -1 ou sair para finalizar,");
		nota = entrada.nextDouble();
		
		if(nota <= 10 && nota >= 0) {
			
			total += nota;
			quantidadeNota++;
		} else if (nota > 10){
			System.out.println("Nota Invalida!!!");
			}
		}	
		
		double media = total / quantidadeNota;
		System.out.println("A media foi de: " + media);
		
		
		entrada.close();
	}
}
