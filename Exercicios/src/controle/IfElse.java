package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog(null, "Informe o numero: ");

		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número é par ta okey! ");
		} else {
			JOptionPane.showMessageDialog(null, "O número é impar ta okey! ");
		}
	}
}
