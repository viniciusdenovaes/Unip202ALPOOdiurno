package exemplo_com_jpanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MinhaJanelaComJPanel extends JFrame {
	
	public MinhaJanelaComJPanel() {
		
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel painelEsquerda = new JPanel();
		//painelEsquerda.setSize(200, 200);
		painelEsquerda.setBackground(Color.YELLOW);
		add(painelEsquerda, BorderLayout.LINE_START);
		painelEsquerda.add(new JButton("Botao Esquerda"));
		
		JPanel painelDireita = new JPanel();
		//painelDireita.setSize(200, 200);
		painelDireita.setBackground(Color.BLUE);
		add(painelDireita, BorderLayout.LINE_END);
		painelDireita.add(new JButton("Botao Direita"));
		painelDireita.add(new JButton("Outro Botao Direita"));
		
		
		setVisible(true);
		
		
	}

}
