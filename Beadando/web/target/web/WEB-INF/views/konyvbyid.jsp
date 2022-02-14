<%@ taglib prefix="delete" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Teni
  Date: 2020. 11. 22.
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>${konyv.id}</title>
</head>
<body>
<table>
    <tr><td>Cím:</td><td>${konyv.cim}</td></tr>
    <tr><td>Oldalszám:</td><td>${konyv.oldalSzam}</td></tr>
    <tr><td>Kiadás:</td><td>${konyv.kiadas}</td></tr>
    <tr><td>Fajta:</td><td>${konyv.fajta}</td></tr>
</table>
<form action="${pageContext.servletContext.contextPath}/">
    <input type="submit" value="Vissza a kezdőoldalra">
</form>
</body>
</html>
