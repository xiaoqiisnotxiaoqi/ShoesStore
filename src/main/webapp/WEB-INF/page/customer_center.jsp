<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\5 0005
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>个人中心</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/customer_center.css"/>
    <title></title>
</head>
<body>
    <IFRAME NAME="content_frame" width="100%" height="238px" SRC="top.jsp" ></IFRAME>
    <div>
        <div id="left-nav">
            <span>XXX账户</span>
            <ul>
                <li class="nav-title">个人信息
                    <ul>
                        <li><a href="#">我的个人信息</a></li>
                        <li><a href="#">我的地址薄</a></li>
                    </ul>
                </li>
                <li class="nav-title">安全设置
                    <ul>
                        <li><a href="#">绑定手机号</a></li>
                        <li><a href="#">绑定邮箱</a></li>
                    </ul>
                </li>
                <li class="nav-title">订单信息
                    <ul>
                        <li><a href="#">我的订单</a></li>
                        <li><a href="#">购物车</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <form action="${pageContext.request.contextPath}/UpdatePersonalInformationServlet" method="post">
            <input type="hidden" name="token" id="token" value="<%=session.getAttribute("token")%>">
            <div class="personal-information">
                <span>个人信息   ></span><span>我的个人信息</span>
                <div class="cost-username">
                    <span>用户名:</span>
                    <input type="text" name="username" value="<%if(session.getAttribute("username")!=null){%><%=session.getAttribute("username")%><%}%>"
                           onmouseout="check_user_name(this)"/>
                    <span class="hint"><%--<%if(session.getAttribute("errormsg")!=null){%>--%><%=session.getAttribute("errormsg")%><%--<%}%>--%></span>
                </div>
                <div class="cost-age">
                    <span>年龄:</span>
                    <input type="text" name="age" value="<%if(session.getAttribute("age")!=null){%><%=session.getAttribute("age")%><%}%>"
                           onmouseout="check_age(this)"/>
                    <span class="hint"></span>
                </div>
                <input type="submit" value="确定" name="submit" class="submit" >
                <span class="error"><%if(session.getAttribute("tokenTest")!=null){%><%=session.getAttribute("tokenTest")%><%}%><%if(session.getAttribute("success")!=null){%><%=session.getAttribute("success")%><%}%></span>
            </div>


        </form>
    </div>
    <script src="../../js/customer_center.js"></script>

    <IFRAME NAME="content_button" width="100%" height="1100px" SRC="button.jsp" ></IFRAME>

</body>
</html>
