package desafioJantar;

public class Janta {

	
	public static void main(String[] args) {
		
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("Rock", 73);
		
		
		System.out.println(p.apresentar());
		
		
		p.comer(c1);
		p.comer(c2);
		
		System.out.println(p.apresentar());
		
		
		
		
		
		
	}
	
	
}
