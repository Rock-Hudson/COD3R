package controle;

import javax.swing.JOptionPane;

public class ElseIf {

	public static void main(String[] args) {

		String nota = JOptionPane.showInputDialog("Insira o valor da nota:");
		double notaConvertida = Double.parseDouble(nota);

		if (notaConvertida == 10) {
			JOptionPane.showMessageDialog(null, "A+ :" + notaConvertida);
		} else if (notaConvertida == 9) {
			JOptionPane.showMessageDialog(null, "A :" + notaConvertida);
		} else if (notaConvertida == 8) {
			JOptionPane.showMessageDialog(null, "A- :" + notaConvertida);
		} else if (notaConvertida == 7) {
			JOptionPane.showMessageDialog(null, "B :" + notaConvertida);
		} else if (notaConvertida == 6) {
			JOptionPane.showMessageDialog(null, "B- :" + notaConvertida);
		} else if (notaConvertida == 5) {
			JOptionPane.showMessageDialog(null, "C :" + notaConvertida);
		} else if (notaConvertida == 4) {
			JOptionPane.showMessageDialog(null, "C- :" + notaConvertida);
		} else if (notaConvertida == 3) {
			JOptionPane.showMessageDialog(null, "D :" + notaConvertida);
		} else if (notaConvertida == 2) {
			JOptionPane.showMessageDialog(null, "D- :" + notaConvertida);
		} else if (notaConvertida == 1) {
			JOptionPane.showMessageDialog(null, "E :" + notaConvertida);
		}

	}

}
