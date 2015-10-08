<!DOCTYPE html>
<%@page import="br.com.gestoecon.bean.ContaVO"%>
<head>
<%
	ContaVO conta = (ContaVO) request.getAttribute("conta");
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Editar Conta</title>
</head>
<jsp:include page="../cabecalho.jsp"></jsp:include>
<body>
<jsp:include page="../menu.jsp"></jsp:include>
	GestoEcon
	<br> Editar Conta. 
	<br>
	<br>
	<center>
		<form action="ManterConta" method="post">
			<input type="hidden" name="acao" value="atualizarConta">
			<input type="hidden" name="id" value="<%=conta.getId()%>">
			
			 Conta:<input type="text" name="nome" value="<%=conta.getNome()%>"><br> Saldo: 
			<input type="text" name="saldo" value="<%=conta.getSaldo()%>"><br>
			<br>
			<input type="submit" value="Salvar"><input type="reset"
				value="Limpar"><a href="ManterConta?acao=listarConta">
				"VOLTAR"</a> <BR>
		</form>
	</center>



</body>
</html>