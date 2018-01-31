package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.Plataforma;

public class PlataformaDao {
	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Plataforma plataforma) throws SQLException{

		String sql = 
				"insert into plataforma (localizacao, data) " +
						" values (?, ?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setString(1, plataforma.getLocalizacao());
		ps.setDate(2, (Date) plataforma.getDataInstalacao().getTime());	
		ps.execute();

	}
}
