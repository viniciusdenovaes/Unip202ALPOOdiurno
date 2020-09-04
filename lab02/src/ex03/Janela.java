package ex03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {
	
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton botao1 = new JButton("Botao 1");
		add(botao1);
		JLabel labelContagem1 = new JLabel(makeMensagemQuantidade(0));
		botao1.addActionListener(new ComportamentoBotao(labelContagem1));
		add(labelContagem1);
		
		JButton botao2 = new JButton("Botao 2");
		add(botao2);
		JLabel labelContagem2 = new JLabel(makeMensagemQuantidade(0));
		botao2.addActionListener(new ComportamentoBotao(labelContagem2));
		add(labelContagem2);
		
		
		pack();
		setVisible(true);
	}
	
	private String makeMensagemQuantidade(int quantidade) {
		return "Botao pressionado " + quantidade + " vezes";
	}
	
	class ComportamentoBotao implements ActionListener {
		
		int n = 0;
		JLabel labelContagem;
		public ComportamentoBotao(JLabel label) {
			this.labelContagem = label;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			n++;
			labelContagem.setText(makeMensagemQuantidade(n));
		}
		
	}
	

}
