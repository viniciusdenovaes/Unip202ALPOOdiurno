package exemplo_janela_com_botao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComportamentoBotao implements ActionListener{

	int quantidadeVezesPressionado = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		quantidadeVezesPressionado++;
		System.out.println("Botao pressionado " + quantidadeVezesPressionado + " vezes");
	}

}
