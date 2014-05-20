<div id="wrapper"> 
    <ul id="nav">
        <li><a href="${pageContext.request.contextPath}/home/index.htm"><span>Home</span></a></li>
        <li><a href="." onclick="return false;" class="dfCursor"><span>Account Management &darr;</span></a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/adminmanagement/changepassword.htm"><span>Change Password</span></a></li>
                <li><a href="${pageContext.request.contextPath}/adminmanagement/index.htm"><span>Admin Management</span></a></li>
                <li><a href="${pageContext.request.contextPath}/usermanagement/index.htm"><span>User Management</span></a></li>
            </ul>
        </li>  
        <li><a href="${pageContext.request.contextPath}/messagemanagement/changepassword.htm"><span>Message Management</span></a></li>  
        <li><a href="${pageContext.request.contextPath}"><span>Help</span></a></li>
    </ul>
</div>