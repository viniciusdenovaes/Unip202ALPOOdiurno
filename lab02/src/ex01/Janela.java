package ex01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	int n = 0;
	
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton botao = new JButton("Aperte");
		add(botao);
		botao.addActionListener(new ComportamentoBotao());
		
		pack();
		setVisible(true);
	}
	
	class ComportamentoBotao implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			n++;
			System.out.println("Botao pressionado " + n + " vezes");
		}
		
	}
	

}
