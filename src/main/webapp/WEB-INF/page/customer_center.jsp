<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\5 0005
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../../css/customer_center.css">
    <title></title>
</head>
<body>
    <IFRAME NAME="content_frame" width="100%" height="238px" SRC="top.jsp" ></IFRAME>
    <body>
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
        <form action="" method="post">
            <div class="personal-information">
                <span>个人信息   ></span><span>我的个人信息</span>
                <div class="cost-username">
                    <span>用户名:</span>
                    <input type="text" name="username" value=""/>
                </div>
                <div class="cost-age">
                    <span>年龄:</span>
                    <input type="text" name="age" value=""/>
                </div>
                <input type="submit" value="确定" name="submit" class="submit">
            </div>


        </form>
    </div>
    </body>
    <IFRAME NAME="content_button" width="100%" height="1100px" SRC="button.jsp" ></IFRAME>
</body>
</html>
