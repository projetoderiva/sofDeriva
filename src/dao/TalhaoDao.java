package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Fazenda;
import model.Talhao;


public class TalhaoDao {
	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public void salvar(Talhao talhao) throws SQLException{
		
		String sql = "insert into talhao (nome, localizacao, tipo) " +
						" values (?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, talhao.getNome());
		ps.setString(2, talhao.getLocalizacao());
		ps.setString(3, talhao.getTipo());
		ps.execute();
		
	}
	
	public Fazenda buscarFazenda(int idFazenda) throws SQLException{
		
		String sql = "select * from fazenda where id = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		Fazenda fazenda = null;
				
		while (rs.next()){
			fazenda = new Fazenda();
			fazenda.setId(rs.getInt("id"));
			fazenda.setCidade(rs.getString("cidade"));
			fazenda.setEstado(rs.getString("estado"));
			fazenda.setNome(rs.getString("nome"));
			fazenda.setTamanho(rs.getString("tamanho"));
			
		}
		
		
		return fazenda;
	}
	
	public List<Talhao> listar(int idFazenda) throws SQLException{
		
		String sql = "select * from talhao where idFazenda = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, idFazenda);
		
		ResultSet rs = ps.executeQuery();
		
		Talhao talhao = null;
		List<Talhao> talhoes = new ArrayList<Talhao>();
		
		Fazenda fazenda = new Fazenda();
		fazenda = buscarFazenda(idFazenda);
		
		while (rs.next()){
			talhao = new Talhao();
			talhao.setFazenda(fazenda);
			talhao.setId(rs.getInt("id"));
		/*	fazenda.setCidade(rs.getString("cidade"));
			fazenda.setEstado(rs.getString("estado"));
			fazenda.setNome(rs.getString("nome"));
			fazenda.setTamanho(rs.getString("tamanho"));*/
			talhoes.add(talhao);
		}
		
		
		return talhoes;
	}
}
