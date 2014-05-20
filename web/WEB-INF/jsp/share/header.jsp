<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header">
    <div id="logindisplay">
        <c:choose>
            <c:when test="${adminLogin!=null}">
                <span class="welcomeLogin">Welcome, ${adminLogin.username}!</span>
                &nbsp;
                <a href="${pageContext.request.contextPath}/home/logout.htm">Log out</a>
            </c:when>
            <c:when test="${userLogin!=null}">
                <span class="welcomeLogin">Welcome, ${userLogin.username}!</span>
                &nbsp;
                <a href="${pageContext.request.contextPath}/home/user.htm">User page</a> |
                <a href="${pageContext.request.contextPath}/home/logout.htm">Log out</a>
            </c:when>
            <c:otherwise>
                <a href="${pageContext.request.contextPath}/home/register.htm">Register</a> |
                <a href="${pageContext.request.contextPath}/home/login.htm">Log in</a>
            </c:otherwise>
        </c:choose>
    </div>
    <div id="title">
        <h1>Demo Spring MVC</h1>
    </div>    
</div>