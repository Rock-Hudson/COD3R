package o.o.composicao;

public class Carro {

	
	Motor motor = new Motor();//Instanciando motor para utilizalo nos metodos

	void acelerar() {
		
		motor.fatorDeInjecao += 0.4;

	}

	void frear() {

		if(motor.fatorDeInjecao > 0.5) {
			
			motor.fatorDeInjecao -= 0.4;
			
		}

	}

	void ligar() {

		motor.ligado = true;

	}

	void desligar() {

		motor.ligado = false;

	}
	
	boolean estaLigado() {
		
		return motor.ligado;
		
	}
	
	

}
