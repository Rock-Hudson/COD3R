package controle;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {

		String op = "123456";
		
		do {
			
		 op = JOptionPane.showInputDialog(null, "Digite a senha para entrar: ");
			
			if (!op.equalsIgnoreCase("123456")) {
				JOptionPane.showMessageDialog(null, "Ops! acho que voce nao tem a senha!");
			} else {
				
				JOptionPane.showMessageDialog(null, "Senha correta. Entrando...");
			}
		}while(!op.equalsIgnoreCase("123456"));
	
		
	}
	
	
}
