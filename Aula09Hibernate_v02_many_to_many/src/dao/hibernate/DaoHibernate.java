package dao.hibernate;

import java.util.Collection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.Dao;
import entidade.Autor;
import entidade.Editora;
import entidade.Livro;

/*
 * Seguindo o tutorial do site
 * https://www.tutorialspoint.com/hibernate/index.htm
 */


public class DaoHibernate implements Dao {
	
	private static SessionFactory factory = null;
	
	{
		if(factory==null) {
			try {
				factory = new Configuration().
						configure("dao/hibernate/hibernate.cfg.xml").
						buildSessionFactory(); 
			} catch(HibernateException e) {
				System.err.println("Falha ao criar sessionFactory object." + e);
				e.printStackTrace();
			}
		}
	}
	
	private DaoHibernateCRUD<Editora> daoHibernateCrudEditora = new DaoHibernateCRUD<>(factory);
	private DaoHibernateCRUD<Autor> daoHibernateCrudAutor = new DaoHibernateCRUD<>(factory);
	private DaoHibernateCRUD<Livro> daoHibernateCrudLivro = new DaoHibernateCRUD<>(factory);
	
	public DaoHibernate() {
	}

	@Override public void addEditora(Editora editora) {daoHibernateCrudEditora.add(editora);}
	@Override public void updateEditora(Editora editora) {daoHibernateCrudEditora.update(editora);}
	@Override public void deleteEditora(Editora editora) {daoHibernateCrudEditora.delete(editora);}
	@Override public Collection<Editora> getEditoras() {return daoHibernateCrudEditora.get("from Editora");}

	@Override public void addAutor(Autor autor) {daoHibernateCrudAutor.add(autor);}
	@Override public void updateAutor(Autor autor) {daoHibernateCrudAutor.update(autor);}
	@Override public void deleteAutor(Autor autor) {daoHibernateCrudAutor.delete(autor);}
	@Override public Collection<Autor> getAutors() {return daoHibernateCrudAutor.get("from Autor");}

	@Override public void addLivro(Livro livro) {daoHibernateCrudLivro.add(livro);}
	@Override public void updateLivro(Livro livro) {daoHibernateCrudLivro.update(livro);}
	@Override public void deleteLivro(Livro livro) {daoHibernateCrudLivro.delete(livro);}
	@Override public Collection<Livro> getLivros() {return daoHibernateCrudLivro.get("from Livro");}

}
