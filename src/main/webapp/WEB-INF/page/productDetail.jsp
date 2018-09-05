<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\4 0004
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>商品详情页面</title>
    <link rel="stylesheet" type="text/css" href="../../css/productDetails.css">
    <script type="text/javascript" src="../../js/productDetails.js"></script>
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
        <img src="../../images/img1.jpg">
        <a href="#"><img src="../../images/arrow-left-small.png"></a>
        <div id="carousel-img">
            <img src="../../images/img1.jpg">
            <img src="../../images/img2.jpg">
            <img src="../../images/img3.jpg">
            <img src="../../images/img4.jpg">
            <!--<img src="img/img5.jpg">
            <img src="img/img6.jpg">
            <img src="img/img7.jpg">-->
        </div>
        <a href="#"><img src="../../images/arrow-left-big.png"></a>
    </div>
    <div id="goods-property">
        <div id="goods-property-message">
            <div id="goods-property-sort">
                <span>男子</span>
                <span>时尚</span>
                <span>英伦</span>
            </div>
            <div id="goods-property-price">
                <span>biubiubiu中短款皮靴</span>
                <span>¥  </span><span>899</span>
            </div>
        </div>
        <div id="goods-property-color">
            <div>
                <span>黑色[B76046]</span>
                <img src="../../images/img1.jpg"/>
            </div>
            <div>
                <span>黑色[B76046]</span>
                <img src="../../images/img1.jpg"/>
            </div>
        </div>
        <div id="goods-property-size">
            <span>选择尺码(UK码)</span>
            <span>选择数量</span>
            <div>

            </div>
        </div>
        <button class="but1">立即购买</button>
        <button class="but2">加入购物袋</button>
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
            <img src="../../images/img1.jpg">
            <a href="#">biubiubiu中短款皮靴</a>
            <p>￥899</p>
        </div>
        <div>
            <img src="../../images/img1.jpg">
            <a href="#">biubiubiu中短款皮靴</a>
            <p>￥899</p>
        </div>
        <div>
            <img src="../../images/img1.jpg">
            <a href="#">biubiubiu中短款皮靴</a>
            <p>￥899</p>
        </div>
        <div>
            <img src="../../images/img1.jpg">
            <a href="#">biubiubiu中短款皮靴</a>
            <p>￥899</p>
        </div>
    </div>

</div>
<IFRAME NAME="content_button" width="100%" height="1100px" SRC="button.jsp" ></IFRAME>
</html>
