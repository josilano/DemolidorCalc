<%-- 
    Document   : centralFuncionarios
    Created on : 22/09/2014, 20:57:54
    Author     : Lano
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="funcionariodao" class="br.jah.model.DAO.FuncionarioDAO" />
<jsp:useBean id="funcionario" class="br.jah.model.POJO.Funcionario" />
<div style="position: absolute;top: 23%;left: 29%;width: 500px;height: 340px;">
<c:forEach var="funcionario" items="${funcionariodao.listaFuncionarios}">
    <fieldset>
        <form action="" method="post">
            <table>
                <tr>
                    <td>
                        Nome
                    </td>
                    <td>
                        ${funcionario.nome}
                    </td>
                    <td>
                        CPF
                    </td>
                    <td>
                        ${funcionario.cpf}
                    </td>
                </tr>
                <tr>
                    <td>
                        Sexo
                    </td>
                    <td>
                        ${funcionario.sexo}
                    </td>
                    <td>
                        Data de Nascimento
                    </td>
                    <td>
                        ${funcionario.dataNascimento}
                    </td>
                </tr>
                <tr>
                    <td>
                        Logradouro
                    </td>
                    <td>
                        ${funcionario.logradouroTipo}
                    </td>
                    <td>

                    </td>
                    <td>
                        ${funcionario.logradouro}
                    </td>
                </tr>
                <tr>
                    <td>
                        Número
                    </td>
                    <td>
                        ${funcionario.numero}
                    </td>
                    <td>
                        Complemento
                    </td>
                    <td>
                        ${funcionario.complemento}
                    </td>
                </tr>
                <tr>
                    <td>
                        Cidade
                    </td>
                    <td>
                        ${funcionario.cidade}
                    </td>
                    <td>
                        UF
                    </td>
                    <td>
                        ${funcionario.UF}
                    </td>
                </tr>
                <tr>
                    <td>
                        Bairro
                    </td>
                    <td>
                        ${funcionario.bairro}
                    </td>
                    <td>
                        CEP
                    </td>
                    <td>
                        ${funcionario.cep}
                    </td>
                </tr>
                <tr>
                    <td>
                        Cargo
                    </td>
                    <td>
                        ${funcionario.cargo}
                    </td>
                    <td>ID
                    </td>
                    <td>${funcionario.id}
                    </td>
                </tr>
            </table>
            <input type="submit" value="Editar" />
        </form>
    </fieldset>
  <br />

</c:forEach>
</div>
<%--<c:import url="central.jsp" />
<c:import url="rodape.jsp" />--%>
