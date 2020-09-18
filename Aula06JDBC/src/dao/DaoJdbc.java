package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entidades.Aluno;

public class DaoJdbc {
	
	private final static String DATABASE = "Faculdade";
	private final static String URL = "jdbc:postgresql:" + DATABASE;
	private final static String USER = "postgres";
	private final static String PASS = "123456";
	
	public void fazConexao() {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {
			System.out.println("Conexão Feita");
		}catch(SQLException e) {
			System.out.println("Conexão não foi Feita");
			e.printStackTrace();
		}
	}
	
	public void addAluno(Aluno aluno) {
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASS)){
			
			final String update = "INSERT INTO alunos VALUES(?, ?)";
			
			PreparedStatement pstm = con.prepareStatement(update); 
			
			pstm.setInt(1, aluno.getRa());
			pstm.setString(2, aluno.getNome());
			
			int linhasModificadas = pstm.executeUpdate();
			System.out.println(linhasModificadas + " linhas foram modificadas");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void listaAlunos() {
		try(Connection con = DriverManager.getConnection(URL, USER, PASS)){
			
			final String query = "SELECT * FROM alunos";
			
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("ra: " + rs.getInt(1) + 
						      ",  nome: " + rs.getString("nome"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void buscaAluno(String nomePesquisa) {
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASS)){
			
			final String query = "SELECT * FROM alunos WHERE LOWER(nome) LIKE LOWER(?)";
			
			PreparedStatement pstm = con.prepareStatement(query); 
			
			pstm.setString(1, "%" + nomePesquisa + "%");
			
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				System.out.println("ra: " + rs.getInt("ra") + 
					      ",  nome: " + rs.getString("nome"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}










