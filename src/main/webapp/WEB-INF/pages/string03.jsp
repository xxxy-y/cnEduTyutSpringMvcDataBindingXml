<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/10
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>string02</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/showModelAndView" method="post">
    用户名：
    <label>
        <input name="username" value="${username}" type="text">
    </label>
    密码：
    <label>
        <input name="password" value="${user.password}" type="text">
    </label>
    <input type="submit" value="提交">
</form>
</body>
</html>