package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		
		
		//Estes são so Wrappers, tipos primitivos que podemos utilizar metodos.
		
		Byte d = 100;
		
		Short s = 1000;
		
		Integer i = 20000;
		
		Long l = 10000L;
		
		Integer numeroString = Integer.parseInt("2200");
		
		System.out.println(numeroString);
		
		System.out.println(d.byteValue()); //Mostra o valor variavel
		System.out.println(s.toString()); //Converte para String
		
		
		
		
		
	}
	
	
}
