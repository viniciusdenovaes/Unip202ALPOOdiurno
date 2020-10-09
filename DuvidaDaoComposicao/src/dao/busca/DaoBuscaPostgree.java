package dao.busca;

import java.util.Collection;
import java.util.Map;

import dao.MarkerPostgree;
import entidade.Autor;
import entidade.Livro;

public class DaoBuscaPostgree implements DaoBusca, MarkerPostgree{

	@Override
	public Map<Autor, Collection<Livro>> buscaAutor(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
