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
    <p>登陆系统</p>
    <form action="/war/MySSM/controller/welcome" method="post">
        userName : <input name="userName" type="text"/><br>
        <br>
        password : <input name="password" type="password"/><br>
        <input type="submit" value="submit"/><br>
    </form>
</center><br>
<center><a href="/war/MySSM/controller/signInPage"><button>新用户注册</button></a></center>
</body>
</html>