package br.com.unieuro.pi;

import java.sql.*;

import javax.swing.JOptionPane;

import br.com.unieuro.pi.dal.ModuloConexao;

public class TesteConexaoBD {
	// Usando a variável conexão do DAL
	static Connection conexao = null;
	// Criando variáveis especiais para conexão com o BD
	// Prepared Statement e ResultSet são frameworks do pacote java.sql
	// que servem para executar as instruções sql
	PreparedStatement pst = null;
	ResultSet rs = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conexao = ModuloConexao.conector();

		if (conexao == null) {
			System.out.println("Erro ao conectar ao BD");
			JOptionPane.showMessageDialog(null, "Erro ao conectar no Banco de Dados!");
		}

		else {
			System.out.println("NOME/DRIVER DA CONEXÃO: " + conexao);
			JOptionPane.showMessageDialog(null, "Sucesso ao conectar no Banco de Dados!");

		}

	}

}
