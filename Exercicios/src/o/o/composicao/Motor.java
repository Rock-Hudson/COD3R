package o.o.composicao;

public class Motor {

	public boolean ligado = false;
	
	double fatorDeInjecao = 1;
	
	int giros() {

		if (!ligado) {

			return 0;
			
		} else {

			return (int) Math.round(fatorDeInjecao * 3000);

		}

	}

}
