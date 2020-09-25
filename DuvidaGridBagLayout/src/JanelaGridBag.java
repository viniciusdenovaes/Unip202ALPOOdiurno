import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaGridBag extends JFrame {
	
	public JanelaGridBag() {
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		add(new JButton("0, 0"), c);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		add(new JButton("1, 0"), c);
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		add(new JButton("0, 1"), c);
		
		c.gridx = 1;
		c.gridy = 1;
		add(new JButton("1, 1"), c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		c.fill = GridBagConstraints.HORIZONTAL; 
		add(new JButton("2, 0-2"), c);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 2;
		c.anchor = GridBagConstraints.LINE_START; 
		add(new JButton("3, 0-2"), c);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JanelaGridBag();
	}

}
