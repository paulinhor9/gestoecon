<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usu�rio</title>
<jsp:include page="../cabecalho.jsp" />
</head>
<body>
	<jsp:include page="../menu.jsp" />

	<div class="container">
		<div class="col-md-8 col-md-offset-2">

			<form class="form-horizontal" action="../ManterUsuario" method="post">
				<input type="hidden" name="acao" value="inserirUsuario">
				<fieldset>

					<!-- Form Name -->
					<legend>Cadastro de usu�rio</legend>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="email">E-mail</label>
						<div class="col-md-4">
							<input type="email" name="email" type="text"
								placeholder="Digite o seu e-mail" class="form-control input-md"
								required="">
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="nome">Nome</label>
						<div class="col-md-4">
							<input id="nome" name="nome" type="text"
								placeholder="Digite o seu nome" class="form-control input-md"
								required="">
						</div>
					</div>

					<!-- Password input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="senha">Senha</label>
						<div class="col-md-4">
							<input id="senha" name="senha" type="password"
								placeholder="Digite sua senha" class="form-control input-md"
								required="">
						</div>
					</div>

					<!-- Button (Double) -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="cadastrar"></label>
						<div class="col-md-8">
							<button type="submit" value="Cadastrar" class="btn btn-primary">Cadastrar</button>
							<button type="reset" value="Limpar" class="btn btn-danger">Limpar</button>
						</div>
					</div>

				</fieldset>
			</form>


		</div>
	</div>

</body>
</html>