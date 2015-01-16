<%-- 
    Document   : recuperacao
    Created on : 17/09/2014, 10:47:52
    Author     : Nath Rodrigues
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demolidor Calc</title>
        <link rel="stylesheet" href="css/estiloV1.0.css" type="text/css" />
    </head>
    <body>
        <div id="redbar"></div>
        <form action="#" method="post">
            <table id="tablerecu">
                <tr>
                    <td>
                        <label>Confirme o E-Mail:</label><input type="text" 
                                                                name="txtRecuperacao" />
                    </td>
                    <td>
                        <input type="image" src="imagens/btEnviar.jpg" 
                               alt="Enviar" 
                       style="width:70px; height: 70px;" />
                    </td>   
                </tr>
            </table>    
        </form>
            <h4>
                <%
//                    String mensagemErro = (String) request.getAttribute("mensagemErro");
//                        if(mensagemErro != null)
//                            out.println(mensagemErro);
//                        else
//                            out.println("");
                %>
            </h4>
    </body>
</html>
