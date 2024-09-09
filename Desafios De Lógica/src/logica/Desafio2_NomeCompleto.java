package logica;

import java.util.Scanner;


// Exercicio
public class Desafio2_NomeCompleto {
		
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos concatenar o seu nome.\nInsira o primeiro nome:");
		String primeiroNome = input.nextLine();
		
		System.out.println("Insira o Segundo nome:");
		String segundoNome = input.nextLine();
		
		
		System.out.println("Nome completo:" + primeiroNome+ " "+ segundoNome);
		
		
	}
	
	

	
	
}
