<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Formulario </title>
        <link rel="stylesheet" type="text/css" href="Stile41.css">
    </head>
    <body>
       
       <%
           
       out.print(request.getParameter("nombre"));
       
       out.print(request.getParameter("contra"));
       
       out.print(request.getParameter("correo"));
       
       out.print(request.getParameter("num"));
       
       
       %>
    </body>
</html>
