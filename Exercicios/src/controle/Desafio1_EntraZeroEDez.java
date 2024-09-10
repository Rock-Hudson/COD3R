package controle;

import javax.swing.JOptionPane;

/**
 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */

public class Desafio1_EntraZeroEDez {

	
	public static void main(String[] args) {
		
		
		String numeroS = JOptionPane.showInputDialog(
				"Insira um número para verificar se ele é par e esta dentro de zero e dez: ");
		
		int numero = Integer.parseInt(numeroS);
		
		if(numero >= 0 && numero <= 10 && numero % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "O número está entre zero e 10 e é PAR!");
			
		}else if (numero >= 0 && numero <= 10 && numero % 2 == 1) {
			
			
			JOptionPane.showMessageDialog(null, "O número está entre zero e 10 e é impar!");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O número não esta dentro do intervalo desejado.");
			
		}
		
		
		
	}
	
	
	
}
