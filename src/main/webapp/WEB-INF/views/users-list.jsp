<%--
  Created by IntelliJ IDEA.
  User: cyluna
  Date: 08.12.2022
  Time: 08:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="resources/css/style.css"/>"/>
</head>
<body>
<header>
    <nav class="container container--70">
        <ul class="nav--actions">
            <li><a href="<c:url value="/login"/>">Zaloguj</a></li>
            <li class="highlighted"><a href="<c:url value="/register"/>">Załóż konto</a></li>
        </ul>

        <ul>
            <li><a href="<c:url value="/"/>" class="btn btn--without-border active">Start</a></li>
            <li><a href="<c:url value="/#steps"/>" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="<c:url value="/#about-us"/>" class="btn btn--without-border">O nas</a></li>
            <li><a href="<c:url value="/#help"/>" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="<c:url value="/#contact"/>" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>
</header>

<section class="login-page">
    <h2>Users</h2>
    <table class="table">
        <tr>

            <th>Imię</th>
            <th>Nazwisko</th>
            <th>Email</th>
            <th>Akcja</th>


        </tr>
        <c:forEach items="${users}" var="item">
            <tr>
                <td>${users.firstName}</td>
                <td>${item.lastName}</td>
                <td>${users.email}</td>
                <td>
               <a href="<c:url value="/users/delete/${item.id}"/>" class="btn btn--without-border">Usuń</a>
                    <a href="<c:url value="/users/update/${item.id}"/>" class="btn btn--without-border">Edytuj</a>

                </td>
            </tr>

        </c:forEach>

    </table>


<jsp:include page="footer.jsp"/>

<script src="<c:url value="resources/js/app.js"/>"></script>
</body>
</html>

