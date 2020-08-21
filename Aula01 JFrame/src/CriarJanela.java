import javax.swing.JFrame;

public class CriarJanela {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Janela Teste - Primeira Aula");
		
		// O tamanho da janela
		janela.setSize(400, 200);
		
		// O comportamento da janela quando o 
		// botão para fechar é pressionado
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Tornar a janela visível.
		janela.setVisible(true);
	}

}
