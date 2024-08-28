package logica;

import java.util.Scanner;

public class Exercicio1_AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Para calcular a area de um triangulo, insira o valor de base e altura:");
		
		System.out.println("Insira o valor de Base: ");
		double inputBase = input.nextInt();
		
		System.out.println("Insira o valor de altura:");
		double inputAltura = input.nextInt();
		
		
		double area = (inputBase * inputAltura)/2;
		
		System.out.println("O valor da Area é:" + area);
		
		
	}
	
	
	
}
