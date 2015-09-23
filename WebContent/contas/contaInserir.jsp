<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>INSERIR CONTA</title>
</head>
<body>

GestoEcon
	<br> CADASTRAR CONTA.
	<br>
	<br><center>
	<form action="../ManterConta" method="post">
	 <BR>
		Conta: <input type="text" name="nome" ><br>
		Saldo: <input type="text" name="saldo"> <br>
		
		
		<br> 
		<input type  = "hidden" name = "acao" value ="inserirConta">
		<input type="submit" value="Inserir">
		<input type="reset" value="Limpar">
		
		<a href="../Home.jsp">  "Cancelar"</a> <BR>
		
</form>
</center>



</body>
</html>