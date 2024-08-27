package logica;

import java.util.Scanner;

public class NomeCompleto {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos concatenar o seu nome.\nInsira o primeiro nome:");
		String primeiroNome = input.next();
		
		System.out.println("Insira o Segundo nome:");
		String segundoNome = input.next();
		
		
		System.out.println("Nome completo:" + primeiroNome+ " "+ segundoNome);
		
		
	}
	
	

	
	
}
