package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		
		double a = 1;
		System.out.println(a); // Não a perda de informação
		
		float b = (float) 1.0; //Não ha perda de informaçoes
		
		
		 //Convertendo numero para String para acessar metodos exclusivos de Strings.
			Integer num1 = 10000;
			
			
			Integer numero2 = num1.toString().length();
			
			System.out.println(numero2);
			
			numero2 = numero2 + 1;
			
			
			System.out.println(numero2);
			
			
		
		
	}
	
	
	
}
