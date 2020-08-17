package dao;

import java.util.Collection;

import entidade.Filme;

public interface DAO{
	
	// Este método retorna uma lista de filmes guardada no disco
	public Collection<Filme> loadFilmes();
	
	// Este método salva uma lista de filmes no disco
	public void saveFilmes(Collection<Filme> filmes);

}