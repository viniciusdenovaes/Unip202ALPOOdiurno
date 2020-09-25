package teste;

import java.util.Collection;

import dao.Dao;
import dao.sql.DaoSqlPostgree;
import entidade.Aluno;

public class TesteDaoConcreto {
	
	public static void main(String[] args) {
		Dao dao = new DaoSqlPostgree();
		
		Collection<Aluno> alunos = dao.getAllAlunos();
		for(Aluno aluno: alunos) {
			System.out.println(aluno);
		}
	}

}
