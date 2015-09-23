<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuário</title>
</head>
<body>
	GestoEcon
	<br> Cadastro de usuário
	<br>
	<br><center>
	<form action="../ManterUsuario" method="post">
	 <BR>
		Email: <input type="email" name="email" required="required"><br>
		Nome : <input type="text" name="nome" required="required"> <br>
		Senha: <input type="password" name="senha"><br> 
		
		<br> 
		<input type  = "hidden" name = "acao" value ="inserirUsuario">
		<input type="submit" value="Cadastrar">
		<input type="reset" value="Limpar"> 
	
	</form>
	<br>
	<input type="submit" value="Voltar" onclick = "location.href ='../index.html'" >
		</center>
</body>
</html>