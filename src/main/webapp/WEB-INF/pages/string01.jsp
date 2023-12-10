<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/9
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/showPageByRequest" method="post">
    用户名：
    <label>
        <%--在Spring MVC中，使用HttpServletRequest参数来向视图传输数据是不推荐的做法。这是因为HttpServletRequest是Servlet API中的类，它属于底层的Web技术，不是Spring MVC框架中的组件。

在Spring MVC中，推荐使用ModelAndView对象或Model对象来向视图传递数据。ModelAndView是一个包含模型数据和视图名称的类，它可以将数据和视图进行封装并一起返回给前端。而Model对象是一个接口，它可以用来存储模型数据，并将其传递给视图。

使用HttpServletRequest参数来向视图传递数据可能导致视图无法正确获取到数据。在视图中，可以通过EL表达式或JSTL标签来访问模型数据。如果使用HttpServletRequest参数来传递数据，视图无法识别和解析这些数据，因此无法找到对应的变量。

正确的做法是在Spring MVC的处理方法中使用ModelAndView对象或Model对象来封装数据，并将其返回给视图。在视图中可以使用EL表达式或JSTL标签来访问这些数据，例如使用${username}来访问用户名数据。--%>
        <input name="username" value="${username}" type="text">
    </label>
    密码：
    <label>
        <input name="password" value="${password}" type="text">
    </label>
    <input type="submit" value="注册">
</form>
</body>
</html>
