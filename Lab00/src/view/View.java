package view;

import java.util.Collection;

import controller.Acao;
import entidade.Filme;

public interface View{
	  /*
	  * Este método deve perguntar para o usuário qual próxima ação deve tomar
	  * e deve retornar um dentre os seguintes elementos de Acao
	  * LISTAR: para listar todos os filmes existentes
	  * ADICIONAR: para adicionar um filme
	  * SAIR: para terminar o programa
	  */
	  public Acao perguntaAcao();
	
	  // Este método deve mostrar toda a coleção de filmes para o usuário
	  public void mostrarFilmes(Collection<Filme> filmes);
	  
	  // Este método deve pedir um nome de filme para o usuário e retornar
	  // o nome do filme entrado
	  public String pedirNome();
	  
	  // Este método deve pedir um ano de filme para o usuário e retornar um
	  // inteiro com o ano entrado
	  public int pedirAno();

}