<%--
  Created by IntelliJ IDEA.
  User: Mark
  Date: 16/10/2021
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <th>
        Owner :
    </th>

    <th>
        Address :
    </th>

    <th>
        Number of Rooms :
    </th>

    <c:forEach items="${myHouseList}" var="house">
        <tr>
            <td><c:out value="${house.name}" default="Name unknown"/></td>
            <td><c:out value="${house.address}" default="Address unknown"/></td>
            <td><c:out value="${house.numRooms}" default="0"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
