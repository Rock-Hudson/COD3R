package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		HashSet conjunto =  new HashSet();
		
		//Adicionando elementos ao conjunto add()
		
		conjunto.add(1.2); // Converte pra Wrapper
		conjunto.add("Rock");
		conjunto.add(1);
		conjunto.add('C');
		conjunto.add(true);
		
		//Verificando o tamanho do conjunto size();
		
		System.out.println("Tamano do conjuto: " + conjunto.size());
		
		//Removendo um elemento de conjunto remove();
		
		conjunto.remove('C');
		System.out.println("Tamano do conjuto: Remove =  " + conjunto.size());
		
		
		//Verificando se um valor existe no conjunto contains();		
		System.out.println("Contem 1.2? " + conjunto.contains(1.2));
		System.out.println(conjunto.contains(1.3));
		
		Set nums =  new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// Fazendo uniao dos dados addAll
		conjunto.addAll(nums); //uniao
		System.out.println(conjunto);
		
	}
	
	
	
	
	
}
