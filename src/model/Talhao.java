package model;

public class Talhao {
	private int id;
	private String nome;
	private String localizacao;
	private String tipo;
	private Fazenda fazenda;
	
	
	
	public Fazenda getFazenda() {
		return fazenda;
	}

	public void setFazenda(Fazenda fazenda) {
		this.fazenda = fazenda;
	}

	public Talhao() {
		
	}

	public Talhao(String nome, String localizacao, String tipo) {
		super();
		this.nome = nome;
		this.localizacao = localizacao;
		this.tipo = tipo;
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

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
