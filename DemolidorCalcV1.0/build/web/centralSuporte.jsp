<%-- 
    Document   : centroSuporte
    Created on : 15/09/2014, 13:33:49
    Author     : Nath Rodrigues
--%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsJah" %>
            <div id="campoSuporte">
                    <form action="Suporte" method="post">
                        <label class="idnt">IDENTIFICAÇÃO</label><br />
                        <label class="idntd"><tagsJah:usuarioLogado /></label>
                        <label class="idntdd"> ID <select name="idUsuario">
                                                        <option><tagsJah:idUsuario /></option>
                            </select></label>
                        <textarea class="relato_da_duvida" rows="20" cols="110" 
                                  placeholder="INFORME O PROBLEMA OU DÚVIDA:" 
                                  name="textoSuporte" ></textarea><br />
                        <input class="btEnviarConsultaSuporte" type="image" 
                                   src="imagens/btEnviar.jpg" style="width:70px; 
                                   height:70px;" />
                </form>
            </div> 