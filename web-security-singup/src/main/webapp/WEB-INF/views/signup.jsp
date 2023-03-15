<%--
  Created by IntelliJ IDEA.
  User: spdevops
  Date: 09-01-2023
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Signup</title>
</head>
<body>
    <h1>Sing up</h1>
    <form:form action="process-signup" method="post" modelAttribute="signupDTO">
        Username: <form:input path="username"/>  <br>
        Password: <form:password path="password"/> <br>
        <input type="submit" value="signup">
    </form:form>
</body>
</html>
