<%@page import="br.com.gestoecon.bean.UsuarioVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alteração de Usuário</title>
</head>
<body>
	<%
	UsuarioVO usuario = 	(UsuarioVO)session.getAttribute("usuarioOK");
	%>

	GestoEcon
	<br> Alterar dados de usuário.
	<br>
	<br><center>
	<form action="../ManterUsuario" method="post">
	 <BR>
		Email: <input type="text" name="email" value="<%=
			 usuario.getEmail()
		%>"> <br>
		Nome: <input type="text" name="nome" value="<%=
			 usuario.getNome()
		%>"> <br>
		Senha: <input type="password" name="senha"  value="<%=
			 usuario.getSenha()
		%>"><br><br> 
		
		<br> 
		<input type  = "hidden" name = "acao" value ="alterarUsuario">
		<input type="submit" value="Alterar">
		<input type="reset" value="Limpar">
		
		
			</form>
			<input type="submit" value="Voltar" onclick = "location.href ='../Home.jsp'" >
			</center>
</body>
</html>