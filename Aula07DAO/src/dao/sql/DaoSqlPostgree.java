package dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import dao.Dao;
import entidade.Aluno;
import exception.AlunoNaoExisteException;

public class DaoSqlPostgree implements Dao {

	private final static String DATABASE = "Faculdade";
	private final static String URL = "jdbc:postgresql:" + DATABASE;
	private final static String USER = "postgres";
	private final static String PASS = "123456";
	
	@Override
	public Collection<Aluno> getAllAlunos() {
		
		Collection<Aluno> alunos = new ArrayList<>();
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASS)){
			String query = "SELECT * FROM alunos;";
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				int ra = rs.getInt("ra");
				String nome = rs.getString("nome");
				
				Aluno aluno = new Aluno(ra, nome);
				alunos.add(aluno);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return alunos;
	}

	@Override
	public Aluno getAluno(int ra) throws AlunoNaoExisteException {
		
		Aluno aluno = null;
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASS)){
			String query = "SELECT NOME FROM alunos WHERE RA = ?;";
			
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, ra);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				String nome = rs.getString("nome");
				aluno = new Aluno(ra, nome);
			}
			
			if(aluno==null) {
				throw new AlunoNaoExisteException(ra);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return aluno;
	}

	@Override
	public void updateAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAluno(int ra) {
		// TODO Auto-generated method stub
		
	}

}
