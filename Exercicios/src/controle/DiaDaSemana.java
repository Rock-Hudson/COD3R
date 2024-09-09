package controle;

import javax.swing.JOptionPane;

public class DiaDaSemana {

	public static void main(String[] args) {

		String valorDia = JOptionPane.showInputDialog("Insira o nome do dia:");

		if (valorDia.equalsIgnoreCase("Domingo")) {
			JOptionPane.showMessageDialog(null, 1);
		} else if (valorDia.equalsIgnoreCase("segunda") || valorDia.equalsIgnoreCase("segunda feira")) {
			JOptionPane.showMessageDialog(null, 2);
		} else if (valorDia.equalsIgnoreCase("Terça")) {
			JOptionPane.showMessageDialog(null, 3);
		} else if (valorDia.equalsIgnoreCase("Quarta")) {
			JOptionPane.showMessageDialog(null, 4);
		} else if (valorDia.equalsIgnoreCase("Quinta")) {
			JOptionPane.showMessageDialog(null, 5);
		} else if (valorDia.equalsIgnoreCase("Sexta")) {
			JOptionPane.showMessageDialog(null, 6);
		}else if (valorDia.equalsIgnoreCase("Sabado")) {
			JOptionPane.showMessageDialog(null, 7);
		}


	}

}
