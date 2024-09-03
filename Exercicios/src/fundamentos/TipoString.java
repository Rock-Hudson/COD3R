package fundamentos;

import java.util.Scanner;

public class TipoString {

	public static void main(String[] args) {
		
		String nome = "Rock ";
		String bomDia = "Bom dia ";
		String bomDia2 = "Carvalho!!!";
		System.out.println("Meu nome é Rock".charAt(7)); // Traz a letra do indice apontado
		System.out.println(nome.concat("Hudson")); // Concatena a string
		System.out.println(nome.startsWith("Hudson")); //Valida se termina com o valor e retorna um valor booleando
		
		
		System.out.println(bomDia.toUpperCase()); //Transforma em maiuscula as letras
		System.out.println(bomDia.endsWith("dia ")); //Verifica se a string termina com o valor desejado.
		System.out.println(bomDia.endsWith("dia!"));
		System.out.println(bomDia.length()); //Pega o tamanho da string
		System.out.println(bomDia.concat(bomDia2)); //Concatena
		
		String primeiroNome = "Rock";
		String segundoNome = "Hudson";
		String primeiroNome2 = "ROCK";
		System.out.println(primeiroNome.equals(segundoNome)); //compara a igualdade entre as Strings
		System.out.println(primeiroNome.equals(primeiroNome2));
		System.out.println(primeiroNome.equalsIgnoreCase(primeiroNome2)); //Compara ignorando as letras
		System.out.println(primeiroNome.indexOf("o"));
		var nome1 = "Rock";
		var nome3 = "Hudson";
		var idade = 27;
		var tamanho = 1.73;
	
			
		
		
		
		
	}
	
	
}
