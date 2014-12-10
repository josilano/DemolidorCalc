<%-- 
    Document   : menuacesso
    Created on : 23/08/2014, 11:00:28
    Author     : 1946810
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
    <c:when test="${permissaomenu <= '2'}">
        <%--<c:if test="${usuario.permissao > '2'}">--%>
        <ul>
            <li> <a href="#">CADASTRO</a>
                <ul>
                    <li><a href="cadastroClientes.jsp">CLIENTE</a></li>
                    <li><a href="cadastroFuncionario.jsp">FUNCIONÁRIO</a></li>        
                </ul>
            </li> 
            <li><a href="clientes.jsp">CLIENTES</a><br /></li>
            <li><a href="funcionarios.jsp">FUNCIONÁRIOS</a><br /></li>
        </ul>    
        <%--</c:if>--%>
    </c:when>
    <c:otherwise>
        <ul >
            <li> <a href="#">CADASTRO</a>
                <ul>
                    <li><a href="cadastroClientes.jsp">CLIENTE</a></li>
                    <li><a href="cadastroFuncionario.jsp">FUNCIONÁRIO</a></li>        
                </ul>
            </li>                                       
            <li><a href="listarClientes.jsp">CLIENTES</a></li>                                   
            <li><a href="listarFuncionarios.jsp">FUNCIONÁRIOS</a></li>                                   
            <li><a href="#">CÁLCULOS</a>
                <ul>
                    <li><a href="calculoTempoServico.jsp">CALCULAR TEMPO DE SERVIÇO</a></li>
                    <li><a href="calcRMI.jsp">CALCULAR RMI</a></li>
                    <li><a href="EvolucaoDaRMI.jsp">CALCULAR EVOLUÇÃO DA RMI</a></li>
                    <li><a href="AtuRendaMensal.jsp">ATUALIZAR RENDA MENSAL</a></li>                                                                                   
                </ul>
            </li>
            <li><a href="Suporte.jsp">SUPORTE</a></li>
            <li><a href="#">CONTATO</a></li>
        </ul>
    </c:otherwise>
</c:choose>