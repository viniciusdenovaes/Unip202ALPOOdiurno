package duvida_botao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MinhaJanelaColorida extends JFrame {
	
	private JPanel panel;
	
	public MinhaJanelaColorida() {
		super("Janela Colorida");
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		add(panel);
		panel.setBackground(Color.BLUE);
		
		JButton botaoVermelho = new JButton("Vermelho");
		panel.add(botaoVermelho);
		botaoVermelho.addActionListener(new ComportamentoMudaCor(Color.RED));
		
		JButton botaoAzul = new JButton("Azul");
		panel.add(botaoAzul);
		botaoAzul.addActionListener(new ComportamentoMudaCor(Color.BLUE));
		
		JButton botaoVerde = new JButton("Verde");
		panel.add(botaoVerde);
		botaoVerde.addActionListener(new ComportamentoMudaCor(Color.GREEN));
		
		
		
		setVisible(true);
	}
	
	class ComportamentoMudaCor implements ActionListener{
		
		Color cor;
		
		public ComportamentoMudaCor(Color aCor) {
			this.cor = aCor;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(cor);
		}
		
	}

}
