package fundamentos;

import java.util.Scanner;

public class TipoString {

	public static void main(String[] args) {
		
		String nome = "Rock ";
		String bomDia = "Bom dia ";
		String bomDia2 = "Carvalho!!!";
		System.out.println("Meu nome é Rock".charAt(7)); // Traz a letra do indice apontado
		System.out.println(nome.concat("Hudson"));
		System.out.println(nome.startsWith("Hudson"));
		
		
		System.out.println(bomDia.toUpperCase());
		System.out.println(bomDia.endsWith("dia "));
		System.out.println(bomDia.endsWith("dia!"));
		System.out.println(bomDia.length());
		System.out.println(bomDia.concat(bomDia2));
		
		String primeiroNome = "Rock";
		String segundoNome = "Hudson";
		String primeiroNome2 = "ROCK";
		System.out.println(primeiroNome.equals(segundoNome));
		System.out.println(primeiroNome.equals(primeiroNome2));
		System.out.println(primeiroNome.equalsIgnoreCase(primeiroNome2));
		
		var nome1 = "Rock";
		var nome3 = "Hudson";
		var idade = 27;
		var tamanho = 1.73;
	
			
		
		
		
		
	}
	
	
}
