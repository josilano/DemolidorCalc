<%-- 
    Document   : teste
    Created on : 22/08/2014, 07:13:17
    Author     : 1946810
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsJah" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloV1.0.css" type="text/css" />
        <title>JAH</title>
    </head>
    <body>
        <div id="todocorpo">
            <div id="cabecalho">
                <header>
                    <tagsJah:usuarioLogado />
                    <form action="" method="post">
                        <input type="submit" value="Sair" name="botaoSair" />
                    </form>
                </header>
            </div> <!--cabeçalho até aqui-->
<!--            <div id="corpocentral">
                <section>
                    <nav>
                        <a href="cadastro.jsp">CADASTRO</a><br />
                        <a href="clientes.jsp">CLIENTES</a><br />
                        <a href="funcionarios.jsp">FUNCIONÁRIOS</a><br />
                        <a href="#">CÁLCULOS</a><br />
                    </nav> menu até aqui
                </section>-->
            </div> <!--central até aqui-->
            <div id="rodape">
                <footer>
                    
                </footer>
            </div>
        </div>
    </body>
</html> <!--rodapé até aqui-->