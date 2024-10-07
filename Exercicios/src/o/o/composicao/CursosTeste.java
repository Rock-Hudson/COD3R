package o.o.composicao;

public class CursosTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Rock");
		Aluno aluno2 = new Aluno("Lorena");
		Aluno aluno3 = new Aluno("Luiza");

		Curso curso1 = new Curso("JAVA Completo");
		Curso curso2 = new Curso("PYTHON Completo");
		Curso curso3 = new Curso("JS Completo");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		for (Aluno aluno : curso1.alunos) {

			System.out.println("Estou matriculado no curso:" + curso3.nome);
			System.out.println("O meu nome é:" + aluno.nome);
			System.out.println();
		}

		System.out.println(aluno1.curso.get(0).alunos);

		Curso cursoEcontrado = aluno1.obterCursoPorNome("JAVA Completo");
		
		if(cursoEcontrado != null) {
			
			System.out.println(cursoEcontrado.nome);
			
		}
		
	}

}
