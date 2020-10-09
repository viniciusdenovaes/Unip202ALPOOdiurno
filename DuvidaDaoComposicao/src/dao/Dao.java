package dao;

import java.util.Collection;
import java.util.Map;

import dao.busca.DaoBusca;
import dao.exclusao.DaoExclusao;
import dao.insercao.DaoInsercao;
import entidade.Autor;
import entidade.Livro;

public class Dao<T> {
	
	DaoBusca daoBusca;
	DaoExclusao daoExclusao;
	DaoInsercao daoInsercao;
	
	public Dao(DaoBusca daoBusca, DaoExclusao daoExclusao, DaoInsercao daoInsercao) {
		this.daoBusca = daoBusca;
		this.daoExclusao = daoExclusao;
		this.daoInsercao = daoInsercao;
	}
	
	// Busca
	public Map<Autor, Collection<Livro>> buscaAutor(String key){
		return this.daoBusca.buscaAutor(key);
	}
	
	// Exclusao
	public boolean excluiLivro(Livro livro) {
		return daoExclusao.excluiLivro(livro);
	}
	
	// Insercao
	public void insereLivro(Livro livro) {
		this.daoInsercao.insereLivro(livro);
	}



}
