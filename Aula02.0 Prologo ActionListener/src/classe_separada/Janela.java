package classe_separada;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton botao = new JButton("Aperte-me");
		add(botao);
		botao.addActionListener(new ComportamentoBotao());
		
		
		setVisible(true);
	}

}
