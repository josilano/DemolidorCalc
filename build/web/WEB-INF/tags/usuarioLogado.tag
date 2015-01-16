<%-- 
    Document   : usuarioLogado
    Created on : 09/08/2014, 15:27:22
    Author     : 1946810
--%>

<%@tag body-content="empty" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:choose>
    <c:when test = "${sessaoUsuario != null}">
        ${sessaoUsuario}
    </c:when>
</c:choose>