package controller;

import java.util.Collection;

import dao.DAO;
import entidade.Filme;
import view.View;

public class Controller {
	
	private DAO dao;
	private View view;
	
	private Collection<Filme> filmes;
	
	public Controller(DAO dao, View view) {
		this.dao = dao;
		this.view = view;
		
		this.filmes = dao.loadFilmes(); 
	}
	
	public void init() {
		Acao acao = null;
		
		while(acao!=Acao.SAIR) {
			acao = view.perguntaAcao();
			switch(acao) {
			case LISTAR: 
				view.mostrarFilmes(filmes);
				break;
			case ADICIONAR:
				String nome = view.pedirNome();
				int ano = view.pedirAno();
				Filme filme = new Filme(nome, ano);
				filmes.add(filme);
			}
		}
		
		dao.saveFilmes(filmes);
		
	}

}
