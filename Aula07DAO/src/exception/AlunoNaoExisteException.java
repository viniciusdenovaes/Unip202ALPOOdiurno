package exception;


public class AlunoNaoExisteException extends Exception{
	
	private int ra;
	
	public AlunoNaoExisteException(int ra) {
		this.ra = ra;
	}

	public int getRa() {
		return this.ra;
	}
	

}
