package fundamentos;

import java.util.Scanner;

/* O objetivo desta aula e frizar a utilzação do metodo 
 * o metodo equal() na hora de realizar a comparação de Strings. 
 * */

public class TiposStringEquals {
	public static void main(String[] args) {
			
		
		String s = "2";
		
		System.out.println("2" == s);
		System.out.println("3".equals(s));
		
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); //Ele inputa tirando os passos em branco
		System.out.println("Rock".equals(s2)); // Comparar utilizando equals.
		
		
	}
	
	
}
