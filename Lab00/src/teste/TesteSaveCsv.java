package teste;

import java.util.ArrayList;
import java.util.Collection;

import dao.DAO;
import dao.DaoCsv;
import entidade.Filme;

public class TesteSaveCsv {
	
	public static void main(String[] args) {
		
		DAO dao = new DaoCsv();
		
		Collection<Filme> filmes = dao.loadFilmes();
		
		filmes.add(new Filme("Batman", 2002));
		filmes.add(new Filme("SpiderMan", 2004));
		
		dao.saveFilmes(filmes);
		
		
	}

}
