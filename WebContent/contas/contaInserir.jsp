<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cadastrar Nova Conta</title>
</head>
<body>

GestoEcon

     <form action="../ManterConta" method="post">
	 <input type="hidden" name="acao" value ="inserirConta">
	 	
		Conta: <input type="text" name="nome" ><br>
		Saldo: <input type="text" name="saldo"> <br>
		<br> 
		
		<input type="submit" value="Inserir">
		<input type="reset" value="Limpar">
		
		<a href="../ManterConta?acao=listarConta">  "Cancelar"</a> <BR>       
      
	</form>
                        
              

</body>
</html>