package dao;

import java.util.Collection;

import entidade.Aluno;
import exception.AlunoNaoExisteException;

public interface Dao {
	
	public Collection<Aluno> getAllAlunos();
	public Aluno getAluno(int ra) throws AlunoNaoExisteException ;
	public void updateAluno(Aluno aluno);
	public void deleteAluno(int ra);
	
}
