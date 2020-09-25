package teste;

import dao.Dao;
import dao.sql.DaoSqlPostgree;
import entidade.Aluno;
import exception.AlunoNaoExisteException;

public class TesteAlunoNaoExiste {
	
	public static void main(String[] args) {
		
		Dao dao = new DaoSqlPostgree();
		
		int ra = 1234;
		try {
			Aluno aluno = dao.getAluno(ra);
			System.out.println("O aluno com ra " + ra + " foi recuperado:\n " + aluno);
			
		} catch(AlunoNaoExisteException e) {
			System.err.println("O aluno " + e.getRa() + " nao existe");
		} 
		
		
		
	}

}
