package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		
		Scanner entrada	= new Scanner(System.in);
		String primeiroNome10, segundoNome10;
		System.out.println("Insire o seu primeiro Nome:");
		primeiroNome10 = entrada.nextLine();
		System.out.println("Insire o seu primeiro Nome:");
		segundoNome10 = entrada.nextLine();
		System.out.println(primeiroNome10.concat(" " + segundoNome10));
		entrada.close();
		
		
		
	}
	
	
	
}
