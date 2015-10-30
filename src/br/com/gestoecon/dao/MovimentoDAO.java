package br.com.gestoecon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gestoecon.bean.MovimentoVO;

public class MovimentoDAO {


	/** INSERIR MOVIMENTO NO BANCO DE DADOS. */

	public static void inserirMovimento(MovimentoVO objMovimento) {

		String sqlInsercao = "insert into movimento (nome, valor, data, tipo ) values (?,?,?,?)";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlInsercao);
			pstm.setString(1, objMovimento.getNome());
			pstm.setDouble(2, objMovimento.getValor());
			
			

			pstm.executeUpdate();
			System.out.println("Insercao Feita Com Sucesso!");
		} catch (Exception e) {
			System.out.println("Erro na insercao!\nMotivo: " + e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
	}

	/** EXCLUIR CONTA DO BANCO DE DADOS. */

	public void excluirMovimento(MovimentoVO objMovimento) {
		String sqlExclusao = "delete from movimento where id_movimento = ?";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlExclusao);
			pstm.setInt(1, objMovimento.getId_movimento());
			pstm.executeUpdate();
			System.out.println("Exclusao Feita com Sucesso!");
		} catch (Exception e) {
			System.out.println("Erro na exclusao da Conta!\nMotivo: " + e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
	}

	/** LISTAR MOVIMENTO */
	
	public static List<MovimentoVO> listarMovimento() {

		List<MovimentoVO> lista = new ArrayList<MovimentoVO>();

		String sqlLista = "select * from movimento";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlLista);

			// Commit no banco
			ResultSet rs = pstm.executeQuery();
			// Tirando do Resultset e colocando no objeto usuario
			while (rs.next()) {
				MovimentoVO movimento = new MovimentoVO();
				movimento.setId_movimento(rs.getInt("id_movimento"));
				movimento.setNome(rs.getString("nome"));
				movimento.setValor(rs.getDouble("valor"));

				lista.add(movimento);
			}
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}


	/** ALTERANDO CONTA NO BANCO */

	public static void alterarMovimento(MovimentoVO objMovimento) {
		String sqlAtualizacao = "update movimento set nome =?, valor =?, data =?, tipo=? where id_movimento = ?";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlAtualizacao);
			pstm.setString(1, objMovimento.getNome());
			pstm.setDouble(2, objMovimento.getValor());
			pstm.setInt(3, objMovimento.getId_movimento());
			
			
			pstm.executeUpdate();
			System.out.println("Atualizacao Feita com Sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro na atualizacao do Usuario");
		} finally {
			ConexaoDAO.closeConnection(objCon);

		}
	}

	/** CONSULTAR CONTA NO BANCO DE DADOS. */

	public static MovimentoVO consultarMovimento(int id_movimento) {
		MovimentoVO objMovimento = new MovimentoVO();
		String sqlConsulta = "select  * from movimento where id_movimento = ?";
		PreparedStatement pstm = null;
		Connection objCon = null;
		ResultSet rs = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlConsulta);
			pstm.setInt(1, id_movimento);
			rs = pstm.executeQuery();
			rs.next();
			if (rs.getRow() == 0) {
				objMovimento = null;
				System.out.println("Movimento não consta na base de dados!");
			} else {
				objMovimento.setId_movimento(rs.getInt("id_movimento"));
				objMovimento.setNome(rs.getString("nome"));
				objMovimento.setValor(rs.getDouble("valor"));
			}
		} catch (SQLException e) {
			System.out.println("Erro na consulta da conta!\nMotivo: "
					+ e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
		return objMovimento;
	}

}

	
	

