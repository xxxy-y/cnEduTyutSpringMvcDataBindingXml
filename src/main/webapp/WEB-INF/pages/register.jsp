<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/7
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registerUser" method="post">
    用户名:<label>
    <input type="text" name="username">
</label>
    <br>
    密码:<label>
    <input type="password" name="password">
</label>
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
