package arrays;

public class forEach {

	public static void main(String[] args) {
		
	
		double [] notas = {8.0, 7.3, 2.9, 90.8};
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.print(notas[i] + ", ");
			
		}
		
		System.out.println();
		
		for(double nota: notas) {
			
			System.out.print(nota + ", ");
			
		}
		
		
	}
	
	
}
