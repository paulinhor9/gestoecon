package br.com.gestoecon.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gestoecon.bean.UsuarioVO;

/**
 * Servlet Filter implementation class SecureFilter
 */

public class SecureFilter implements Filter {

	public SecureFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		
		HttpSession session = req.getSession();

		if (session.getAttribute("usuarioOK") == null) {
			RequestDispatcher direcionador = request
					.getRequestDispatcher("index.jsp");
			direcionador.forward(request, response);
		}

		chain.doFilter(request, response);

	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	

}
