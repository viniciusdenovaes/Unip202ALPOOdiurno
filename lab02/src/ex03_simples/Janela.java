package ex03_simples;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {
	
	private int n1 = 0;
	private int n2 = 0;
	private JLabel labelContagem1;
	private JLabel labelContagem2;
	
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton botao1 = new JButton("Botao 1");
		add(botao1);
		botao1.addActionListener(new ComportamentoBotao1());
		
		labelContagem1 = new JLabel(makeMensagemQuantidade(0));
		add(labelContagem1);
		
		JButton botao2 = new JButton("Botao 2");
		add(botao2);
		botao2.addActionListener(new ComportamentoBotao2());
		
		labelContagem2 = new JLabel(makeMensagemQuantidade(0));
		add(labelContagem2);
		
		pack();
		setVisible(true);
	}
	
	private String makeMensagemQuantidade(int quantidade) {
		return "Botao pressionado " + quantidade + " vezes";
	}
	
	class ComportamentoBotao1 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			n1++;
			labelContagem1.setText(makeMensagemQuantidade(n1));
		}
		
	}
	
	class ComportamentoBotao2 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			n2++;
			labelContagem2.setText(makeMensagemQuantidade(n2));
		}
		
	}
	

}
