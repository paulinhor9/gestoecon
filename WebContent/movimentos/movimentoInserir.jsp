<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>INSERIR NOVO MOVIMENTO</title>
</head>
<body>

<h3>INSERIR MOVIMENTO</h3>
<center>
 	<form action="ManterMovimento" method="post">
 	
 	Nome: <input  type="text" name= "descricao"/>
 	<br />
 	Valor: <input  type="text" name= "valor"/>
 	<br />
 	Tipo: <select name="tipo">  
 	<option  value = "entrada"> Entrada</option>
 	<option  value = "saida"> Saída</option>
 	</select>
 	</br>
 	<input type  = "hidden" name = "acao" value ="inserirMovimento">
 	<input type="submit" value= "Inserir"/> s
 	<input type="reset" value= "Limpar"/>
 	
 	
 	</form>
 	
 </center>



</body>
</html>