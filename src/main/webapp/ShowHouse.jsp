<%--
  Created by IntelliJ IDEA.
  User: Mark
  Date: 16/10/2021
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

Owners: <c:out value="${myHouse.name}" default="Name unknown"/> <br>
Address: <c:out value="${myHouse.address}" default="Address unknown"/> <br>
Number of rooms: <c:out value="${myHouse.numRooms}" default="0"/> <br>

</body>
</html>
