<%@page import="br.com.gestoecon.bean.UsuarioVO"%>
<%@page import="br.com.gestoecon.dao.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Valida Sessão</title>
</head>
<body>
<%
  UsuarioVO objUsuario = (UsuarioVO) session.getAttribute("usuarioOK");
  if (objUsuario==null)
	  response.sendRedirect("Home.jsp");
  else{
	  response.sendRedirect("falhaLogin.jsp");
  }
%>

</body>
</html>