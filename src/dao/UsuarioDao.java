package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Usuario;

public class UsuarioDao {

	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public void salvar(Usuario usuario) throws SQLException{
		
		String sql = 
				"insert into usuario (nome, email, senha) " +
						" values (?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, usuario.getNome());
		ps.setString(2, usuario.getEmail());
		ps.setString(3, usuario.getSenha());
		ps.execute();
		
	}
}
