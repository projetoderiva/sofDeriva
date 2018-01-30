package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.RssfDados;

public class RssfDao {
	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public void salvar(RssfDados dados) throws SQLException{
		
		String sql = 
				"insert into rssf (sensorTemperatura, sensorUmidade, sensorUltrassonico, sensorAnemometro, gpsLongitude, gpsLatitude,gpsVelocidade, gpsData, gpsHora) " +
						" values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setDouble(1, dados.getSensorTemperatura());
		ps.setDouble(2, dados.getSensorUmidade());
		ps.setDouble(3, dados.getSensorUltrassonico());
		ps.setDouble(4, dados.getSensorAnemometro());
		ps.setDouble(5, dados.getGpsLongitude());
		ps.setDouble(6, dados.getGpsLatitude());
		ps.setDouble(7, dados.getGpsVelocidade());
		ps.setDate(8, (Date) dados.getGpsData());
		ps.setDouble(9, dados.getGpsHora());
		ps.execute();

	}
	
	public List<RssfDados> listarDados() throws SQLException{
		
		String sql = "select * from rssf";
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		RssfDados rssfDados = null;
		List<RssfDados> listRssfDados = new ArrayList<RssfDados>();
		
		while (rs.next()){
			rssfDados = new RssfDados();
			rssfDados.setId(rs.getLong("id"));
			rssfDados.setSensorTemperatura(rs.getDouble("sensorTemperatura"));
			rssfDados.setSensorUmidade(rs.getDouble("sensorUmidade"));
			rssfDados.setSensorUltrassonico(rs.getDouble("sensorUmidade"));
			rssfDados.setSensorAnemometro(rs.getDouble("sensorAnemometro"));
			rssfDados.setGpsLongitude(rs.getDouble("gpsLongitude"));
			rssfDados.setGpsLatitude(rs.getDouble("gpsLatitude"));
			rssfDados.setGpsVelocidade(rs.getDouble("gpsVelocidade"));
			rssfDados.setGpsData(rs.getDate("gpsData"));
			rssfDados.setGpsHora(rs.getDouble("gspHora"));
			listRssfDados.add(rssfDados);
		}
		
		
		return listRssfDados;
	}
}
