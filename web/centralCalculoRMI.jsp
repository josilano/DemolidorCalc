<%-- 
    Document   : centralCalculoRMI
    Created on : 24/09/2014, 12:41:14
    Author     : Lano_2
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="clientedao" class="br.jah.model.DAO.ClienteDAO" />
<jsp:useBean id="clientes" class="br.jah.model.POJO.Cliente" />

<form action="" method="post">
    <table style="position: absolute;
                       top: 23%;left: 29%;width: 750px;height: 100px;">
        <tr>
            <th align="left">
                Mês referência
            </th>
            <th align="left">
                Salário de Contribuição
            </th>
            <th align="left">
                Índice
            </th>
            <th align="left">
                Salário Corrigido
            </th>
        </tr>
        <%--<c:forEach var="cliente" items="${clientedao.seleciona}">--%>
        <tr>
            <td>
                <input type="text" name="" value=""/>
            </td>
            <td>
                <input type="text" name="" value=""/>
            </td>
            <td>
                <input type="text" name="" value=""/>
            </td>
            <td>
                <input type="text" name="" value=""/>
            </td>
        </tr>
        <%--</c:forEach>--%>
    </table>
    <input class="bt3" type="image" src="imagens/calc.png" 
                   alt="Calcular"/>
</form>
