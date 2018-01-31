package model;

public class Fazenda {
	private int id;
	private String nome;
	private String registro;
	private String cidade;
	private String estado;
	private String tamanho;
	
	public Fazenda() {
		
	}

	public Fazenda(String nome, String registro, String cidade, String estado, String tamanho) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.cidade = cidade;
		this.estado = estado;
		this.tamanho = tamanho;
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

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
