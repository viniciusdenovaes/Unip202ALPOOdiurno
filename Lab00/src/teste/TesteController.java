package teste;

import controller.Controller;
import dao.DaoCsv;
import view.ViewTerminal;

public class TesteController {
	
	public static void main(String[] args) {
		
		Controller controller = new Controller(new DaoCsv(), new ViewTerminal());
		
		controller.init();
		
	}

}
