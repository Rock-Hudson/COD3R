package fundamentos;

import javax.swing.JOptionPane;

public class ConcersaoStringNumero {

	public static void main(String[] args) {
		
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro Número: ");

		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo Número: ");

		
		JOptionPane.showMessageDialog(null, valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		
		JOptionPane.showMessageDialog(null, numero1 + numero2);
		
		
		
		
		
	}
	
	
}
