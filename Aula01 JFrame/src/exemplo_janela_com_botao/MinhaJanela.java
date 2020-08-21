package exemplo_janela_com_botao;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MinhaJanela extends JFrame {
	
	public MinhaJanela(String titulo) {
		super(titulo);
		
		setSize(new Dimension(400, 200));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton botao01 = new JButton("Botão 01");
		
		botao01.addActionListener(new ComportamentoBotao());
		
		add(botao01);
		
		
		setVisible(true);
	}
	
	
	
	

}
