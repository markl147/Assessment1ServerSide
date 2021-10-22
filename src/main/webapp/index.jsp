<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Assignment 1" %></h1>

<form method="post" action="/HouseServlet">
    <h2>Show this house</h2>
    <p>Please enter the owners name: <input type = text name = "name"></p>
    <p>Please enter the address: <input type = text name = "address"></p>
    <p>Please enter the number of bedrooms: <input type = text name = "numRooms"></p>
    <input type = submit name = submit value="Show house">
</form>

<br>

<form method="post" action="/ListHousesServlet">
    <h2>Show list of houses</h2>
    <p>Please enter the owners name: <input type = text name = "owner"></p>
    <p>Please enter the address: <input type = text name = "address"></p>
    <p>Please enter the number of bedrooms: <input type = text name = "numRooms"></p>
    <input type = submit name = submit value="Show list">
</form>
</body>
</html>