<%--
  Created by IntelliJ IDEA.
  User: Teni
  Date: 2020. 11. 22.
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Adatbázisban levő könyvek</title>
</head>
<body>
<c:if test="${!empty konyvek}">
    <table frame="border" rules="all">
        <tr><th>Azonosító</th><th>Cím</th><th>Oldalszám</th><th>Kiadás</th><th>Fajta</th><th>Opció</th></tr>
    <c:forEach items="${konyvek}" var="konyv">
        <tr>
            <td><a href="${pageContext.servletContext.contextPath}/konyv/${konyv.id}">${konyv.id}</a></td><td>${konyv.cim}</td><td>${konyv.oldalSzam}</td><td>${konyv.kiadas}</td><td>${konyv.fajta}</td>
            <td>
                <a href="${pageContext.servletContext.contextPath }/konyv/${konyv.id}/delete" onclick="return confirm('Biztosan törli?')">Törlés</a>
            </td>
        </tr>
    </c:forEach>
    </table>
</c:if>

<form action="${pageContext.servletContext.contextPath}/addKonyv">
    <input type="submit" value="Könyv hozzáadása">
</form>
<form action="${pageContext.servletContext.contextPath}/">
    <input type="submit" value="Vissza a kezdőoldalra">
</form>
<form action="${pageContext.servletContext.contextPath}/konyvek/PAPIR">
    <input type="submit" value="Papírok">
</form>
<form action="${pageContext.servletContext.contextPath}/konyvek/EBOOK">
    <input type="submit" value="Ebookok">
</form>
<form action="${pageContext.servletContext.contextPath}/konyvek/HANGOSKONYV">
    <input type="submit" value="Hangoskönyvek">
</form>
</body>
</html>
