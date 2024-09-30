package arrays;

public class Equals {

	public static void main(String[] args) {
		
		
		
		Usuario usuario1 = new Usuario();
		usuario1.nome = "Rock Hudson";
		usuario1.email = "avelarmillas@gmail.com";
		
		Usuario usuario2 = new Usuario();
		usuario2.nome = "Rock Hudson";
		usuario2.email = "avelarmillas@gmail.com";
		
		
		System.out.println(usuario1 == usuario2);
		System.out.println(usuario1.equals(usuario2));
		
		
		
		
	}
	
}
