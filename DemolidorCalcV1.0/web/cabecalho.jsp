<%-- 
    Document   : cabecalho
    Created on : 05/08/2014, 11:38:13
    Author     : 1946810
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsJah" %>
<jsp:useBean id="usuario" class="br.jah.model.POJO.Usuario" />
<jsp:useBean id="cliente" class="br.jah.model.POJO.Cliente" />
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
                    <a href="paginaInicial.jsp">
                       <img src="imagens/logo_demolidor.png" 
                       style="position: absolute; right:800%;" 
                       alt="Logo do usuario"/></a>
                    <table>
                        <tr>
                            <td>
                                <tagsJah:usuarioLogado />
                            </td>
                            <td>
                              <form action="" method="post">
                              <a class="btLogout" href="Sair">Sair</a>                             
                              </form>
                            </td>
                        </tr>
                    </table>
                </header>
            </div>
                <img src="" alt="Anuncie Aqui" style="width: 200px;height: 400px;position: absolute; left: 85%; " />   