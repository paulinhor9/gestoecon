<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>GestoEcon - Cadastrar Movimento</title>
<jsp:include page="../cabecalho.jsp" />
</head>
<body>
	<jsp:include page="../menu.jsp" />

	<div class="container">
		<div class="col-md-8 col-md-offset-2">

			<form class="form-horizontal" action="../ManterMovimento"
				method="post">
				<input type="hidden" name="acao" value="inserirMovimento">

				<fieldset>

					<!-- Form Name -->

					<legend>Cadastrar Movimento</legend>

					<!-- Select Basic -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="conta">Conta</label>
						<div class="col-md-4">
							<select id="conta" name="conta" class="form-control">
								<option value="1">Banco do Brasil</option>
								<option value="2">Bradesco</option>
							</select>
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="inserirMovimento">Nome</label>
						<div class="col-md-4">
							<input id="nome" name="nome" type="text"
								placeholder="Descrição do movimento."
								class="form-control input-md" required="">

						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="valor">Valor</label>
						<div class="col-md-4">
							<input id="valor" name="valor" type="text"
								placeholder="Valor do movimento" class="form-control input-md"
								required="required">

						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="data">Data</label>
						<div class="col-md-4">
							<input type="date" name="data" type="text"
								placeholder="Data do movimento" class="form-control input-md"
								required="required">

						</div>
					</div>



					<!-- Select Basic -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="tipo"> Tipo</label>
						<div class="col-md-4">
							<select id="tipo" name="tipo" class="form-control">
								<option value="1">Entrada</option>
								<option value="2">Saída</option>
							</select>
						</div>
					</div>

					<!-- Button (Double) -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="cadastrar"></label>
						<div class="col-md-8">
							<button type="submit" name="cadastrar" class="btn btn-success">CADASTRAR</button>
							<button type="reset" name="limpar" class="btn btn-danger">LIMPAR</button>

						</div>
					</div>
					<center>
						<li class="btn btn-home"><a href="movimentoGerenciar.jsp">
								VOLTAR</a></li>
					</center>
				</fieldset>
			</form>

		</div>
	</div>

</body>











</html>