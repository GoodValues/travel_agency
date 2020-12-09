<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Users</title>
</head>
<body>

<h1>List of users</h1>

<a href="/register">Add new user</a>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Role</th>
        <th>City</th>
        <th>Trips</th>
        <th></th>
        <th></th>
    </tr>

    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>
            <td>${user.roleName}</td>
            <td>${user.address.city}</td>
            <td><a href="/getTripsForUser/${user.id}">Trips for user</a></td>

            <td><a href="/deleteUser?id=${user.id}">Usuń</a></td>
            <td><a href="/editUser?id=${user.id}">Edytuj</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>