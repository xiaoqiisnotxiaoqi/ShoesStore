<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\4 0004
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link rel="stylesheet" href="../css/register.css">
    <script src="../js/register.js"></script>
</head>
<body>
<div id="all">
    <div id="logo-and-nav">
        <div id="search-and-logo">
            <ul id="search-and-logo-ul">
                <!--搜索-->
                <li class="threebox">
                    <div id="searchbox">
                        <form>
                            <input id="search" type="search" placeholder=" 请输入">
                            <button id="searchbutton" type="submit"></button>
                        </form>
                    </div>
                </li>

                <!--logo-->
                <li class="threebox">
                    <div id="logobox">
                        <img id="logopic" src="../imgs/1530088490-44294000.png"/>
                    </div>
                </li>

                <!--右侧导航-->
                <li class="threebox">
                    <div id="right-nav-box">
                        <div class="inner-right-box">
                            <div class="naviconbox"><img src="../images/TIM截图20180902130757.png" height="32" width="32"/>
                            </div>
                            <a class="rightnav-font" href=" ">账户</a>
                        </div>
                        <div class="inner-right-box">
                            <div class="naviconbox"><img src="../images/TIM截图20180902130836.png" height="32" width="33"/>
                            </div>
                            <a class="rightnav-font" href=" ">购物车</a>
                        </div>
                    </div>
                </li>
            </ul>

        </div>
        <div id="nav-area"></div>
        <!--导航条-->
        <div id="nav">
            <div id="inner-nav">
                <ul>
                    <li onmouseover="mouseon(this)" onmouseout="mouseout(this)">
                        <span class="nav-navs">男士</span>
                    </li>
                    <li onmouseover="mouseon(this)" onmouseout="mouseout(this)">
                        <span class="nav-navs">女士</span>
                    </li>
                    <li onmouseover="mouseon(this)" onmouseout="mouseout(this)">
                        <span class="nav-navs">休闲</span>
                    </li>
                    <li onmouseover="mouseon(this)" onmouseout="mouseout(this)">
                        <span class="nav-navs">运动</span>
                    </li>
                    <li onmouseover="mouseon(this)" onmouseout="mouseout(this)">
                        <span class="nav-navs">儿童</span>
                    </li>
                    <li onmouseover="mouseon(this)" onmouseout="mouseout(this)">
                        <span class="nav-navs">品牌</span>
                    </li>
                </ul>
            </div>
        </div>

    </div>
</div>
</body>
</html>
