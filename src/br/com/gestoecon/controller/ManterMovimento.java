package br.com.gestoecon.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gestoecon.bean.MovimentoVO;
import br.com.gestoecon.dao.MovimentoDAO;

/**
 * Servlet implementation class ManterMovimento
 */
@WebServlet("/ManterMovimento")
public class ManterMovimento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public ManterMovimento() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		/** INSERIR MOVIMENTO */

		if (acao.equals("inserirMovimento")) {
			String nome = request.getParameter("nome");
			double valor = Double.parseDouble(request.getParameter("valor"));

			// CRIANDO O OBJETO MOVIMENTO
			MovimentoVO objMovimento = new MovimentoVO();

			objMovimento.setNome(nome);
			objMovimento.setValor(valor);

			// INSERINDO AS INFORMAÇÕES DO MOVIMENTO
			MovimentoDAO.inserirMovimento(objMovimento);
			response.sendRedirect("movimentos/movimentoInserirSucesso.jsp");

		}

		/** EXCLUIR MOVIMENTO */

		else if (acao.equals("excluirMovimento")) {

			int id_movimento = Integer.parseInt(request.getParameter("id_movimento"));
			MovimentoVO objMovimento = new MovimentoVO();

			objMovimento.setId_movimento(id_movimento);

			MovimentoDAO movimentoDAO = new MovimentoDAO();
			movimentoDAO.excluirMovimento(objMovimento);
			response.sendRedirect("movimentos/movimentoExcluirSucesso.jsp");
			
		/** ATUALIZAR MOVIMENTO */	

		} else if (acao.equals("alterarMovimento")) {
			int id_movimento = Integer.parseInt(request.getParameter("id_movimento"));
			String nome = request.getParameter("nome");
			Double valor = Double.parseDouble(request.getParameter("valor"));

			MovimentoDAO movimentoDAO = new MovimentoDAO();

			MovimentoVO movimento = MovimentoDAO.consultarMovimento(id_movimento);

			movimento.setNome(nome);
			movimento.setValor(valor);

			movimentoDAO.alterarMovimento(movimento);

			response.sendRedirect("ManterMovimento?acao=listarMovimento");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

	/** LISTAR MOVIMENTO */	
		
		if (acao.equals("listarMovimento")) {

			// BUscando a lista do banco
			List<MovimentoVO> lista = MovimentoDAO.listarMovimento();

			// Colocando a lista como atributo para o jsp acesssa como parametro
			request.setAttribute("listaMovimento", lista);

			// Encaminhando para o jsp
			request.getRequestDispatcher("movimentos/movimentoListar.jsp").forward(request, response);
		
	/** EDITAR MOVIMENTO */		
			
		} else if (acao.equals("editarMovimento")) {
			int id_movimento = Integer.parseInt(request.getParameter("id_movimento"));
			MovimentoDAO movimentoDAO = new MovimentoDAO();

			MovimentoVO movimento = movimentoDAO.consultarMovimento(id_movimento);

			request.setAttribute("movimento", movimento);

			request.getRequestDispatcher("movimentos/movimentoEditar.jsp").forward(request, response);

		}

	}
}
