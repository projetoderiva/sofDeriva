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
					"postgres", "123");
		} catch (Exception ex) {
			ex.printStackTrace(); 
		} 
		return null;
	}
	
}