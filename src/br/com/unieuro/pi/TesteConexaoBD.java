package br.com.unieuro.pi;

import java.sql.*;

import javax.swing.JOptionPane;

import br.com.unieuro.pi.dal.ModuloConexao;

public class TesteConexaoBD {
	// Usando a vari�vel conex�o do DAL
	static Connection conexao = null;
	// Criando vari�veis especiais para conex�o com o BD
	// Prepared Statement e ResultSet s�o frameworks do pacote java.sql
	// que servem para executar as instru��es sql
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
			System.out.println("NOME/DRIVER DA CONEX�O: " + conexao);
			JOptionPane.showMessageDialog(null, "Sucesso ao conectar no Banco de Dados!");

		}

	}

}
