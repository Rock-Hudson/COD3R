package classes;

public class AreaCirc {

	double raio;
	static final double PI = 10;

	AreaCirc(double raioInicial) {

		raio = raioInicial;

	}

	double area() {

		return Math.pow(raio, 2) * PI;

	}

}
