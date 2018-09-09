<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\7 0007
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/all_orders.css">
    <title></title>
</head>
<body>
    <IFRAME NAME="content_frame" width="100%" height="238px" SRC="top.jsp" ></IFRAME>
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
    <div id="all_orders">
        <div id="orders_title">
            <span>宝贝</span>
            <span>单价</span>
            <span>数量</span>
            <span>实付款</span>
            <span>操作</span>
        </div>
        <div class="orders_details">
            <div class="order_num">
                <span>2018-08-24</span>
                <span>订单号:20625151445266987</span>
            </div>
            <div class="product">
                <div class="product-details">
                    <span><a href="#"><img src="${pageContext.request.contextPath}/images/img1.jpg"/></a></span>
                    <span><a href="#"> biubiubiu皮靴</a></span>
                    <span>尺码：</span>
                    <span>41</span>
                    <span>颜色：</span>
                    <span>黄色</span>
                </div>
                <span class="price">￥199.9</span>
                <span class="pro_num">1</span>
                <span class="all_num">￥199.9</span>
                <div class="operation">
                    <span><a href="#">订单详情</a></span>
                    <span><a href="#">删除订单</a></span>
                </div>
            </div>
        </div>
        <div class="orders_details">
            <div class="order_num">
                <span>2018-08-24</span>
                <span>订单号:20625151445266987</span>
            </div>
            <div class="product">
                <div class="product-details">
                    <span><a href="#"><img src="${pageContext.request.contextPath}/images/img1.jpg"/></a></span>
                    <span><a href="#"> biubiubiu皮靴</a></span>
                    <span>尺码：</span>
                    <span>41</span>
                    <span>颜色：</span>
                    <span>黄色</span>
                </div>
                <span class="price">￥199.9</span>
                <span class="pro_num">1</span>
                <span class="all_num">￥199.9</span>
                <div class="operation">
                    <span><a href="#">订单详情</a></span>
                    <span><a href="#">删除订单</a></span>
                </div>
            </div>
        </div>
        <div class="orders_details">
            <div class="order_num">
                <span>2018-08-24</span>
                <span>订单号:20625151445266987</span>
            </div>
            <div class="product">
                <div class="product-details">
                    <span><a href="#"><img src="${pageContext.request.contextPath}/images/img1.jpg"/></a></span>
                    <span><a href="#"> biubiubiu皮靴</a></span>
                    <span>尺码：</span>
                    <span>41</span>
                    <span>颜色：</span>
                    <span>黄色</span>
                </div>
                <span class="price">￥199.9</span>
                <span class="pro_num">1</span>
                <span class="all_num">￥199.9</span>
                <div class="operation">
                    <span><a href="#">订单详情</a></span>
                    <span><a href="#">删除订单</a></span>
                </div>
            </div>
        </div>
        <div class="orders_details">
            <div class="order_num">
                <span>2018-08-24</span>
                <span>订单号:20625151445266987</span>
            </div>
            <div class="product">
                <div class="product-details">
                    <span><a href="#"><img src="${pageContext.request.contextPath}/images/img1.jpg"/></a></span>
                    <span><a href="#"> biubiubiu皮靴</a></span>
                    <span>尺码：</span>
                    <span>41</span>
                    <span>颜色：</span>
                    <span>黄色</span>
                </div>
                <span class="price">￥199.9</span>
                <span class="pro_num">1</span>
                <span class="all_num">￥199.9</span>
                <div class="operation">
                    <span><a href="#">订单详情</a></span>
                    <span><a href="#">删除订单</a></span>
                </div>
            </div>
        </div>
        <div class="orders_details">
            <div class="order_num">
                <span>2018-08-24</span>
                <span>订单号:20625151445266987</span>
            </div>
            <div class="product">
                <div class="product-details">
                    <span><a href="#"><img src="${pageContext.request.contextPath}/images/img1.jpg"/></a></span>
                    <span><a href="#"> biubiubiu皮靴</a></span>
                    <span>尺码：</span>
                    <span>41</span>
                    <span>颜色：</span>
                    <span>黄色</span>
                </div>
                <span class="price">￥199.9</span>
                <span class="pro_num">1</span>
                <span class="all_num">￥199.9</span>
                <div class="operation">
                    <span><a href="#">订单详情</a></span>
                    <span><a href="#">删除订单</a></span>
                </div>
            </div>
        </div>

        <div class="page">
            <ul>
                <li><a href="#"><div>上一页</div></a></li>
                <li><a href="#"><div>1</div></a></li>
                <li><a href="#"><div>2</div></a></li>
                <li><a href="#"><div>3</div></a></li>
                <li><a href="#"><span>………</span></a></li>
                <li><a href="#"><div>下一页</div></a></li>
                <li><a href="#"><div>尾页</div></a></li>
            </ul>
            <div class="skip">
                <span>共100页，到</span>
                <input type="text" name="page-num" />
                <span>页</span>
                <input type="submit" name="submit" value="确定" />
            </div>
        </div>
    </div>

    <IFRAME NAME="content_button" width="100%" height="1100px" SRC="button.jsp" ></IFRAME>
</body>
</html>
