package entidade;

public class Aluno {
	
	private int ra;
	private String nome;
	
	public Aluno(int ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}
	
	public int getRa() {
		return ra;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + "]";
	}
	
	

}
