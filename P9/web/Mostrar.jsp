<%@page import="Factory.Factory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
     <%
        Factory factory = Factory.getFactory();
        String user = (String)session.getAttribute("usr");
        %>
    <head>
       
        <title>Inicio de sesión</title>
    </head>
    <body>
        <h1>Hola <%=user%></h1>
        <p><%=factory.getUser(user)%></p>
        <a href="inicio.php"> Regresar </a>
    </body>
</html>
