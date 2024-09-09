package logica;

import javax.swing.JOptionPane;

/***
 * Faça um algoritmo que calcule a quantidade de litros de combustível gasta em
uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o
cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média
durante ela. Desta forma, será possível obter a distância percorrida com a
fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância,
basta calcular a quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os
valores da velocidade média, tempo gasto na viagem, a distância percorrida e a
quantidade de litros utilizada na viagem.
 */

public class Desafio5_GastoCombustivelViagem {

	
	
	public static void main(String[] args) {
		
	
		 
		double tempoGasto = 0;
		double velocidadeMedia = 0;
		double distancia = tempoGasto * velocidadeMedia;
		double litrosUsados = distancia / 12;
		 
		String tempo = JOptionPane.showInputDialog("Insira o tempo gasto na viagem:");
		tempoGasto = Double.parseDouble(tempo);
		
		String velocidade = JOptionPane.showInputDialog("Insira a velocidade media: ");
		velocidadeMedia = Double.parseDouble(velocidade);
		
		litrosUsados = distancia / 12;
		
		JOptionPane.showMessageDialog(null, "Velocidade média: " + velocidadeMedia + "\nTempo Gasto na viagem: " 
		+ tempoGasto + "\nDistância percorrida: " + distancia + "\nLitros Usados: " + litrosUsados);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
