package ex02;

import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
	
	public MinhaJanela() {
		super("Exercicio 02");
		
		// 1 - setar o tamanho
		setSize(200, 400);
		
		// 2 - setar a acao que ocorre quando o botao de fechar a janela eh clicado
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3 - tornar a janela visivel
		setVisible(true);

	}

}
