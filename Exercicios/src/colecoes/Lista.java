package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		
		//Criando uma estrutura do tipo lista com ArrayList do tipo Usuario.
		ArrayList<Usuario> lista = new ArrayList<Usuario>(); //Criando a lista
		
		//Como eu criei uma lista do tipo objeto  somente elementos do tipo objeto irão funcionar. 
		Usuario u1 = new Usuario("Rock");
		
		
		//Depois que a lista é criada, pode ser inserido elementos para compor ela de forma ordenada.
		//Adicionado objeto instanciado acima. 
		lista.add(u1);
		
		//Criando novos objetos ja com o atributo nome. 
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Carla"));
		lista.add(new Usuario("Vanesse"));
		lista.add(new Usuario("Alexandre"));
		
		
		// As verificações possuem precedencia na chamada.
		
		//Acessando o objeto pelo indice, no caso ele vai chamar vanesse primeiro.
		System.out.println(lista.get(3).nome);
		//Removendo a Carla
		lista.remove(2);
		//Verificando se um valor contem dentro da lista
		System.out.println(lista.contains(new Usuario("Alexandre")));
		for(Usuario user: lista) {
			
			System.out.println(user.toString());
			
		}
		
		
		
	}

}
