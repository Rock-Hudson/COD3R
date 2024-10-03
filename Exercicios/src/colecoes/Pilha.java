package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		
		Deque<String> livros = new ArrayDeque<String>();
		
		//Coleção do tipo Pilha, o ultimo a entrar e o primeiro a sair LIFO
		
		// Na pilha o add adiciona e se não for possivel retorna false
		livros.add("O pequeno principe"); 
		livros.add("Cosmos");
		livros.add("Uma breve historia do tempo");
		// Na pilha o push retorna 
		//livros.push("Uma noite de crime");
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove()); //Apresenta uma exception
		System.out.println(livros.pop()); // Também apresenta uma exception
		
		
		
	}
	
	
	
	
}
