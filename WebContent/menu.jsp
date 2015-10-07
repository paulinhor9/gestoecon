<nav class="navbar navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle Navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">GESTOECON</a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">

			</ul>

			<ul class="nav navbar-nav navbar-right">

				<li><a href="usuario/usuarioInserir.jsp"><i
						class="glyphicon glyphicon-plus"></i> Cadastre-se</a></li>
				<%
					if (session.getAttribute("usuarioOK") != null) {
				%>
				<li>
					<form action="ManterUsuario" method="post">
						<input type="hidden" name="acao" value="sair" /> <input
							type="submit" class="btn btn-link" value="Sair">
					</form>
				</li>
				<%
					}
				%>
			</ul>
		</div>
	</div>
</nav>