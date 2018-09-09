<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/4/004
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
    <script src="${pageContext.request.contextPath}/js/register.js"></script>

</head>
<body>


<!--头部区域-->
<div id="HeadPartArea">
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
                    <img id="logopic" src="${pageContext.request.contextPath}/images/1530088490-44294000.png"/>
                </div>
            </li>

            <!--右侧导航-->
            <li class="threebox">
                <div id="right-nav-box">
                    <div class="inner-right-box">
                        <div class="naviconbox"><img src="${pageContext.request.contextPath}/images/TIM截图20180902130757.png" height="32" width="32"/>
                        </div>
                        <a class="rightnav-font" href=" ">账户</a>
                    </div>
                    <div class="inner-right-box">
                        <div class="naviconbox"><img src="${pageContext.request.contextPath}/images/TIM截图20180902130836.png" height="32" width="33"/>
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

<!--注册区域-->
<div id="all">

    <div id="home-rigister">
        <a href=" ">主页</a>
        <span> &gt; 注册</span>
    </div>
    <!--左侧注册-->
    <div id="rigister-description">
        <div id="rigister-area">
            <div id="create-new-account">
                <span>创建一个新账户</span>
            </div>

            <form name="register-info" action="register-form" method="post">
                <ul>
                    <li class="options">
                        <div class="inner-options">
                            <label>手机号:</label>
                            <input class="inputs"  type="text" name="telno" onblur="isPoneAvailable(this)">
                        </div>
                    </li>
                    <li class="tips1"><span id="telno-tip"></span></li>


                    <li class="options">
                        <div class="inner-options"><label>验证码:</label>
                            <div id="yanzhengma-box">
                                <input id="yanzhengma" type="text" name="yanzhengma" onblur="isYzmAvailable(this)">
                                <button id="get-yanzhengma">获取验证码</button>
                            </div>
                        </div>
                    </li>
                    <li class="tips1"><span id="yzm-tip"></span></li>


                    <li class="options">
                        <div class="inner-options"><label>邮箱:</label>
                            <input class="inputs" type="text" name="email" onblur="isEmailAvailable(this)">
                        </div>
                    </li>
                    <li class="tips1"><span id="email-tip"></span></li>


                    <li class="options">
                        <div class="inner-options"><label>密码:</label>
                            <input class="inputs" type="password" name="passwd" onblur="isPasswdAvailable(this)">
                        </div>
                    </li>
                    <li class="tips1"><span id="passwd-tip"></span></li>


                    <div id="check-box">
                        <input type="checkbox" id="" name="is-accept">
                        <span> 我已阅读并接受<a href=" ">隐私条款</a>xxxxxxxxxxxxxxxxxxxx</span>
                    </div>
                    <div id="submit-box">
                        <button id="submit-button" type="submit" name="submit">立即注册</button>
                    </div>

                </ul>
            </form>
        </div>
        <!--右侧描述-->
        <div id="right-description">
            <div id="description"><h3>adiCLUB会员相关权益</h3>
                <ul>
                    <li></li>
                    <li>成为adiCLUB会员并完善个人信息，即可享受更多权益 ：</li>
                    <br>
                    <li><img class="right-icon" src="${pageContext.request.contextPath}/images/对号.png"/> 安全快捷支付订单</li>
                    <li><img class="right-icon" src="${pageContext.request.contextPath}/images/对号.png"/> 随时跟踪订单状态</li>
                    <li><img class="right-icon" src="${pageContext.request.contextPath}/images/对号.png"/> 即时收到打折优惠及新品发布信息</li>
                    <li><img class="right-icon" src="${pageContext.request.contextPath}/images/对号.png"/> 全场免普通达运费和七天无理由退换货服务</li>
                    <li><img class="right-icon" src="${pageContext.request.contextPath}/images/对号.png"/> 消费即可获得积分，铜牌以上会员即可积分兑换优惠券</li>
                </ul>
            </div>
        </div>
    </div>
</div>

<!--饶震震尾部-->
<div class="bottom">
    <div class="bottom_left">
        <table>
            <tr>
                <td>
                    <a href="" class="td1">CHEANEY SHOES</a>
                </td>
                <td>
                    <a href="" class="td1">HOW CAN WE HELP?</a>
                </td>
                <td>
                    <a href="" class="td1">FEATURES</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="">Cheaney History</a>
                </td>
                <td>
                    <a href="">Contact Us</a>
                </td>
                <td>
                    <a href="">Join our Newsletter</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="">Our Stores</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href=""></a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
                <td>
                    <a href="">Size & Fit</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a href=""></a>
                </td>
                <td>
                    <a href=""></a>
                </td>
                <td>
                    <a href=""></a>
                </td>
            </tr>
        </table>
    </div>
    <div class="bottom_right" style="">
        <p>注册我们的电子邮件通讯，首先要了解特别优惠，
            新品上市等等！您可以随时取消订阅。</p>
        <input type="email" placeholder="请输入你的邮箱">
        <img src="${pageContext.request.contextPath}/images/ios_bg.png" alt="">
        <span style="display: block">下载App</span>
        <span style="display: block" class="span1">给我们一个电话</span>
        <span class="span1">13955415175</span>

    </div>
</div>

<hr class="hr3">
<div class="bot_left">
    <span>fiaofukgnwghwn</span>
    <span class="bot_right">fiaofukgnwghwn</span>
</div>
<div class="bottom_foot">
    <img src="${pageContext.request.contextPath}/images/bottom.png" alt="">
    <p>Cheaney Shoes Ltd Registered office 69 Rushton Road, Desborough, Northants,
        NN14 2RR, Registered in UK</p>
    <p> Company Registration Number 6905848 VAT no. 975670866</p>
</div>
<!--饶震震-->



</body>
</html>
