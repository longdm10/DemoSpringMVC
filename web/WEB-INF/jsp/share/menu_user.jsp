<div id="wrapper"> 
    <ul id="nav">
        <li><a href="${pageContext.request.contextPath}/home/index.htm"><span>Home</span></a></li>
        <li><a href="." onclick="return false;" class="dfCursor"><span>Account Management &darr;</span></a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/user/changepassword.htm"><span>Change Password</span></a></li>
                <li><a href="${pageContext.request.contextPath}/user/profile.htm"><span>Profile</span></a></li>
            </ul>
        </li>
        <li><a href="." onclick="return false;" class="dfCursor"><span>Looking For &darr;</span></a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/lookingfor/request.htm"><span>Request Friend</span></a></li>
                <li><a href="${pageContext.request.contextPath}/lookingfor/respone.htm"><span>Response Friend</span></a></li>
                <li><a href="${pageContext.request.contextPath}/lookingfor/friends.htm"><span>All Friend</span></a></li>
            </ul>
        </li>
        <li><a href="." onclick="return false;" class="dfCursor"><span>Message &darr;</span></a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/message/receive.htm"><span>Receive Message</span></a></li>
                <li><a href="${pageContext.request.contextPath}/message/send.htm"><span>Send Message</span></a></li>
                <li><a href="${pageContext.request.contextPath}/message/all.htm"><span>All Message</span></a></li>
            </ul>
        </li>
        <li><a href="${pageContext.request.contextPath}/contact/mycontact.htm"><span>Contact</span></a></li>
        <li><a href="${pageContext.request.contextPath}"><span>Help</span></a></li>
    </ul>
</div>