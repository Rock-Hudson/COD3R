package logica;

import java.util.Scanner;

public class Exercicio3_SomaDoisValores {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos Somar dois números! ");
		System.out.println("Insira o Primeiro Número: ");
		double primeiroNumero = input.nextDouble();
		
		System.out.println("Insira o segundo Número:");
		double segundoNumero = input.nextDouble();
		
		double resultado = primeiroNumero + segundoNumero;
		
		System.out.println("O resultado da some é: " + resultado);
		
		input.close();
	}
	
	
	
}
