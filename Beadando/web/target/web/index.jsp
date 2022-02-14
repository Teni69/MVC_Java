<%@page isELIgnored="false" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Kattintson az alábbi gombra az adatbázis megtekintéséhez</h2>
<form action="${pageContext.servletContext.contextPath}/konyvek">
    <input type="submit" value="Tárolt könyvek">
</form>
</body>
</html>
