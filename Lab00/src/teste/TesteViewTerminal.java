package teste;

import java.util.Collection;

import controller.Acao;
import dao.DAO;
import dao.DaoCsv;
import entidade.Filme;
import view.View;
import view.ViewTerminal;

public class TesteViewTerminal {
	
	public static void main(String[] args) {
		
		View view = new ViewTerminal();
		
		Acao acao = view.perguntaAcao();
		
		System.out.println(acao);
		
		DAO dao = new DaoCsv();
		
		Collection<Filme> filmes = dao.loadFilmes();
		
		view.mostrarFilmes(filmes);
		
		System.out.println(view.pedirNome());
		
		System.out.println(view.pedirAno());
		
	}

}
