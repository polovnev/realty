<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Users</title></head>
<body>

<c:forEach items="${users}" var="user">
    <a href="/realty?id=${user.id}"><h1>${user.name}</h1></a><br>
</c:forEach>

</body>
</html>