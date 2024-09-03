package Desafios;

import java.util.Scanner;

public class DesafioConversao {

	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor do salario de janeiro: ");
		String salario1 = input.nextLine();
		double salario1Convertido = Double.parseDouble(salario1);
		
		System.out.println("Insira o valor do salario de janeiro: ");
		String salario2 = input.nextLine();
		double salario2Convertido = Double.parseDouble(salario2);
		
		
		
		System.out.println("Insira o valor do salario de janeiro: ");
		String salario3 = input.nextLine();
		double salario3Convertido = Double.parseDouble(salario3);
		
		double mediaSalario = salario1Convertido + salario2Convertido + salario3Convertido;
		
		System.out.println("Media:" + mediaSalario);
		
	}
	
	
}
