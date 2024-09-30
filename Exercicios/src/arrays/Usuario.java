package arrays;

public class Usuario {

	String nome;
	String email;
	
// criando uma instancia de usuario, depois convertendo obeto para usuario
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
			
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
			
		} else {
			
			return false;
		}
			
		
		
	}
	
	
	
	
	
	
}
