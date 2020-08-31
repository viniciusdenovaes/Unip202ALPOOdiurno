package ex07.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Janela extends JFrame {
	
	ArrayList<JRadioButton> escolhaLanches;
	ArrayList<JRadioButton> escolhaPontos;
	ArrayList<JCheckBox> escolhaAdicionals;
	
	JButton botaoOk = new JButton("Ok");
	
	public Janela() {
		super("Escolha de Lanches");
		
		setLayout(new BorderLayout());
		
		JPanel panelEscolhas = new JPanel();
		add(panelEscolhas, BorderLayout.CENTER);
		JPanel panelBotoes = new JPanel();
		add(panelBotoes, BorderLayout.PAGE_END);
		
		JPanel panelLanches = new JPanel();
		panelLanches.setLayout(new FlowLayout());
		ButtonGroup bgLanches = new ButtonGroup();
		escolhaLanches = new ArrayList<>();
		escolhaLanches.add(new JRadioButton("Basico"));
		escolhaLanches.add(new JRadioButton("Cheese"));
		escolhaLanches.add(new JRadioButton("Big"));
		for(JRadioButton rb: escolhaLanches) {
			panelLanches.add(rb);
			bgLanches.add(rb);
		}
		
		JPanel panelPontos = new JPanel();
		panelPontos.setLayout(new FlowLayout());
		ButtonGroup bgPontos = new ButtonGroup();
		escolhaPontos = new ArrayList<>();
		escolhaPontos.add(new JRadioButton("Mal Passado"));
		escolhaPontos.add(new JRadioButton("No Ponto"));
		escolhaPontos.add(new JRadioButton("Bem Passado"));
		for(JRadioButton rb: escolhaPontos) {
			panelPontos.add(rb);
			bgPontos.add(rb);
		}
		
		JPanel panelAdicionals = new JPanel();
		panelAdicionals.setLayout(new FlowLayout());
		escolhaAdicionals = new ArrayList<>();
		escolhaAdicionals.add(new JCheckBox("Queijo"));
		escolhaAdicionals.add(new JCheckBox("Maionese"));
		escolhaAdicionals.add(new JCheckBox("Carne"));
		for(JCheckBox cb: escolhaAdicionals) {
			panelAdicionals.add(cb);
		}
		
		panelEscolhas.setLayout(new GridLayout(3, 1));
		panelEscolhas.add(panelLanches);
		panelEscolhas.add(panelPontos);
		panelEscolhas.add(panelAdicionals);
		
		panelBotoes.setLayout(new FlowLayout(FlowLayout.TRAILING));
		panelBotoes.add(botaoOk);
		
		pack();
		setVisible(true);
		
	}

}
