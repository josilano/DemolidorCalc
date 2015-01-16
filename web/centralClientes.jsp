<%-- 
    Document   : centralClientes
    Created on : 21/09/2014, 16:30:01
    Author     : Lano_2
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="clientedao" class="br.jah.model.DAO.ClienteDAO" />
<jsp:useBean id="clientes" class="br.jah.model.POJO.Cliente" />
<div  style="position: absolute;top: 23%;left: 29%;width: 500px;height: 240px;">    
<c:forEach var="cliente" items="${clientedao.listaClientes}">
    <fieldset>
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
                        CPF
                    </td>
                    <td>
                        ${cliente.cpf}
                    </td>
                </tr>
                <tr>
                    <td>
                        Sexo
                    </td>
                    <td>
                        ${cliente.sexo}
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
                        Logradouro
                    </td>
                    <td>
                        ${cliente.logradouroTipo}
                    </td>
                    <td>

                    </td>
                    <td>
                        ${cliente.logradouro}
                    </td>
                </tr>
                <tr>
                    <td>
                        Número
                    </td>
                    <td>
                        ${cliente.numero}
                    </td>
                    <td>
                        Complemento
                    </td>
                    <td>
                        ${cliente.complemento}
                    </td>
                </tr>
                <tr>
                    <td>
                        Cidade
                    </td>
                    <td>
                        ${cliente.cidade}
                    </td>
                    <td>
                        UF
                    </td>
                    <td>
                        ${cliente.UF}
                    </td>
                </tr>
                <tr>
                    <td>
                        Bairro
                    </td>
                    <td>
                        ${cliente.bairro}
                    </td>
                    <td>
                        CEP
                    </td>
                    <td>
                        ${cliente.cep}
                    </td>
                </tr>
                <tr><hr />
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
                <tr style="border: 1pt solid black;">
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
            <!--fazer uma seleção desses 3 p escolher e enviar como caixa de seleção-->
            <input type="radio" value="Editar" name="decisao" />Editar
            <input type="radio" value="Selecionar" name="decisao" checked="checked" />Selecionar
            <input type="radio" value="Excluir" name="decisao" />Excluir
            <input type="submit" value="OK" />
        </form>
    </fieldset>
  <br />

</c:forEach>
</div>
