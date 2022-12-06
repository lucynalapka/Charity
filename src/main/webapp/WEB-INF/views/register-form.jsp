<%--
  Created by IntelliJ IDEA.
  User: cyluna
  Date: 01.12.2022
  Time: 14:25
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
    <h2>Załóż konto</h2>
    <form:form method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div class="form-group">
            <input type="username" name="username" placeholder="Username"/>
        </div>
        <div class="form-group">
            <input type="email" name="email" placeholder="Email"/>
        </div>
        <div class="form-group">
            <input type="password" name="password" placeholder="Hasło"/>
        </div>
        <div class="form-group">
            <input type="password" name="password2" placeholder="Powtórz hasło"/>
        </div>

        <div class="form-group form-group--buttons">
            <a href="<c:url value="/login"/>" class="btn btn--without-border">Zaloguj się</a>
            <input type="submit" class="btn" value="Załóż konto"/>
        </div>
        <div class="col-md-6">
            <div class="form-label-group">
                <form:errors path="email"/>
                <form:errors path="password"/>
                <form:errors path="confirm_password"/>
            </div>
        </div>
    </form:form>
</section>


<jsp:include page="footer.jsp"/>

<script src="<c:url value="resources/js/app.js"/>"></script>
</body>
</html>


<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>

<%--<head>--%>

<%--    <meta charset="utf-8">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">--%>
<%--    <meta name="description" content="">--%>
<%--    <meta name="author" content="">--%>

<%--    <title>SB Admin - Register</title>--%>

<%--    <!-- Bootstrap core CSS-->--%>
<%--    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">--%>

<%--    <!-- Custom fonts for this template-->--%>
<%--    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">--%>

<%--    <!-- Custom styles for this template-->--%>
<%--    <link href="/resources/css/sb-admin.css" rel="stylesheet">--%>

<%--</head>--%>

<%--<body class="bg-dark">--%>

<%--<div class="container">--%>
<%--    <div class="card card-register mx-auto mt-5">--%>
<%--        <div class="card-header">Register an Account</div>--%>
<%--        <div class="card-body">--%>
<%--            <form:form method="post">--%>
<%--            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>

<%--            <div class="form-group">--%>
<%--                <div class="form-label-group">--%>
<%--                    <input type="text" id="email" name="email" class="form-control" placeholder="email" required="required" autofocus="autofocus">--%>
<%--                    <label for="email">Email</label>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--            <div class="form-group">--%>
<%--                <div class="form-row">--%>
<%--                    <div class="col-md-6">--%>
<%--                        <div class="form-label-group">--%>
<%--                            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required="required">--%>
<%--                            <label for="inputPassword">Password</label>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="col-md-6">--%>
<%--                        <div class="form-label-group">--%>
<%--                            <input type="password" id="confirmPassword" name="confirm_password" class="form-control" placeholder="Confirm password" required="required">--%>
<%--                            <label for="confirmPassword">Confirm password</label>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--        </div>--%>
<%--        <input type="submit" class="btn btn-primary btn-block" value="Register"/>--%>
<%--        <div class="col-md-6">--%>
<%--            <div class="form-label-group">--%>
<%--                <form:errors path="email" />--%>
<%--                <form:errors path="password" />--%>
<%--                <form:errors path="confirm_password" />--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        </form:form>--%>

<%--        <div class="text-center">--%>
<%--            <a class="d-block small mt-3" href="/login">Login Page</a>--%>

<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--</div>--%>


<%--<jsp:include page="footer.jsp"/>--%>

<%--<script src="<c:url value="resources/js/app.js"/>"></script>--%>
<%--</body>--%>

<%--</html>--%>