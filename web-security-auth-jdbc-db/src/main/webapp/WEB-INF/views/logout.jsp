<%--
  Created by IntelliJ IDEA.
  User: spdevops
  Date: 06-01-2023
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Logout</title>
</head>
<body>
    <h3>Please logout</h3>

    <form:form action="logout" method="post">
        <input type="submit" value="logout">
    </form:form>

</body>
</html>
