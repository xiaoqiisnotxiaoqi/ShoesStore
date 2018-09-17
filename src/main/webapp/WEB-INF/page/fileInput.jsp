<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\11 0011
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript">
    function checkForm(){
        var fileName=document.getElementById("file").value;
        if(fileName==null||fileName===""){
            document.getElementById("error").innerHTML="文件不能为空！";
            return false;
        }
        return true;
    }
</script>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body >
<form action="fileupload" method="POST" enctype="MULTIPART/FORM-DATA" onsubmit="return checkForm()">

    userName:<input type="text" id="userName" name="userName" size="30"/> <br/><br/>
    File:<input type="file" id="file" name="file" size="30"/> <br/><br/>

    <button class="btn btn-primary" type="submit" >上传</button>&nbsp;&nbsp;
    &nbsp;
    <span id="error" color="red">${error }</span>
</form>
</body>
</html>
