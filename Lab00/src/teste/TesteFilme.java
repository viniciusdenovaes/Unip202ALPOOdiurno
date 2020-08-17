package teste;

import java.util.ArrayList;
import java.util.Collection;

import entidade.Filme;

public class TesteFilme {
	
	public static void main(String[] args) {
		
		Filme filme01 = new Filme("Batman", 2002);
		
		System.out.println(filme01);
		System.out.println();
		
		Collection<Filme> filmes = new ArrayList<>();
		
		filmes.add(filme01);
		filmes.add(new Filme("Spiderman", 2004));
		filmes.add(new Filme("Ironman", 2006));
		
		System.out.println(filmes);
		System.out.println();
		
		System.out.println("Imprimindo cada um dos filmes:");
		for(Filme filme: filmes) {
			System.out.println(filme);
		}
		
	}

}
