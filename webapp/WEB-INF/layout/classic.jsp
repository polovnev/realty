<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<tiles:insertAttribute name="menu"/>
<br><br>
<tiles:insertAttribute name="body"/>
<center>
    <tiles:insertAttribute name="footer"/>
</center>
</body>
</html>