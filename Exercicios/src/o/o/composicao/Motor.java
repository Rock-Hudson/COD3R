package o.o.composicao;

public class Motor {

	
	//Classe criada para representar motor da vida real
	
	
	public boolean ligado = false; //Motor ligado ou desligado
	
	double fatorDeInjecao = 1; //Injeção = Acelaração
	
	//Criando o metodo giros para definir o RPM do motor de acordo com a injeção
	int giros() {

		if (!ligado) {

			return 0;
			
		} else {

			return (int) Math.round(fatorDeInjecao * 3000);

		}

	}

}
