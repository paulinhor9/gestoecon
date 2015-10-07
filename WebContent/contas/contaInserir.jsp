<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Inserir nova conta</title>
</head>
<body>
GestoEcon
	<br> CADASTRAR CONTA.
	<br>
	<br><center>
	<form action="../ManterConta" method="post">
	 <BR>
	 	<input type="hidden" name="acao" value ="inserirConta">
	 	
		Conta: <input type="text" name="nome" ><br>
		Saldo: <input type="text" name="saldo"> <br>
		<br> 
		
		<input type="submit" value="Inserir">
		<input type="reset" value="Limpar">
		
		<a href="../ManterConta?acao=listarConta">  "Cancelar"</a> <BR>
		
</form>
</center>



</body>
</html>