<%--
<%@page import="Modelo.Registro"%>
<% 
    Registro r = (Registro)request.getSession().getAttribute("Resg");
%>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Hecho </title>
    </head>
    <body>
        <h1> Registro exitoso </h1>
        <%--
        <label> Usuario: </label> <% r.getUsuario();%>
        <label> Contrase&ntilde;a: </label> <% r.getContra();%>
        <label> Correo: </label> <% r.getCorreo();%>
        --%>
    </body>
</html>
