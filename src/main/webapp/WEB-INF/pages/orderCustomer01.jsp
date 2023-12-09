<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/9
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/findOrderWithCustomer" method="post">
    所属用户:
    <label>
        <input name="username" type="text">
    </label>
    订单编号:
    <label>
        <%--在复杂entity数据绑定时，如果数据需要绑定到entity的属性对象的属性中，客户端请求的参数名的格式必须为·属性对象名称.属性·，其中属性对象名称要与entity的属性对象名称一致，“属性”要与属性对象所属类的属性一致，类似如下--%>
        <input name="order.orderId" type="text">
    </label>
    <input type="submit" value="查询">
</form>
</body>
</html>
