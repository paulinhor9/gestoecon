<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>INICIO - GESTOECON</title>
<jsp:include page="cabecalho.jsp" /></jsp:include>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

<div class="container">
    <div class="row">
        <div class="page-header">
            <h1><i class="glyphicon glyphicon-home"></i> Página inicial</h1>
        </div>
        
        <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-default">
                <div class="panel-heading panel-title text-center">GERENCIAMENTO</div>

                <div class="panel-body">
                    <ul class="list-group">
                        <li class="list-group-item"><a href="usuario/usuarioGerenciar.jsp"> USUARIO</a></li>
                        <li class="list-group-item"><a href="contas/contasGerenciar.jsp"> CONTAS</a></li>
                        <li class="list-group-item"><a href="movimentos/movimentoGerenciar.jsp"> MOVIMENTO</a></li>
                        <li class="list-group-item"><a href=""> EXTRATO</a></li>
                    </ul>       
                </div>

                <div class="panel-footer"></div>
            </div>
        </div>
    </div>
</div>
	

</body>
</html>