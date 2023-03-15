<%--
  Created by IntelliJ IDEA.
  User: spdevops
  Date: 07-12-2022
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Basic Check Response</title>
</head>
<body>
<h1 style="align-content: center">
    Hello !! U just checked in to the framework <br/>
    With the Spring Security Safeguarding
</h1>


<form:form action="logout" method="post">
    <input type="submit" value="logout">
</form:form>

</body>
</html>
