package dao;

import java.util.Collection;

import entidade.Autor;
import entidade.Editora;
import entidade.Livro;

public interface Dao {
	
	public void addEditora(Editora editora);
	public void updateEditora(Editora editora);
	public void deleteEditora(Editora editora);
	public Collection<Editora> getEditoras();

	public void addAutor(Autor autor);
	public void updateAutor(Autor autor);
	public void deleteAutor(Autor autor);
	public Collection<Autor> getAutors();

	public void addLivro(Livro livro);
	public void updateLivro(Livro livro);
	public void deleteLivro(Livro livro);
	public Collection<Livro> getLivros();

}
