package teste;

import dao.DaoJdbc;
import entidades.Aluno;

public class TesteJdbc {
	public static void main(String[] args) {
		DaoJdbc dao = new DaoJdbc();
		//dao.fazConexao();
		//dao.addAluno(new Aluno(126, "Coisa coisa"));
		dao.buscaAluno("nova");
		System.out.println("\nTODOS OS ALUNOS:");
		dao.listaAlunos();
	}
	

}
