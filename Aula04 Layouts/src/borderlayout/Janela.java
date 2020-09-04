package borderlayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Botao Central (CENTER)"), BorderLayout.CENTER);
		
		add(new JButton("Botão do norte (PAGE_START)"), BorderLayout.PAGE_START);
		add(new JButton("Botão do sul (PAGE_END)"), BorderLayout.PAGE_END);
		
		add(new JButton("Botão do oeste (LINE_START)"), BorderLayout.LINE_START);
		add(new JButton("Botão do leste (LINE_END)"), BorderLayout.LINE_END);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	

}
