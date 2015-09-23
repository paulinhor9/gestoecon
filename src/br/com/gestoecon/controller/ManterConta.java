package br.com.gestoecon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gestoecon.bean.ContaVO;
import br.com.gestoecon.dao.ContaDAO;

/**
 * Servlet implementation class ManterConta
 */
@WebServlet("/ManterConta")
public class ManterConta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManterConta() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String acao = request.getParameter("acao");

		/** INSERIR CONTA */

		if (acao.equals("inserirConta")) {
			String nome = request.getParameter("nome");
			double saldoInicial = Double.valueOf(request.getParameter("saldoInicial"));

			// CRIANDO O OBJETO CONTA
			ContaVO objConta = new ContaVO(nome, saldoInicial);

			// INSERINDO AS INFORMAÇÕES DA CONTA
			ContaDAO.inserirConta(objConta);
			response.sendRedirect("contas/contaInserirSucesso.jsp");

		}

		/** EXCLUIR CONTA */

		else if (acao.equals("excluirConta")) {

			ContaVO objConta = new ContaVO();
			objConta.setNome(request.getParameter("nome"));

			ContaDAO contaDAO = new ContaDAO();
			contaDAO.excluirConta(objConta);
			response.sendRedirect("contas/contaExcluirSucesso.jsp");

		}
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
