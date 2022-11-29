<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cyluna
  Date: 21.11.2022
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>


<section class="help">

    <h2>Komu pomagamy?</h2>
    <img src="<c:url value="resources/images/decoration.svg"/>"/>

    <!-- SLIDE 1 -->
    <div class="help--slides active" data-id="1">
        <p>W naszej bazie znajdziesz listę zweryfikowanych Fundacji, z którymi współpracujemy.
            Możesz sprawdzić czym się zajmują.</p>

<c:forEach  var="item" items="${institutions}" varStatus="2">
        <ul class="help--slides-items">
            <li>
                <div class="col">
                    <div class="title">Fundacja ${item.name}</div>
                    <div class="subtitle">Cel i misja: ${item.description}</div>
                </div>

            </li>

        </ul>
</c:forEach>
    </div>

</section>



<jsp:include page="footer.jsp"/>