<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GESTOECON- PAGINA INICIAL</title>
</head>

<body>

	<jsp:include page="cabecalho.jsp"></jsp:include>

<div class="container">
	<div class="page-header">
		<h3>
			Bem vindo ao GestoEcon
		</h3>
	</div>
	<br>
	<br>
	<center>

		<div class="row">
			
		</div>
</div>


	


<form action="ManterUsuario" method="post">
Email: <input type="email" name="email" required="required"> <br>
Senha: <input type="password" name="senha" required="required"> <br> <br>

<input type  = "hidden" name = "acao" value ="autenticarUsuario">
<input type="submit" value="Entrar">
<input type="reset" value="Limpar">
<br>
</form>
<br>
<input type="submit" value="CADASTRE-SE" onclick = "location.href ='usuario/usuarioInserir.jsp'" >


</center>




</body>
</html>