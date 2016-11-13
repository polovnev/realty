<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Realties</title>
</head>
<body>
<c:forEach items="${realties}" var="realty">
    <a href="/calendarRecord/show?id=${realty.id}"><h1>${realty.name}</h1></a><br>
</c:forEach>
</body>
</html>