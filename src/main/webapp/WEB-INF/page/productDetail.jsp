<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\4 0004
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>商品详情页面</title>
    <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/css/productDetails.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/productDetails.js"></script>
    <style>
        .but1,.but2{
            border: none;
            width: 200px;
            height: 36px;
            line-height: 36px;
            text-align: center;
            margin-left: 20px;
            margin-top: 40px;
            font-size: 16px;
            font-weight: bold;
            color: white;
        }
    </style>
</head>
<IFRAME NAME="content_frame" width="100%" height="238px" SRC="top.jsp" ></IFRAME>
<div class="body">
    <div id="goods-category">
        <a href="#">男子</a>
        <span>></span>
        <a href="#">时尚</a>
        <span>></span>
        <a href="#">英伦</a>
        <span>></span>
        <span>biubiubiu皮鞋</span>
    </div>
    <div id="goods-img">
        <img src="${pageContext.request.contextPath}/images/img1.jpg">
        <a href="#"><img src="${pageContext.request.contextPath}/images/arrow-left-small.png"></a>
        <div id="carousel-img">
            <img src="${pageContext.request.contextPath}/images/img1.jpg" onclick="shoesImg(this)">
            <img src="${pageContext.request.contextPath}/images/img2.jpg" onclick="shoesImg(this)">
            <img src="${pageContext.request.contextPath}/images/img3.jpg" onclick="shoesImg(this)">
            <img src="${pageContext.request.contextPath}/images/img4.jpg" onclick="shoesImg(this)">
            <!--<img src="img/img5.jpg">
            <img src="img/img6.jpg">
            <img src="img/img7.jpg">-->
        </div>
        <a href="#"><img src="${pageContext.request.contextPath}/images/arrow-left-big.png"></a>
    </div>
    <div id="goods-property">
        <div id="goods-property-message">
            <div id="goods-property-sort">
                <span>男子</span>
                <span>时尚</span>
                <span>英伦</span>
            </div>
            <div id="goods-property-price">
                <span>测试鞋1</span>
                <span>¥  </span><span>899</span>
            </div>
        </div>
        <div id="goods-property-color">
            <div onclick="color(this)">
                <span>红色</span>
                <img src="${pageContext.request.contextPath}/images/img1.jpg"/>
            </div>
            <div>
                <span>黑色[B76046]</span>
                <img src="${pageContext.request.contextPath}/images/img1.jpg"/>
            </div>
        </div>

        <div id="goods-property-size">
            <span onclick="chooseSize()">选择尺码(UK码)</span>
            <span onclick="chooseNum()">选择数量</span>
            <div id="shoes-size" style="visibility:hidden">
                <ul>
                    <li onclick = "chooesSizeli(this)">32</li>
                    <li onclick = "chooesSizeli(this)">33</li>
                    <li onclick = "chooesSizeli(this)">34</li>
                    <li onclick = "chooesSizeli(this)">35</li>
                    <li onclick = "chooesSizeli(this)">36</li>
                    <li onclick = "chooesSizeli(this)">37</li>
                    <li onclick = "chooesSizeli(this)">38</li>
                    <li onclick = "chooesSizeli(this)">39</li>
                    <li onclick = "chooesSizeli(this)">40</li>
                    <li onclick = "chooesSizeli(this)">41</li>
                    <li onclick = "chooesSizeli(this)">42</li>
                    <li onclick = "chooesSizeli(this)">43</li>
                </ul>
            </div>
            <div id="shoes-num" style="visibility:hidden">
                <ul>
                    <li onclick = "byNum(this)">1</li>
                    <li onclick = "byNum(this)">2</li>
                    <li onclick = "byNum(this)">3</li>
                    <li onclick = "byNum(this)">4</li>
                </ul>
            </div>
        </div>
        <form action="" method="post" id="frombiaodan">
            <input type="hidden" name="hidden_size" id="hidden_size" value="">
            <input type="hidden" name="hidden_num" id="hidden_num" value="">
            <input type="hidden" name="hidden_name" id="hidden_name" value="">
            <input type="hidden" name="hidden_color" id="hidden_color" value="">
            <input type="submit" class="but1" onclick="buyNow()" value="立即购买">
            <input type="submit" class="but2" onclick="addCart()" value="加入购物袋">
      </form>
        <div class="serve">
            <a href="#">该商品免运费</a>
            <a href="#">联系客服</a>
        </div>

    </div>

    <div id="evaluate">
        <div>
            <p>biubiubiu中短款皮靴</p>
            <p>产品文描说明：根据《中华人民共和国广告法》相关规定，本公司将对可能涉及极限词的文案
                进行清理。鉴于产品文案数量较大，清理尚需时日。如您对产品文案内容有任何疑问，请勿
                将极限词作为选购产品的依据。</p>

            <p>敬请注意，本页面中的商品信息以及介绍内容仅供参考，商品具体情况请以实物为准。</p>
        </div>
    </div>

    <div id="maybe-like">
        <p>猜你喜欢</p>
        <div>
            <img src="${pageContext.request.contextPath}/images/img1.jpg">
            <a href="#">biubiubiu中短款皮靴</a>
            <p>￥899</p>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/images/img1.jpg">
            <a href="#">biubiubiu中短款皮靴</a>
            <p>￥899</p>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/images/img1.jpg">
            <a href="#">biubiubiu中短款皮靴</a>
            <p>￥899</p>
        </div>
        <div>
            <img src="${pageContext.request.contextPath}/images/img1.jpg">
            <a href="#">biubiubiu中短款皮靴</a>
            <p>￥899</p>
        </div>
    </div>

</div>
<IFRAME NAME="content_button" width="100%" height="1100px" SRC="button.jsp" ></IFRAME>
</html>
