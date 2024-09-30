package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	
	public static void main(String[] args) {
		
		
		// Set <String> listaAprovado =  new HashSet<>();
		SortedSet <String> listaAprovado =  new TreeSet<>();
		listaAprovado.add("Rock");
		listaAprovado.add("Luiza");
		listaAprovado.add("Mãe");
		listaAprovado.add("Laura");
		listaAprovado.add("Abelha");
			
		
		for(String candidatos: listaAprovado) {
			
			System.out.println(candidatos);
			
		}
		
		SortedSet <Integer> nums = new TreeSet<>();
		
		nums.add(22);
		nums.add(23);
		nums.add(24);
		nums.add(25);
		
		for(Integer numeros: nums) {
			
			System.out.println(numeros);
			
			
		}
		
		
		
		
	}
	
	
	
}
