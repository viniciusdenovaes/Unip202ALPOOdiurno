package teste;

import model.dao.Dao;
import model.dao.mysql.DaoMySql;

public class TesteDaoPostgre {
	
	public static void main(String[] args) {
		Dao dao = new DaoMySql();
		dao.getLivros("");
	}

}
