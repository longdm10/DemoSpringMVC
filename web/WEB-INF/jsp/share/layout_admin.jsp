<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="/resources/errorpage/error.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${viewTitle}</title>   
        <jsp:include page="theme.jsp"/>
    </head>
    <body>
        <div class="page">
            <jsp:include page="header.jsp"/>
            <jsp:include page="menu_admin.jsp"/>
            <jsp:include page="main.jsp"/>
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>


