package controle;

public class ForAninhado {

	public static void main(String[] args) {
		
		for(int i = 0; i <=5; i++) {
			System.out.println("Fora");
		for(int j = 0; j <= 1; j++) {
				System.out.println("Dentro");
				
				for(int k = 0; k <=1; k++) {
					
					System.out.print("muito dentro");
					
				}
			}
			
		}
		
		
	
		
		
		
	}
	
	
	
}
