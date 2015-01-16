<%-- 
    Document   : menu
    Created on : 05/08/2014, 11:38:30
    Author     : 1946810
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="usuario" class="br.jah.model.POJO.Usuario" />
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsJah" %>

            <div id="corpocentral">
                <section>                    
                    <nav>
                        <c:choose>
                            <c:when test="${permissaomenu <= '2'}">                            
                                <ul>
                                    <li><a href="#">CADASTRO</a><br />
                                        <ul>
                                            <li><a href="cadastroClientes.jsp">CLIENTES</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="clientes.jsp">CLIENTES</a></li>
                                    <li><a href="Suporte.jsp">SUPORTE</a></li>
                                    <li><a href="Contato.jsp">CONTATO</a></li>
                                </ul>
                            </c:when>                                
                            <c:otherwise>                                
                                <ul>
                                    <li><a href="#">CADASTRO</a>
                                        <ul>
                                            <li><a href="cadastroClientes.jsp">
                                                    CLIENTE</a></li>
                                            <li><a href="cadastroFuncionario.jsp">
                                                    FUNCIONÁRIO</a></li>        
                                        </ul>
                                    </li>                                       
                                    <li><a href="clientes.jsp">CLIENTES
                                        </a></li>                                   
                                    <li><a href="funcionarios.jsp">
                                            FUNCIONÁRIOS</a></li>                                   
                                    <li><a href="#">CÁLCULOS</a>
                                        <ul>
                                            <li><a href="CalculoTempoServico.jsp">
                                                    CALCULAR TEMPO DE SERVIÇO
                                                </a></li>
                                            <li><a href="calculoRMI.jsp">
                                                    CALCULAR RMI</a></li>
                                            <li><a href="evolucaoRMI.jsp">
                                                    CALCULAR EVOLUÇÃO DA RMI</a>
                                            </li>
                                            <li><a href="AtuRendaMensal.jsp">
                                                    ATUALIZAR RENDA MENSAL</a>
                                            </li>                                                                                   
                                        </ul>
                                    </li>
                                    <li><a href="Suporte.jsp">SUPORTE</a></li>
                                    <li><a target="blank" href="https://www.facebook.com/pablo.littledrummer">CONTATO</a></li>
                                </ul>                                    
                            </c:otherwise>
                        </c:choose>
                        <!--                        <tagsJah:menuacesso />
                                                <a href="<%  %>"> <% %> </a>-->
                    </nav>