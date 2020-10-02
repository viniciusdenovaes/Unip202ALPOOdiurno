package model.dao.postgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;

import entidades.Editora;
import entidades.Livro;
import model.dao.Dao;

public class DaoPostgre implements Dao {

	private final static String DATABASE = "Faculdade";
	private final static String URL = "jdbc:postgresql:" + DATABASE;
	private final static String USER = "postgres";
	private final static String PASS = "123456";
	
	@Override
	public Collection<Livro> getLivros(String key) {
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASS)){
			System.out.println("conexao feita");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Map<Editora, Collection<Livro>> getEditoras(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
