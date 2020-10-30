package teste;

import java.util.Collection;

import dao.Dao;
import dao.hibernate.DaoHibernate;
import entidade.Autor;
import entidade.Editora;
import entidade.Livro;


/*
 * Seguindo o tutorial do site
 * https://www.tutorialspoint.com/hibernate/index.htm
 */

public class TesteHibernate {
	
	public static void main(String[] args) {
		
		Dao dao = new DaoHibernate();
		//dao.addEditora(new Editora("Nova Editora", "Novo url"));
		//dao.updateEditora(new Editora(7436, "Novo Nome", "antiga url"));
		//dao.deleteEditora(new Editora(7436, "", ""));
		
		Collection<Editora> editoras = dao.getEditoras();
		for(var v: editoras)
			System.out.println(v);
		System.out.println();
		
		Collection<Autor> autores = dao.getAutors();
		for(var a: autores) {
			System.out.println(a);
			for(var l: a.getLivros()) {
				System.out.println("\t" + l);
			}
		}
		System.out.println();
		
		Collection<Livro> livros = dao.getLivros();
		for(var v: livros)
			System.out.println(v);
		System.out.println();
		
		
	}

}
