package dao.busca;

import java.util.Collection;
import java.util.Map;

import entidade.Autor;
import entidade.Livro;

public interface DaoBusca {
	
	public Map<Autor, Collection<Livro>> buscaAutor(String key);

}
