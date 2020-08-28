package inner_class;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public class ComportamentoBotao implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Comportamento definido pela inner class");
		}

	}

}
