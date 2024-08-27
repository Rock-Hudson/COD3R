package fundamentos;

public class TemperaturaJava {

	public static void main(String[] args) {
		
		//(F-32) x 5x9 = C
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("A temperatura convertida é:"+ celsius + "ºC");
		
		
		
	}
	
}
