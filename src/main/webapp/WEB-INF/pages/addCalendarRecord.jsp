<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add calendar record</title>
</head>
<body>
<form method="post" action="/calendarRecord/add">
    <table>
        <tr>
            <td>Realty</td>
            <td><select name="realty">
                <c:forEach items="${realties}" var="realty">
                    <option value="${realty.id}">${realty.name}</option>
                </c:forEach>
            </select></td>
        </tr>
        <tr>
            <td>Client name</td>
            <td><input type="text" name="client_name"></td>
        </tr>
        <tr>
            <td>Client patronimyc</td>
            <td><input type="text" name="client_patronimyc"></td>
        </tr>
        <tr>
            <td>Client surname</td>
            <td><input type="text" name="client_surname"></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>Date</td>
            <td><input type="text" name="date"></td>
        </tr>
        <tr>
            <td>Time</td>
            <td><input type="text" name="time"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Отправить"></td>
        </tr>
    </table>
</form>

</body>
</html>