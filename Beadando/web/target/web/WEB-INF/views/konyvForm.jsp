<%--
  Created by IntelliJ IDEA.
  User: Teni
  Date: 2020. 11. 22.
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Könyv hozzáadása</title>
</head>
<body>
    <form:form method="post" action="addKonyv" modelAttribute="konyv">
        <form:label path="cim">Cím</form:label>
        <form:input path="cim"/>
        <form:label path="oldalSzam">Oldalszám</form:label>
        <form:input path="oldalSzam"/>
        <form:label path="kiadas">Kiadás</form:label>
        <form:input type="date" path="kiadas"/>
        <form:label path="fajta">Fajta</form:label>
        <form:select path="fajta">
            <form:options items="${fajtak}"/>
        </form:select>
        <input type="submit" value="Felvitel">
    </form:form>
</body>
</html>
