package boxlayout;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	
	public Janela() {
		
		JPanel panel = new JPanel();
		// Janela usando BorderLayout por padrao, 
		// adicionando no CENTER
		add(panel);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		
		panel.add(new JButton("Primeiro Botão"));
		panel.add(Box.createRigidArea(new Dimension(50, 10)));
		panel.add(new JButton("Segunda Botão"));
		panel.add(Box.createHorizontalGlue());
		panel.add(new JButton("Botão 3"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	

}
