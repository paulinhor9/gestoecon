<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> GESTOECON - EXCLUIR USUARIO </title>
</head>
<body>
EXCLUSÃO DE USUARIO.<br>

<form action="../ManterUsuario" method="post">

EMAIL: <input type="email" name="email" required="required"> <br>
SENHA: <input type="text" name="senha" required="required"> <br>

<input type="submit" value="Excluir">
<input type="reset" value="Limpar">

<input type="hidden" name="acao" value="excluirUsuario">

</form>
<input type="submit" value="Voltar" onclick = "location.href ='../Home.jsp'" >
</body>
</html>