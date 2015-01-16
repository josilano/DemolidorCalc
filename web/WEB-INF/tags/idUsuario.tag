<%-- 
    Document   : idUsuario
    Created on : 23/09/2014, 20:56:29
    Author     : Lano_2
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<c:choose>
    <c:when test = "${idUsuario != null}">
        ${idUsuario}
    </c:when>
</c:choose>