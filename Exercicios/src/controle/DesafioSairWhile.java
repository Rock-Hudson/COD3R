package controle;

import javax.swing.JOptionPane;

public class DesafioSairWhile {

	public static void main(String[] args) {
		
		String opcao = JOptionPane.showInputDialog(null, "Para sair da repetição insira sair");
		
		
		while(!opcao.equalsIgnoreCase("sair")) {
			
			JOptionPane.showMessageDialog(null, "Ainda estamos repetindo");
			
			opcao = JOptionPane.showInputDialog(null, "Para sair da repetição insira sair");
			
		}
		
		
	}
	
}
