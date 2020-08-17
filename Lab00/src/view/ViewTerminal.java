package view;

import java.util.Collection;
import java.util.Scanner;

import controller.Acao;
import entidade.Filme;

public class ViewTerminal implements View{

	@Override
	public Acao perguntaAcao() {
		Acao acao = null;
		
		while(acao==null) {
			
			System.out.println("Entre com uma das acoes disponiveis:");
			System.out.println("1 - Para Listar os filmes");
			System.out.println("2 - Para Adicionar um filme");
			System.out.println("0 - Para Sair");
			
			Scanner in = new Scanner(System.in);
			String entradaStr = in.next();
			
			try {
				int entradaInt = Integer.parseInt(entradaStr);
				
				switch(entradaInt) {
				case 1: 
					acao = Acao.LISTAR;
					break;
				case 2: 
					acao = Acao.ADICIONAR;
					break;
				case 0: 
					acao = Acao.SAIR;
					break;
				default:
					System.out.println("Entrada nao reconhecida");
				}
			}catch(NumberFormatException e) {
				System.out.println("entrada nao eh um inteiro reconhecido");
				continue;
			}
			
			
		}
		
		
		return acao;
	}

	@Override
	public void mostrarFilmes(Collection<Filme> filmes) {
		for(Filme filme: filmes) {
			String linha = "";
			linha += String.format("%-20s |", filme.getNome());
			linha += String.format(" %4d |", filme.getAno());
			System.out.println(linha);
		}
	}

	@Override
	public String pedirNome() {
		
		System.out.println("Entre com o nome do filme");
		
		Scanner in = new Scanner(System.in);
		String entradaStr = in.nextLine();
		return entradaStr;
	}

	@Override
	public int pedirAno() {
		
		System.out.println("Entre com o ano do filme");
		
		Scanner in = new Scanner(System.in);
		String entradaStr = in.next();
		
		try {
			int entradaInt = Integer.parseInt(entradaStr);
			return entradaInt;
		}catch(NumberFormatException e) {
			System.out.println("Ano nao eh um inteiro");
			return pedirAno();
		}
		
	}
	
	

}
