<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nominas</title>
</head>
<body>
<h1><%= "NOMINA" %>
</h1>
<form action="NominaServlet" method="get">
    <label for="nombres"> Nombres: </label><br>
    <input type="text" name="nombres" id="nombres" required><br>
    <label for="apellidos"> Apellidos: </label><br>
    <input type="text" name="apellidos" id="apellidos" required><br>
    <label for="documento"> Documento: </label><br>
    <input type="text" name="documento" id="documento" required><br>
    <label for="diastrabajados"> Dias trabajados: </label><br>
    <input type="text" name="diastrabajados" id="diastrabajados" required><br>
    <label for="sueldo"> Sueldo: </label><br>
    <input type="text" name="sueldo" id="sueldo" required><br>
    <input type="submit" name="enviar" id="enviar" value="ENVIAR"><br>

</form>
<br/>

</body>
</html>