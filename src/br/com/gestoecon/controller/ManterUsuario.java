package br.com.gestoecon.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gestoecon.bean.UsuarioVO;
import br.com.gestoecon.dao.UsuarioDAO;

/**
 * Servlet implementation class ManterUsuario
 */
@WebServlet("/ManterUsuario")
public class ManterUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManterUsuario() {
		super();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String acao = request.getParameter("acao");
		
		

		/** AUTENTICAR USUARIO. */

		if (acao.equals("autenticarUsuario")) {

			// RECUPERANDO OS PARAMETROS
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");

			// VALIDAR LOGIN E SENHA

			UsuarioVO objUsuario = br.com.gestoecon.dao.UsuarioDAO
					.consultarUsuario(email);
			RequestDispatcher direcionador;
			if (objUsuario.getSenha().trim().equals(senha.trim())) {
				request.getSession().setAttribute("usuarioOK", objUsuario);
				//request.getRequestDispatcher("Home.jsp").forward(request, response);
				response.sendRedirect("Home.jsp");
			} else
				//request.getRequestDispatcher("falhaLogin.jsp").forward(request, response);
				response.sendRedirect("falhaLogin.jsp");
		}
		
		
		/**
		 * FINALIZAR SESSÃO.
		 */
		
		if(acao.equals("sair")){
			HttpSession session = request.getSession();
			Object usuarioLogado = session.getAttribute("usuarioOK");
			if(usuarioLogado != null){
				session.removeAttribute("usuarioOk");
				session.invalidate();
				
				response.sendRedirect("index.jsp");
			}
			else{
				response.sendRedirect("index.jsp");
			}
		}
		
		/** INSERIR USUARIO */

		else if (acao.equals("inserirUsuario")) {
			String email = request.getParameter("email");
			String nome = request.getParameter("nome");
			String senha = request.getParameter("senha");

			// CRIANDO O OBJETO USUARIO
			UsuarioVO objUsuario = new UsuarioVO(email, nome, senha);

			// INSERINDO AS INFORMAÇÕES DO USUARIO
			UsuarioDAO.inserirUsuario(objUsuario);
			response.sendRedirect("usuario/usuarioInserirSucesso.jsp");

		}

		/** EXCLUIR USUARIO */

		else if (acao.equals("excluirUsuario")) {

			UsuarioVO objUsuario = new UsuarioVO();

			// Quando você logou colocou o objeto na session...recuperando
			// abaixo
			objUsuario = (UsuarioVO) request.getSession().getAttribute(
					"usuarioOK");

			// Caso a senha e email informados não sejam iguais a do usuário
			// logado um exceção sobe.
			if (!objUsuario.getEmail().equals(request.getParameter("email"))
					&& !objUsuario.getSenha().equals(
							request.getParameter("senha"))) {
				// dpois você arruma para mostrar na tela essa mensagem
				System.out.println("Dados não conferem");

			} else { // usando else para facilitar, mas o melhor seria throws
						// exception e apresentar mensagem

				UsuarioDAO UsuarioDAO = new UsuarioDAO();
				UsuarioDAO.excluirUsuario(objUsuario);
				response.sendRedirect("usuario/usuarioExcluirSucesso.jsp");
			}
		}

		/** ALTERAR USUARIO */

		else if (acao.equals("alterarUsuario")) {

			String email = request.getParameter("email");
			String nome = request.getParameter("nome");
			String senha = request.getParameter("senha");

			// CRIANDO O OBJETO USUARIO
			UsuarioVO objUsuario = new UsuarioVO(email, nome, senha);

			// INSERINDO AS INFORMAÇÕES DO USUARIO
			UsuarioDAO.alterarUsuario(objUsuario);
			response.sendRedirect("usuario/usuarioAlterarSucesso.jsp");

		}

		/** LISTAR USUARIO */
		else if (acao.equals("listarUsuario")) {

			UsuarioDAO objUsuario = new UsuarioDAO();

			request.getSession(true).setAttribute("lista",
					objUsuario.listarUsuario());

			RequestDispatcher direcionador = request
					.getRequestDispatcher("Home.jsp");
			direcionador.forward(request, response);
		}

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");

		if (acao.equals("listarUsuario")) {

			UsuarioDAO objUsuario = new UsuarioDAO();

			request.getSession(true).setAttribute("lista",
					objUsuario.listarUsuario());

			RequestDispatcher direcionador = request
					.getRequestDispatcher("usuario/usuarioListar.jsp");
			direcionador.forward(request, response);

		}
	}

}
