package dao.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection conseguirConexao() {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/bancoderiva",
					//usuario    //senha
					"postgres", "senha");
		} catch (Exception ex) {
			ex.printStackTrace(); 
		} 
		return null;
	}
	
}