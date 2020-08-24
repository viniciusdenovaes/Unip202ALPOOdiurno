package ex01;

import javax.swing.JFrame;

public class TesteExercicio01 {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Exercicio 01");
		
		// 1 - setar o tamanho
		janela.setSize(200, 400);
		
		// 2 - setar a acao que ocorre quando o botao de fechar a janela eh clicado
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3 - tornar a janela visivel
		janela.setVisible(true);
		
	}
	

}
