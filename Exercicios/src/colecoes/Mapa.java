package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	
	public static void main(String[] args) {
		
		/*Criando um MAPA, por definição uma mapa possui uma chave 
		 * e o tipo de dado.
		 */
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Rock Hudson"); //O put adiciona e sobrescreve o valor ou chave.
		usuarios.put(2, "Luiza Millas");
		usuarios.put(3, "Laura Millas");
		usuarios.put(20, "Lorena Millas");
		usuarios.put(5, "Aparecida Nestor");
		
		System.out.println(usuarios.size()); //Apresenta o tamanho do MAPA.
		System.out.println(usuarios.isEmpty()); // Retorna se o mapa esta vazio ou não.
		System.out.println(usuarios.keySet()); //Apresenta as achaves
		System.out.println(usuarios.values()); // Apresenta os valores do Mapa
		System.out.println(usuarios.entrySet()); // Aprensenta chaves e valores juntos
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Luiza Millas"));
		
		System.out.println(usuarios.get(3));
		
		// Percorrendo os valores do mapa com for();
		
		//Percorrendo por chaves
		for(int chaves: usuarios.keySet()) {
			
			System.out.println(chaves);
			
		}
		
		// Percorrendo por valores
		for(String valores: usuarios.values()) {
			
			System.out.println(valores);
			
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			
			System.out.println(registro);
			
		}
		
		
		
		
	}
	
	
	
}
