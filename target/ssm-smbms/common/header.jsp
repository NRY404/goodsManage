
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="refresh" content="300">
    <title>Title</title>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>超市销售管理系统</h1>
    <div class="publicHeaderR">
        <p><span style="color: #fff21b">${sessionScope.user.name}</span> , 欢迎你！</p>
        <a href="${pageContext.request.contextPath}/login/logOut.do">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2021年11月11日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用chrome浏览器！</a>
</section>
</body>
</html>
