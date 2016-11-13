<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calendar records</title>
</head>
<body>
<table>
    <c:forEach items="${calendarRecords}" var="calendarRecord">
        <tr>
            <td>${calendarRecord.clientSurname}</td>
            <td>${calendarRecord.clientName}</td>
            <td>${calendarRecord.clientPatronimyc}</td>
            <td>${calendarRecord.phone}</td>
            <td>${calendarRecord.date}</td>
            <td>${calendarRecord.time}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>