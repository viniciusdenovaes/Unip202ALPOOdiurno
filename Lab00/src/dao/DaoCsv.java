package dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

import entidade.Filme;

public class DaoCsv implements DAO{

	@Override
	public Collection<Filme> loadFilmes() {
		
		Collection<Filme> filmes = new ArrayList<>();
		
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
		try {
			is = new FileInputStream("files/filmes.csv");
			isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			br = new BufferedReader(isr);
			
			String linha;
			while( (linha = br.readLine()) != null ) {
				String[] palavras = linha.split("\\,");
				String nome = palavras[0];
				int ano = Integer.parseInt(palavras[1]);
				Filme filme = new Filme(nome, ano);
				filmes.add(filme);
			}
			br.close();
			isr.close();
			is.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return filmes;
	}
	

	@Override
	public void saveFilmes(Collection<Filme> filmes) {
		
		OutputStream os;
		OutputStreamWriter osw;
		PrintWriter pw;
		
		try {
			os = new FileOutputStream("files/filmes.csv");
			osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
			pw = new PrintWriter(osw, true);
			
			for(Filme filme: filmes) {
				pw.println(filme.getNome() + "," + filme.getAno());
			}
			
			os.close();
			osw.close();
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
