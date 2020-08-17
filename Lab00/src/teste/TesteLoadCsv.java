package teste;

import java.util.Collection;

import dao.DAO;
import dao.DaoCsv;
import entidade.Filme;

public class TesteLoadCsv {
	
	public static void main(String[] args) {
		
		
		DAO dao = new DaoCsv();
		
		Collection<Filme> filmes = dao.loadFilmes();
		
		for(Filme filme: filmes) {
			System.out.println(filme);
		}
		
	}

}
