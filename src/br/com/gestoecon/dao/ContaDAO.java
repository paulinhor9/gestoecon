package br.com.gestoecon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gestoecon.bean.ContaVO;

public class ContaDAO {

	/** INSERIR CONTA NO BANCO DE DADOS. */

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

	/** EXCLUIR CONTA DO BANCO DE DADOS. */

	public void excluirConta(ContaVO objConta) {
		String sqlExclusao = "delete from conta where id = ?";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlExclusao);
			pstm.setInt(1, objConta.getId());
			pstm.executeUpdate();
			System.out.println("Exclusao Feita com Sucesso!");
		} catch (Exception e) {
			System.out.println("Erro na exclusao do Usuario!\nMotivo: " + e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
	}

	/** LISTAR CONTAS */

	public static List<ContaVO> listarConta() {

		List<ContaVO> lista = new ArrayList<ContaVO>();

		String sqlLista = "select * from conta";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlLista);

			// Commit no banco
			ResultSet rs = pstm.executeQuery();
			// Tirando do Resultset e colocando no objeto usuario
			while (rs.next()) {
				ContaVO conta = new ContaVO();
				conta.setId(rs.getInt("id"));
				conta.setNome(rs.getString("nome"));
				conta.setSaldo(rs.getDouble("saldo"));

				lista.add(conta);
			}
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}


	// ALTERANDO USUARIO DO BANCO DE DADOS.

	public static void alterarConta(ContaVO objConta) {
		String sqlAtualizacao = "update conta set nome =?, saldo =? where id = ?";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlAtualizacao);
			pstm.setString(1, objConta.getNome());
			pstm.setDouble(2, objConta.getSaldo());
			pstm.setInt(3, objConta.getId());
			
			
			pstm.executeUpdate();
			System.out.println("Atualizacao Feita com Sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro na atualizacao do Usuario");
		} finally {
			ConexaoDAO.closeConnection(objCon);

		}
	}

	// CONSULTAR USUARIO NO BANCO DE DADOS.

	public static ContaVO consultarConta(int id) {
		ContaVO objConta = new ContaVO();
		String sqlConsulta = "select  * from conta where id = ?";
		PreparedStatement pstm = null;
		Connection objCon = null;
		ResultSet rs = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlConsulta);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			rs.next();
			if (rs.getRow() == 0) {
				objConta = null;
				System.out.println("Conta n�o consta na base de dados!");
			} else {
				objConta.setId(rs.getInt("id"));
				objConta.setNome(rs.getString("nome"));
				objConta.setSaldo(rs.getDouble("saldo"));
			}
		} catch (SQLException e) {
			System.out.println("Erro na consulta da conta!\nMotivo: "
					+ e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
		return objConta;
	}

}
