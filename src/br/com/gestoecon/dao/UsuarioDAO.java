package br.com.gestoecon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.gestoecon.bean.UsuarioVO;

public class UsuarioDAO {

	// INSERIR USUARIO NO BANCO DE DADOS.

	public static void inserirUsuario(UsuarioVO objUsuario) {

		String sqlInsercao = "insert into usuario (email, nome, senha) values (?,?,?)";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlInsercao);
			pstm.setString(1, objUsuario.getEmail());
			pstm.setString(2, objUsuario.getNome());
			pstm.setString(3, objUsuario.getSenha());

			pstm.executeUpdate();
			System.out.println("Insercao Feita Com Sucesso!");
		} catch (Exception e) {
			System.out.println("Erro na insercao!\nMotivo: " + e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
	}

	// EXCLUIR USUARIO DO BANCO DE DADOS.

	public void excluirUsuario(UsuarioVO objUsuario) {
		String sqlExclusao = "delete from usuario where (email,senha) = (?,?)";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlExclusao);
			pstm.setString(1, objUsuario.getEmail());
			pstm.setString(2, objUsuario.getSenha());

			pstm.executeUpdate();
			System.out.println("Exclusao Feita com Sucesso!");
		} catch (Exception e) {
			System.out.println("Erro na exclusao do Usuario!\nMotivo: "
					+ e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}

	}

	// ALTERANDO USUARIO DO BANCO DE DADOS.

	public static void alterarUsuario(UsuarioVO objUsuario) {
		String sqlAtualizacao = "update usuario set email =?, nome =?, senha =?  where email = ?";
		PreparedStatement pstm = null;
		Connection objCon = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlAtualizacao);
			pstm.setString(1, objUsuario.getEmail());
			pstm.setString(2, objUsuario.getNome());
			pstm.setString(3, objUsuario.getSenha());
			
			
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

	public static UsuarioVO consultarUsuario(String email) {
		UsuarioVO objUsuario = new UsuarioVO();
		String sqlConsulta = "select email, nome, senha from usuario where email =  ?";
		PreparedStatement pstm = null;
		Connection objCon = null;
		ResultSet rs = null;

		try {
			objCon = ConexaoDAO.getConnection();
			pstm = objCon.prepareStatement(sqlConsulta);
			pstm.setString(1, email);
			rs = pstm.executeQuery();
			rs.next();
			if (rs.getRow() == 0) {
				objUsuario = null;
				System.out.println("Usuario não consta na base de dados!");
			} else {
				objUsuario.setEmail(rs.getString("email"));
				objUsuario.setNome(rs.getString("nome"));
				objUsuario.setSenha(rs.getString("senha"));
			}
		} catch (SQLException e) {
			System.out.println("Erro na consulta do Usuario!\nMotivo: "
					+ e.getMessage());
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
		return objUsuario;
	}

		/** LISTAR USUARIOS */
	
	public ResultSet listarUsuario() {
		PreparedStatement pstm = null;
		Connection objCon = null;
		ResultSet rs = null;

		String sqlListar = "select login, nome, senha from usuario";
		try {
			objCon = ConexaoDAO.getConnection();
			Statement st = objCon.createStatement();
			rs = st.executeQuery(sqlListar);

		} catch (Exception e) {
			System.out.println("Erro na listagem de Usuarios");
		} finally {
			ConexaoDAO.closeConnection(objCon);
		}
		return rs;
	}

}
