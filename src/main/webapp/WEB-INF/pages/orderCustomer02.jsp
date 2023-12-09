<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/9
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/showOrders" method="post">
    <table width="220px" border="1">
        <tr>
            <td>订单号</td>
            <td>订单名称</td>
            <td>配送地址</td>
        </tr>
        <tr>
            <td>
                <label>
                    <input name="orders[0].orderId" value="1" type="text">
                </label>
            </td>
            <td>
                <%--List的泛型参数为对象类型，则客户端参数名称必须与最终绑定在List中的某个对象的某个属性的名称保持一致，类似下面--%>
                <label>
                    <input name="orders[0].orderName" value="Java基础教程" type="text">
                </label>
            </td>
            <td>
                <%--List的泛型为简单类型，则客户端参数名称必须与entity类中List属性所属类中的属性名称保持一致，将每一个将传入List address的数据都放入的列表中，类似下面--%>
                <label>
                    <input name="address" value="北京海淀" type="text">
                </label>
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    <input name="orders[1].orderId" value="2" type="text">
                </label>
            </td>
            <td>
                <label>
                    <input name="orders[1].orderName" value="JavaWeb案例" type="text">
                </label>
            </td>
            <td>
                <label>
                    <input name="address" value="北京昌平" type="text">
                </label>
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    <input name="orders[2].orderId" value="3" type="text">
                </label>
            </td>
            <td>
                <label>
                    <input name="orders[2].orderName" value="SSM框架实战" type="text">
                </label>
            </td>
            <td>
                <label>
                    <input name="address" value="北京朝阳" type="text">
                </label>
            </td>
        </tr>
    </table>
    <input type="submit" value="订单信息">
</form>
</body>
</html>