package gridlayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		setLayout(new GridLayout(2, 3, 20, 40));
		
		add(new JButton("Botão 1,1"));
		add(new JButton("Botão 1,2"));
		add(new JButton("Botão 1,3"));
		add(new JButton("Botão 2,1"));
		add(new JButton("Botão 2,2"));
		add(new JButton("Botão 2,3"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	

}
