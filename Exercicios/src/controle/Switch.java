package controle;

import java.util.Scanner;

public class Switch {

	
	public static void main(String[] args) {
		
		System.out.println("Ola mundo!");
		
		Scanner entrada = new Scanner(System.in);
			
		int nota = entrada.nextInt();
		
		System.out.println(nota);
			
		switch (nota) {

		case 1:
			System.out.println("Nota 1");
			break;

		case 10:
			System.out.println("Nota 10");
			break;

		default:
			System.out.println("Nota invalida!");
			break;
			
		}
			entrada.close();
		
		
	}
	
	
}
