<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/9
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交商品</title>
</head>
<body>
<%--action属性指定表单数据所提交到的处理器映射路径--%>
<form action="${pageContext.request.contextPath}/setGetProducts" method="post">
    <table width="220px" border="1">
        <tr>
            <td>选择</td>
            <td>商品名称</td>
        </tr>
        <tr>
            <td>
                <%-- <input>属性中的name属性会根据值与处理器中的形参所绑定 --%>
                <%-- input标签中的name属性用于与处理器（服务器端）中的形式参数进行绑定。当表单提交时，表单数据会以name属性为键，输入值为值，被发送到服务器端。服务器端的处理器可以通过形式参数与相应的name属性进行绑定，以获取表单数据并进行处理。在给定的例子中，name属性为"proIds"，当该表单提交时，处理器可以通过该形式参数名来获取对应的值。 --%>
                <label>
                    <input name="proIds" value="1" type="checkbox"/>
                </label>
            </td>
            <td>
                Java基础教程
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    <input name="proIds" value="2" type="checkbox"/>
                </label>
            </td>
            <td>
                JavaWeb案例
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    <input name="proIds" value="3" type="checkbox">
                </label>
            </td>
            <td>
                SSM框架实战
            </td>
        </tr>
    </table>
    <input type="submit" value="提交商品"/>
</form>
</body>
</html>