package model;

import java.util.Date;

public class RssfDados {

	private long id;
	private Double sensorTemperatura;
	private Double sensorUmidade;
	private Double sensorUltrassonico;
	private Double sensorAnemometro;
	private Double gpsLongitude;
	private Double gpsLatitude;
	private Double gpsVelocidade;
	private Date gpsData;
	private Double gpsHora;
	
	
	
	public RssfDados() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public RssfDados(Double sensorTemperatura, Double sensorUmidade, Double sensorUltrassonico, Double sensorAnemometro,
			Double gpsLongitude, Double gpsLatitude, Double gpsVelocidade, Date gpsData, Double gpsHora) {
		super();
		this.sensorTemperatura = sensorTemperatura;
		this.sensorUmidade = sensorUmidade;
		this.sensorUltrassonico = sensorUltrassonico;
		this.sensorAnemometro = sensorAnemometro;
		this.gpsLongitude = gpsLongitude;
		this.gpsLatitude = gpsLatitude;
		this.gpsVelocidade = gpsVelocidade;
		this.gpsData = gpsData;
		this.gpsHora = gpsHora;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Double getSensorTemperatura() {
		return sensorTemperatura;
	}
	public void setSensorTemperatura(Double sensorTemperatura) {
		this.sensorTemperatura = sensorTemperatura;
	}
	public Double getSensorUmidade() {
		return sensorUmidade;
	}
	public void setSensorUmidade(Double sensorUmidade) {
		this.sensorUmidade = sensorUmidade;
	}
	public Double getSensorUltrassonico() {
		return sensorUltrassonico;
	}
	public void setSensorUltrassonico(Double sensorUltrassonico) {
		this.sensorUltrassonico = sensorUltrassonico;
	}
	public Double getSensorAnemometro() {
		return sensorAnemometro;
	}
	public void setSensorAnemometro(Double sensorAnemometro) {
		this.sensorAnemometro = sensorAnemometro;
	}
	public Double getGpsLongitude() {
		return gpsLongitude;
	}
	public void setGpsLongitude(Double gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}
	public Double getGpsLatitude() {
		return gpsLatitude;
	}
	public void setGpsLatitude(Double gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}
	public Double getGpsVelocidade() {
		return gpsVelocidade;
	}
	public void setGpsVelocidade(Double gpsVelocidade) {
		this.gpsVelocidade = gpsVelocidade;
	}
	public Date getGpsData() {
		return gpsData;
	}
	public void setGpsData(Date gpsData) {
		this.gpsData = gpsData;
	}
	public Double getGpsHora() {
		return gpsHora;
	}
	public void setGpsHora(Double gpsHora) {
		this.gpsHora = gpsHora;
	}

	
	
	
	//gps longitude latitude altitude/*
	/*
	 * 
	 * sensor ultrassonico
	 * sensor temperatura 
	 * sensor de umidade
	 * sensor Anemometro
	 * gps longitude latitude altitude/*
	 */
}
