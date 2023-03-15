<%--
  Created by IntelliJ IDEA.
  User: spdevops
  Date: 09-12-2022
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>log IN</title>
</head>
<body>
<h1 style="align-content: center">Custom Log-IN</h1>

<%--handling bad user crediential --%>
<c:if test="${param.error!=null}">
    <i style="color: red">Invalid Credential</i>
</c:if>

<c:if test="${param.logout != null}">
    <i style="color: green">Successfully logged out</i>
</c:if>

<form:form style="align-content: center" action="clogin" method="post">
    Username : <input type="text" name="username"/> <br>
    Password : <input type="password" name="password"/> <br>
    <input type="submit" value="LOG-IN">
</form:form>

</body>
</html>
