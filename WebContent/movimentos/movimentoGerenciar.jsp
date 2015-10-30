<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>GestoEcon - Movimentos</title>
<jsp:include page="../cabecalho.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>

<div class="container">
    <div class="row">
        <div class="page-header">
            <h1><i class="glyphicon glyphicon-th-list "></i> Gerenciar Movimentos</h1>
        </div>
        
        <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-primary">
                <div class="panel-heading panel-title text-center">MOVIMENTOS</div>

                <div class="panel-body">
                    <ul class="list-group">
             <br>
                        <center>
						                    
                   		<a href="movimentoInserir.jsp" class="btn btn-lg btn-info"><span class="glyphicon glyphicon-plus-sign"></span> NOVO MOVIMENTO</a>
						<a href="#" class="btn btn-lg btn-danger"><span class="glyphicon glyphicon-remove-circle"></span> EXCLUIR MOVIMENTO</a>                    
                    </ul> 
                          </center>
                </div>

                <div class="panel-footer"></div>
            </div>
        </div>
    </div>
</div>


<center>
					<li class="btn btn-home"><a href="../Home.jsp"> Página
							Inicial</a></li>
				</center>







</body>
</html>