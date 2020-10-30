package entidade;

public class Editora {
	
	private int id;
	private String nome;
	private String url;
	
	public Editora() {
		super();
	}
	
	public Editora(String nome, String url) {
		this();
		this.nome = nome;
		this.url = url;
	}
	
	public Editora(int id, String nome, String url) {
		this(nome, url);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "Editora [id=" + id + ", nome=" + nome + ", url=" + url + "]";
	}
	
	
	
	

}
