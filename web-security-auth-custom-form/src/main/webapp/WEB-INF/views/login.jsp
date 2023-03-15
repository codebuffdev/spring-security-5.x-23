<%--
  Created by IntelliJ IDEA.
  User: spdevops
  Date: 19-12-2022
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Log-in</title>
</head>

<body>

<c:if test="${param.error != null }">
    <i style="color: red">Invalid login or password</i>
</c:if>

<c:if test="${param.error != logout }">
    <i style="color: red"> Successfully logout</i>
</c:if>

<h1 style="align-content: center;color: red">Log in Page</h1>
<form:form action="loginto" method="post">
    Username: <input type="text" name="username" placeholder="Enter username"> <br/>
    Password: <input type="password" name="password" placeholder="password pls"> <br/>
    <input type="submit" value="login">
</form:form>
</body>

</html>
