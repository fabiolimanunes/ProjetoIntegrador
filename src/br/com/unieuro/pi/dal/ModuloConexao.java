package br.com.unieuro.pi.dal;

import java.sql.*;

//DAL = Data Access Layer

public class ModuloConexao {
	// M�todo respons�vel por estabelecer a conex�o com o BD
	
	public static Connection conector() {
		java.sql.Connection conexao = null;
		// Chamando o Driver de conex�o jdbc
		String driver = "com.mysql.jdbc.Driver";
		// Armazenando informa��es referente ao BD
		String url = "jdbc:mysql://localhost:3306/dbinfox";
		String user = "root";
		String pass = "";
		// Estabelecendo a conex�o com o BD / tratando exce��es / erro
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url, user, pass);
			return conexao;
		} catch (Exception e) {
			// System.out.println(e); // caso a conex�o falhe retorne a exce��o

			return null;
		}
	}

}
