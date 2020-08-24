package ex03;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
	
	public MinhaJanela() {
		super("Exercicio 03");
		
		Dimension sizeTela = Toolkit.getDefaultToolkit().getScreenSize();
		
		int larguraTela = sizeTela.width;
		int alturaTela = sizeTela.height;
		
		int larguraJanela = larguraTela/2;
		int alturaJanela = alturaTela/2;
		
		// 1 - setar o tamanho e localizacao
		setSize(larguraJanela, alturaJanela);
		//setLocation(larguraTela/4, alturaTela/4);
		setLocationRelativeTo(null);
		
		// 2 - setar a acao que ocorre quando o botao de fechar a janela eh clicado
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3 - tornar a janela visivel
		setVisible(true);

	}

}
