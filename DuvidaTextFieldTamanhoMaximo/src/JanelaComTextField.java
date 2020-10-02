import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaComTextField extends JFrame {
	
	public JanelaComTextField() {
		
		setLayout(new GridLayout(2, 1));
		add(new PainelTextField("Primeiro Nome", 5));
		add(new PainelTextField("Segundo Nome", 5));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	class PainelTextField extends JPanel {
		JTextField txtFld;
		String msgTam; 
		JLabel labelMsg;
		int tamMax;
		public PainelTextField(String label, int tamMax) {
			this.tamMax = tamMax;
			
			msgTam = "* tamanho do " + label + " deve ser menor ou igual a " + tamMax;
			
			setLayout(new BoxLayout(PainelTextField.this, BoxLayout.PAGE_AXIS));
			add(new JLabel(label));
			txtFld = new JTextField(2*tamMax);
			txtFld.addKeyListener(new VerificadorTamanho());
			add(txtFld);
			String espacos = " ";
			for(int i=0; i<2*msgTam.length(); i++)espacos+=" ";
			labelMsg = new JLabel(espacos);
			labelMsg.setForeground(Color.RED);
			add(labelMsg);
		}
		
		void verificaTamanho() {
			if( txtFld.getText().length() <= tamMax) {
				labelMsg.setText(" ");
			}
			else {
				labelMsg.setText(msgTam);
			}
		}

		
		class VerificadorTamanho implements KeyListener {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				verificaTamanho();
			}
			
		}
	}
	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaComTextField();
            }
        });
	}

}
