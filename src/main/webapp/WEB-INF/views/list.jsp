<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cyluna
  Date: 04.01.2023
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-light">

        <h1> Organizacje</h1>

    </nav>
</header>
<div>
    <br><br><br><br>
</div>
<a href="/" class="btn btn-warning rounded-0 text-light m-1">Wróć do strony głównej </a>
<br>
<a href="/admin/createInst"
   class="btn btn-info rounded-0 text-light m-1">Dodaj organizacje</a>
<div>
    <br><br><br><br>
</div>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Fundacja:</th>
        <th scope="col">Cel i misja</th>
        <%--        <th scope="col">Dotacje</th>--%>
        <th scope="col">Edytuj organizacje</th>
        <th scope="col">Usuń organizacje</th>
    </tr>
    </thead>
    <tbody class="table-group-diver">
    <c:forEach var="inst" items="${institutions}" varStatus="i">
    <tr>
        <td>${inst.name}</td>
        <td>${inst.description}</td>
        <td>
            <a href="/admin/institution/edit?id=${inst.id}"
               class="btn btn-info rounded-0 text-light m-1">Edytuj</a>
        </td>
        <td>
            <a href="/admin/institution/delete?id=${inst.id}"
               class="btn btn-info rounded-0 text-light m-1"
               onclick="return confirm('Czy na pewno chcesz usunąć instytucję')">Usuń</a>
        </td>
        </c:forEach>
    </tr>
    </tbody>
</table>
<%--<div>--%>
<%--    <br><br><br><br>--%>
<%--</div>--%>
<%--<table class="table">--%>
<%--    <thead>--%>
<%--    <th>Email</th>--%>
<%--    <th>Funkcja</th>--%>
<%--    &lt;%&ndash;    <th>imię</th>&ndash;%&gt;--%>
<%--    &lt;%&ndash;    <th>nazwisko</th>&ndash;%&gt;--%>
<%--    <th>Edytuj użytkownika</th>--%>
<%--    <th>Usuń użytkownika</th>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach items="${users}" var="users">--%>
<%--        <tr>--%>
<%--            <td><c:out value="${users.email}"/></td>--%>
<%--            <td><c:out value="${users.enabled}"/></td>--%>
<%--                &lt;%&ndash;            <td><c:out value="${users.firstName}"/></td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;            <td><c:out value="${users.lastName}"/></td>&ndash;%&gt;--%>
<%--            <td>--%>
<%--                <a href="/admin/editUser?id=${users.id}"--%>
<%--                   class="btn btn-info rounded-0 text-light m-1">Edytuj</a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="/admin/deleteUser?id=${users.id}"--%>
<%--                   class="btn btn-info rounded-0 text-light m-1"--%>
<%--                   onclick="return confirm('Czy na pewno chcesz usunąć użytkownika?')">Usuń</a>--%>
<%--            </td>--%>

<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>
<%--<div>--%>
<%--    <br><br><br><br>--%>
<%--</div>--%>
<%--<table class="table">--%>
<%--    <thead>--%>
<%--    <th>Ilość worków:</th>--%>
<%--    <th>Kategorie:</th>--%>
<%--    <th>Instytucja:</th>--%>
<%--    <th>Ulica:</th>--%>
<%--    <th>Miasto:</th>--%>
<%--    <th>Kod pocztowy:</th>--%>
<%--    <th>Telefon:</th>--%>
<%--    <th>Data odbioru:</th>--%>
<%--    <th>Godzina odbioru:</th>--%>
<%--    <th>Komentarz:</th>--%>

<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach items="${donations}" var="donation">--%>
<%--        <tr>--%>
<%--            <td><c:out value="${donation.quantity}"/></td>--%>
<%--            <td>--%>
<%--                <c:forEach var="category" items="${donation.categories}">--%>
<%--                    ${category.name},--%>
<%--                </c:forEach>--%>
<%--            </td>--%>
<%--            <td><c:out value="${donation.institution.name}"/></td>--%>
<%--            <td><c:out value="${donation.street}"/></td>--%>
<%--            <td><c:out value="${donation.city}"/></td>--%>
<%--            <td><c:out value="${donation.zipCode}"/></td>--%>
<%--            <td><c:out value="${donation.phone}"/></td>--%>
<%--            <td><c:out value="${donation.pickUpDate}"/></td>--%>
<%--            <td><c:out value="${donation.pickUpTime}"/></td>--%>
<%--            <td><c:out value="${donation.pickUpComment}"/></td>--%>

<%--            <td>--%>
<%--                <a href="/admin/editDonation?id=${donation.id}"--%>
<%--                   class="btn btn-info rounded-0 text-light m-1">Edytuj</a>--%>
<%--            </td>--%>
<%--                &lt;%&ndash;            <td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                <a href="/admin/deleteUser?id=${users.id}"&ndash;%&gt;--%>
<%--                &lt;%&ndash;                   class="btn btn-info rounded-0 text-light m-1"&ndash;%&gt;--%>
<%--                &lt;%&ndash;                   onclick="return confirm('Czy na pewno chcesz usunąć użytkownika?')">Usuń</a>&ndash;%&gt;--%>
<%--                &lt;%&ndash;            </td>&ndash;%&gt;--%>

<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>
<%--<div>--%>
<%--    <br><br><br><br>--%>
<%--</div>--%>
<%--<a href="/admin/createCategory"--%>
<%--   class="btn btn-info rounded-0 text-light m-1">Dodaj kategorie</a>--%>
<%--<br>--%>
<%--<table class="table">--%>
<%--    <thead>--%>
<%--    <th>Nazwa</th>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--    <c:forEach items="${categories}" var="category">--%>
<%--        <tr>--%>
<%--            <td><c:out value="${category.name}"/></td>--%>
<%--                &lt;%&ndash;            <td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                <a href="/admin/editUser?id=${users.id}"&ndash;%&gt;--%>
<%--                &lt;%&ndash;                   class="btn btn-info rounded-0 text-light m-1">Edytuj</a>&ndash;%&gt;--%>
<%--                &lt;%&ndash;            </td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;            <td>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                <a href="/admin/deleteUser?id=${users.id}"&ndash;%&gt;--%>
<%--                &lt;%&ndash;                   class="btn btn-info rounded-0 text-light m-1"&ndash;%&gt;--%>
<%--                &lt;%&ndash;                   onclick="return confirm('Czy na pewno chcesz usunąć użytkownika?')">Usuń</a>&ndash;%&gt;--%>
<%--                &lt;%&ndash;            </td>&ndash;%&gt;--%>

<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>
</body>
</html>
