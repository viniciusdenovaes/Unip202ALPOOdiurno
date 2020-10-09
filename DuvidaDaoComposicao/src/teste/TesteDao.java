package teste;

import dao.Dao;
import dao.busca.DaoBuscaPostgree;
import dao.exclusao.DaoExclusaoPostgree;
import dao.insercao.DaoInsercaoMySql;
import dao.insercao.DaoInsercaoPostgree;

public class TesteDao {
	
	public static void main(String[] args) {
		new Dao(new DaoBuscaPostgree(), new DaoExclusaoPostgree(), new DaoInsercaoMySql());
	}

}
