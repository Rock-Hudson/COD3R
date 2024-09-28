package desafioJantar;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;

	Pessoa(String nomePessoa, int pesoPessoa) {

		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;

	}

	void comer(Comida comida) {

		if (comida != null) {

			this.pesoPessoa += comida.pesoComida;

		}

	}

	String apresentar() {

		return "Olá, eu sou o " + nomePessoa + " e o meu peso é: " + pesoPessoa + " Kgs.";

	}
}
