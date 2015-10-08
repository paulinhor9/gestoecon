<!DOCTYPE html>
<%@page import="br.com.gestoecon.bean.UsuarioVO"%>
<head>
<%
	UsuarioVO objUsuario = (UsuarioVO) request.getAttribute("usuarioOk");
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Editar Usuario</title>
</head>
<jsp:include page="../cabecalho.jsp"></jsp:include>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	GestoEcon
	<br> Editar Usuario.
	<br>
	<br>
	<center>
		<form action="ManterUsuario" method="post">
			<input type="hidden" name="acao" value="atualizarUsuario"> 
			<input type="hidden" name="email" value="<%=objUsuario.getEmail()%>">

			Email:<input type="email" name="email" value="<%=objUsuario.getEmail()%>"><br>
			Nome: <input type="text" name="nome" value="<%=objUsuario.getNome()%>"><br>
			Senha: <input type="password" name="senha" value="<%=objUsuario.getSenha()%>"><br>
			 <input type="submit" value="Salvar"><input type="reset"
			value="Voltar"><a href="ManterUsuario?acao=listarUsuario">
				"VOLTAR"</a> <BR>
		</form>
	</center>



</body>
</html>