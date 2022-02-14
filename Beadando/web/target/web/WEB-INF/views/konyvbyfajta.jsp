<%--
  Created by IntelliJ IDEA.
  User: Teni
  Date: 2020. 12. 02.
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>${konyv.fajta} fajtájú könyvek</title>
</head>
<body>
    <table frame="border" rules="all">
        <tr><th>Azonosító</th><th>Cím</th><th>Oldalszám</th><th>Kiadás</th><th>Fajta</th></tr>
        <c:forEach items="${konyvek}" var="konyv">
            <tr>
                <td>${konyv.id}</td><td>${konyv.cim}</td><td>${konyv.oldalSzam}</td><td>${konyv.kiadas}</td><td>${konyv.fajta}</td>
            </tr>
        </c:forEach>
    </table>
<form action="${pageContext.servletContext.contextPath}/">
    <input type="submit" value="Vissza a kezdőoldalra">
</form>
</body>
</html>
