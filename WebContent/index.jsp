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

            <center>

                <div class="row">
                    <form action="ManterUsuario" method="post" class="form-horizontal">

                        <div class="form-group">
                            <label class="col-md-4 control-label">E-Mail</label>
                            <div class="col-md-6">
                                <input type="email" class="form-control" name="email" value="" required="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-4 control-label">Senha</label>
                            <div class="col-md-6">
                                <input type="password" class="form-control" name="senha" required="true">
                            </div>
                        </div>

                        <input type  = "hidden" name = "acao" value ="autenticarUsuario">
                        <input type="submit" value="Entrar" class="btn btn-success">
                        <input type="reset" value="Limpar" class="btn btn-warning">
                        <br>
                    </form>
                    <br>
                </div>
        </div>



    </center>




</body>
</html>