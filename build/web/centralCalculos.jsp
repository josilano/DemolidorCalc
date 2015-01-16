<%-- 
    Document   : centralCalculos
    Created on : 23/09/2014, 23:43:24
    Author     : Lano_2
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="clientedao" class="br.jah.model.DAO.ClienteDAO" />
<jsp:useBean id="clientes" class="br.jah.model.POJO.Cliente" />
<%--<c:forEach var="cliente" items="${clientedao.listaClientes}">
    <fieldset style="position: absolute;
                       top: 23%;left: 29%;width: 750px;height: 400px;">
        <form action="DecisorCliente" method="post">
            <table>
                <tr>
                    <td>
                        Nome
                    </td>
                    <td>
                        ${cliente.nome}
                    </td>
                    <td>
                        Data de Nascimento
                    </td>
                    <td>
                        ${cliente.dataNascimento}
                    </td>
                </tr>
                <tr>
                    <td>
                        Tipo de Aposentadoria
                    </td>
                    <td>
                        ${cliente.tipoAposentadoriaCliente}
                    </td>
                    <td>
                        RMI
                    </td>
                    <td>
                        ${cliente.RMI}
                    </td>
                <tr>
                    <td>
                        DIB
                    </td>
                    <td>
                        ${cliente.DIB}
                    </td>
                    <td>ID
                    </td>
                    <td>
                        <select name="idCliente">
                            <option>${cliente.id}</option>
                        </select>
                    </td>
                </tr>
            </table>
            <input type="submit" value="OK" />
        </form>
    </fieldset>
</c:forEach>--%>
    <table id="tabelaBotoes" border="0" style="position: absolute;
             top: 20%;left: 40%;width: 50px;height: 60px;">
        <tr>
            <td>        
                <map name="mapa">
                    <area shape="circle" coords="74,74,67" href="CalculoTempoServico.jsp" 
                    alt="Clique" /> 
                </map>       
                <img id="img30" src="imagens/CalcTempServ.jpg" style="width:150px; 
                   height:160px;" alt="Imagem" usemap="#mapa"/>
            </td> 
            <td>
                <map name="mapa2">
                    <area shape="circle" coords="74,74,67" href="calcRMI.jsp" alt="Clique" /> 
                </map>
                <img class="img2" src="imagens/CalcRMI.jpg" style="width:150px;
                 height:160px;" 
                 alt="Imagen" usemap="#mapa2"/>
            </td>
        </tr>
        <tr>
            <td>
                <map name="mapa3">
                    <area shape="circle" coords="74,74,67" href="EvolucaoDaRMI.jsp" 
                  alt="Clique" /> 
                </map>
                <img class="img3" src="imagens/EvoRMI.jpg" style="width:150px; 
                 height:160px;" 
                 alt="Imagen" usemap="#mapa3"/>
            </td>
            <td>
                <map name="mapa4">
                    <area shape="circle" coords="74,74,67" href="AtuRendaMensal.jsp" 
                  alt="Clique" /> 
                </map>
                <img class="img4" src="imagens/AtuRenMen.jpg" style="width:150px; 
                 height:160px;"
                 alt="Imagen" usemap="#mapa4"/>
            </td>
        </tr>
    </table>          
