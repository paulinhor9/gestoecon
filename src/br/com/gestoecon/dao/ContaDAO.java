package br.com.gestoecon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.gestoecon.bean.ContaVO;

public class ContaDAO {

// INSERIR CONTA NO BANCO DE DADOS.
	
	public static void inserirConta(ContaVO objConta) {

		String sqlInsercao = "insert into conta (nome, saldo) values (?,?)";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlInsercao);
			pstm.setString(1, objConta.getNome());
			pstm.setDouble(2, objConta.getSaldo());
			
			pstm.executeUpdate();
			System.out.println("Insercao Feita Com Sucesso!");
		} catch (Exception e) {
			System.out.println("Erro na insercao!\nMotivo: " + e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
	}

	// EXCLUIR USUARIO DO BANCO DE DADOS.
	
	public void excluirConta(ContaVO objConta) {
		String sqlExclusao = "delete from conta where nome = ?";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlExclusao);
			pstm.setString(1, objConta.getNome());
			pstm.executeUpdate();
			System.out.println("Exclusao Feita com Sucesso!");
		} catch (Exception e) {
			System.out.println("Erro na exclusao do Usuario!\nMotivo: "
					+ e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}

	}
	
	
	
}
