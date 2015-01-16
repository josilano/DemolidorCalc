<%-- 
    Document   : index
    Created on : 05/08/2014, 10:49:23
    Author     : 1946810
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloV1.0.css" type="text/css" />
        <title>DemolidorCalc</title>
    </head>
    <body id="planoDeFundo" style=" background-repeat: no-repeat;height: 100%;
    width: 90%;background-size: 100%;" background="imagens/temis.jpg">
        <div id="imglogo">
            <img src="imagens/logo_demolidor.png" alt="Demolidor calc"/>
        </div>
        <div id="cxlogin">
            <fieldset class="fieldlogin">
                <form class="formcxlogin" action="Autenticacao" method="post">
                    <label class="labeluser">USUÁRIO </label><input 
                        class="caxnome" autocomplete="on" placeholder="Usuário"
                        required autofocus type="text" 
                        style="border-top-left-radius: 5px;
                        border-top-right-radius: 5px; 
                        border-bottom-right-radius: 5px;
                        border-bottom-left-radius: 5px ;
                        background-color: whitesmoke; 
                        border-color: grey" name="txtUsuario" /><br />
                    <label class="labelsenha">SENHA </label> 
                        <input class="caxsenha" placeholder="Senha" required 
                               type="password" style="border-top-left-radius:5px;
                               border-top-right-radius: 5px; 
                               border-bottom-right-radius: 5px;
                               border-bottom-left-radius: 5px ;
                               background-color: whitesmoke; 
                               border-color: grey" name="txtSenha" /><br />
                    <a class="forgetpass" href="recuperacao.jsp">Esqueci a senha
                    </a>
                    <input class="btlogin" type="submit" 
                           style="border-top-left-radius: 5px;
                           border-top-right-radius: 5px; 
                           border-bottom-right-radius: 5px;
                           border-bottom-left-radius: 5px ;
                           background-color: whitesmoke; 
                           border-color: grey; border: calc; " value="Login" />
                </form>
            </fieldset>
                <h4>
<!--                uma mensagem de erro é impressa na tela caso o usuário não
                    exista ou se os dados sejam inseridos de forma incorreta-->
                    <%
                        String mensagemErro = (String) request.getAttribute("mensagemErro");
                            if(mensagemErro != null)
                                out.println(mensagemErro);
                            else
                                out.println("");
                    %>
                </h4>
        </div>
    </body>
</html>
