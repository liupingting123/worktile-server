<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    username:<input name="username" type="text" />
    password:<input name="password" type="password" />
    <input type="submit" value="login">
</form>
</body>
</html>
