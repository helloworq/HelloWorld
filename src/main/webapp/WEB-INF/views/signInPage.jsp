<%--
  Created by IntelliJ IDEA.
  User: 12733
  Date: 2019/09/21
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<center>
    <form action="/war/MySSM/controller/signInResultPage" method="post">
        <p>新用户注册</p>
        userName : <input name="userName" type="text"/><br>
        <br>
        password : <input name="password" type="password"/><br>
            <input type="submit" value="按钮">
    </form>
</center><br>
</body>
</html>