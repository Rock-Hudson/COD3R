package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<String>();
		
		
		
		/*Na fila se usa o add também para adicionar porém ele 
		retorna uma exception quando estourar a fila
		O Offer retorna uma false caso a fila estoure.*/
		fila.add("Rock");
		fila.add("Tiago");
		fila.offer("Luiza");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Bia");
		
		
		//Obtendo o proximo elemento da fila sem mover
		/*O peek retorna false caso não tenha 
		nenhum elemento na fila*/
		System.out.println(fila.peek()); 
		/* O element retorna uma exception */
		System.out.println(fila.element());
		
		System.out.println(fila.size());
		System.out.println(fila.contains("Rock"));
		System.out.println(fila.peek());
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		/* Metodos importantes
		 * fila.size(); Para obter o tamanho da fila.
		 * fila.clear(); limpa a fila.
		 * fila.isEmpty(); Verifica se esta vazia
		 * fila.poll(); Ele chama o primeiro da fila e remove o primeiro da fila
		 * fila.remove(); tambem apresenta removendo o item no topo da fila. 
		 * fila.contains();
		 */
		
		
		
		
	}
	
	
	
}
