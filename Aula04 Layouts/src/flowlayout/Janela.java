package flowlayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		//setLayout(new FlowLayout());
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		//setLayout(new FlowLayout(FlowLayout.TRAILING, 50, 100));
		
		add(new JButton("Primeiro Botão"));
		add(new JButton("Segunda Botão"));
		add(new JButton("Botão 3"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	

}
