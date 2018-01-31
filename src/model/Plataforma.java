package model;

import java.util.Calendar;


public class Plataforma {

	private long id;
	private String localizacao;
	private Calendar dataInstalacao;
	
	
	public Plataforma() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plataforma( String localizacao) {
		super();
	
		this.localizacao = localizacao;

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public Calendar getDataInstalacao() {
		return dataInstalacao;
	}
	public void setDataInstalacao(Calendar dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}
	
	
	
	
}
