package gridbaglayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		add(new JButton("Botão 1"), c);
		
		c.gridx = 1;
		c.gridy = 0;
		add(new JButton("Botão 2"), c);
		
		c.gridx = 2;
		c.gridy = 0;
		add(new JButton("Botão 3"), c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		c.ipady = 40;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(new JButton("Nome Longo Botão 4"), c);
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 2;
		c.insets = new Insets(10, 0, 0, 0);
		add(new JButton("5"), c);
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 2;
		c.anchor = GridBagConstraints.LINE_END;
		add(new JButton("6"), c);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	

}
