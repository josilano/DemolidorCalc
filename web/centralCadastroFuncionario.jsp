<%-- 
    Document   : centralCadastroFuncionario
    Created on : 22/09/2014, 23:29:07
    Author     : Lano
--%>

<form action="CadastrarUsuario" method="post">
                <table id="tabelBotoes" border="0" style="position: absolute;
                       top: 23%;left: 29%;width: 750px;height: 400px;">
                    <tr>
                        <td>
                            <p>Nome</p>
                            <input required type="text" size=30 name="txtNome" maxlength="40" />
                        </td>
                        <td>
                            <p>CPF</p>
                            <input required type="text" name="txtCPF" maxlength="11" />
                        </td>
                        <td>
                            <p>Sexo</p>
                            <select name="txtSexo">
                                <option value="MASCULINO">MASCULINO</option>
                                <option value="FEMININO">FEMININO</option>
                            </select>
                        </td>
                    </tr>    
                    <tr>
                        <td>
                            <p>Data de Nascimento</p>
                            <input required type="date" name="txtDataNascimento" />
                        </td>
                        <td>
                            <p>Logradouro</p>
                            <select name="txtLogradouroTipo">
                                <option value="RUA">RUA</option>
                                <option value="AV.">AV.</option>
                                <option value="BR">BR</option>
                            </select>                                        
                                <input required type="text" name="txtLogradouro" maxlength="50"/>
                        </td>
                        <td>
                            <p>Número</p>
                                <input required type="number" name="txtNumero" maxlength="4"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p>Complemento</p>
                               <input type="text" name="txtComplemento" />
                        </td>
                        <td>
                            <p>Cidade</p>
                                <input required type="text" name="txtCidade" />
                        </td>
                        <td>
                            <p>UF</p>
                                <select name="txtUF">
                                    <option value="AC">AC</option>
                                    <option value="AL">AL</option>
                                    <option value="AP">AP</option>
                                    <option value="AM">AM</option>
                                    <option value="BA">BA</option>
                                    <option value="CE">CE</option>
                                    <option value="DF">DF</option>
                                    <option value="ES">ES</option>
                                    <option value="GO">GO</option>
                                    <option value="MA">MA</option>
                                    <option value="MT">MT</option>
                                    <option value="MS">MS</option>
                                    <option value="MG">MG</option>
                                    <option value="PA">PA</option>
                                    <option value="PB">PB</option>
                                    <option value="PR">PR</option>
                                    <option value="PE">PE</option>
                                    <option value="PI">PI</option>
                                    <option value="RJ">RJ</option>
                                    <option value="RN">RN</option>
                                    <option value="RS">RS</option>
                                    <option value="RO">RO</option>
                                    <option value="RR">RR</option>
                                    <option value="SC">SC</option>
                                    <option value="SP">SP</option>
                                    <option value="SE">SE</option>
                                    <option value="TO">TO</option>
                                </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p>Bairro</p>
                                <input type="text" name="txtBairro" />
                        </td>
                        <td>
                            <p>CEP</p>
                                <input type="number" name="txtCEP" maxlength="8" />
                        </td>
                        <td>                            
                            <p>Telefone</p>
                            <input type="number" required name="txtTelefone"/>                                                           
                        </td>
                    </tr>
                    <tr>
                        <td><!--mantive a id, modifique a la vonté-->
                            <div id="areaAposentado">
                                <p>Cargo</p>
                                    <input required type="text" name="txtCargo" /> 
                        </td>
                    
                        <td></td>
                        <td></td>                                            
                    <tr>
                        <td></td>
                        <td align="right">
                            <button id="bt" type="reset">                                
                                <img src="imagens/limpar.jpg" 
                                     style="height:70px; 
                                     width:70px;" alt=""/>
                            </button>
                        </td>
                        <td align="center">
                            <input class="botaoCadastrar" type="image" 
                                   src="imagens/b - Copia.jpg" 
                                   style="width:70px; 
                                   height:70px" />  
                        </td>
                    </tr>
                </table>
            </form>
