package br.com.unieuro.pi.dal;

import java.sql.*;

//DAL = Data Access Layer

public class ModuloConexao {
	// Método responsável por estabelecer a conexão com o BD
	
	public static Connection conector() {
		java.sql.Connection conexao = null;
		// Chamando o Driver de conexão jdbc
		String driver = "com.mysql.jdbc.Driver";
		// Armazenando informações referente ao BD
		String url = "jdbc:mysql://localhost:3306/dbinfox";
		String user = "root";
		String pass = "";
		// Estabelecendo a conexão com o BD / tratando exceções / erro
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url, user, pass);
			return conexao;
		} catch (Exception e) {
			// System.out.println(e); // caso a conexão falhe retorne a exceção

			return null;
		}
	}

}
