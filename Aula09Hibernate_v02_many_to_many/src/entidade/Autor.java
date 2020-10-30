package entidade;

import java.util.HashSet;
import java.util.Set;

public class Autor {
	
	private int id;
	private String sobreNome;
	private String primeiroNome;
	
	Set<Livro> livros = new HashSet<>();
	
	public Autor() {
		super();
	}

	public Autor(String sobreNome, String primeiroNome) {
		this();
		this.sobreNome = sobreNome;
		this.primeiroNome = primeiroNome;
	}

	public Autor(int id, String sobreNome, String primeiroNome) {
		this(sobreNome, primeiroNome);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public Set<Livro> getLivros() {
		return livros;
	}

	public void setLivros(Set<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", sobreNome=" + sobreNome + ", primeiroNome=" + primeiroNome + "]";
	}
	

}
