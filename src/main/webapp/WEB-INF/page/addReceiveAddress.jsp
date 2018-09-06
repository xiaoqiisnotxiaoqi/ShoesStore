<%--
  Created by IntelliJ IDEA.
  User: Hei
  Date: 2018/9/5
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>收货地址</title>
    <link rel="stylesheet" href="../css/addReceiveAddress.css">
    <script type="text/javascript" src="../js/addReceiveAddress.js"></script>
</head>
<body>
<%--<jsp:include page= "top.jsp">
    &lt;%&ndash;param子标记进行传值&ndash;%&gt;
</jsp:include>--%>
<%@include file="top.jsp"%>
<form action="">
    <div id="addressdiv">
        <ul id="ul001">
            <li>
                <span><label>*</label>选择所在地:</span>
                <div class="text001"></div><span class="info001"></span>
            </li>
            <li>
                <span><label>*</label>详细地址:</span>
                <div class="text001"><input type="text" id="address-detail" onblur="address_detail(this)" placeholder="如:工业园区4栋202室"></div><span id="address-detail-info" class="info001"></span>
            </li>
            <li>
                <span>邮政编码:</span>
                <div class="text001"><input type="text" id="port-number" onblur="port_number(this)" placeholder="6位邮政编码"></div><span  id="port-number-info" class="info001"></span>
            </li>
            <li>
                <span><label>*</label>联系人姓名:</span>
                <div class="text001"><input type="text" id="contact-name" onblur="contact_name(this)" placeholder=""></div><span id="contact-name-info" class="info001"></span>
            </li>
            <li>
                <span><label>*</label>联系电话:</span>
                <div class="text001"><input type="text" id="contact-phone" onblur="contact_phone(this)" placeholder=""></div><span id="contact-phone-info" class="info001"></span>
            </li>
        </ul>
    </div>
    <div id="submitdiv">
        <input type="submit" onclick="submitcheck()" value="保存">
        <input type="reset">
    </div>
    <%@include file="button.jsp"%>
    <%--<jsp:include page= "button.jsp">
        &lt;%&ndash;param子标记进行传值&ndash;%&gt;
    </jsp:include>--%>
</form>
</body>
</html>
