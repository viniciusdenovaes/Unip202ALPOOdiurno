package entidade;

public class Filme {
	
	private String nome;
	private int ano;
	
	public Filme(String aNome, int aAno) {
		this.nome = aNome;
		this.ano = aAno;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "nome: " + this.nome + "; ano: " + this.ano;
		return res;
	}

}
