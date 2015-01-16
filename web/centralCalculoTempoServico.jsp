<%-- 
    Document   : centralCadastroClientes
    Created on : 22/08/2014, 21:43:37
    Author     : 1946810
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

        <script>
            var cont = 1;
            function criaLinha(){
                var linha = document.createElement("tr");
                linha.innerHTML = "<td><input type=\"text\" required=\"true\" name=\"empresa" + cont + "\" />\n\</td>\n\
                                   <td><input name=\"dataE" + cont + "\" type=\"date\" required=\"true\" /></td>\n\
                                   <td>A</td>\n\
                                   <td><input name=\"dataS" + cont + "\" type=\"date\" required=\"true\" />\n\
                                   <td></td>\n\
                                   <td></td>";
                var tabela = document.getElementById("tab");
                tabela.appendChild(linha);
                cont+= 1;
            }
            
            function deletaLinha(){
                var tabela = document.removeChild("");
//                linha.innerHTML = "<td><input type=\"text\" /></td><td><input type=\"date\" /></td>";
                var linha = document.getElementById("tab");
                linha.removeChild(tabela);
            }
        </script>
        <a class="bt" href="#" onclick="criaLinha()">Criar Linha</a>
        <a class="bt2" href="#" onclick="deletaLinha()">Excluir Linha</a>
        <form action="CalcTempoSVC" method="post" >
            <table id="tab" style="position: absolute;top: 23%;left: 29%;
                   width: 750px;height: 80px;">
                <tr>
                    <th>
                        Empresa
                    </th>
                    <th>
                        Data de Entrada
                    </th>
                    <th>
                        -
                    </th>
                    <th>
                        Data de Saída
                    </th>
                    <th>
                        Tempo Comum
                    </th>
                    <th>
                        Tempo Convertido
                    </th>
                </tr>
            </table>
            <input class="bt3" type="image" src="imagens/calc.png" 
                   alt="Calcular"/>
        </form>