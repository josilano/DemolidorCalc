<%-- 
    Document   : msgDialogo
    Created on : 17/09/2014, 14:17:04
    Author     : Lano_2
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:choose>
    <c:when test = "${mensagemDialogo != null}">
        ${mensagemDialogo}
    </c:when>
</c:choose>
