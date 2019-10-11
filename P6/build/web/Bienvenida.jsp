<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Bienvinida </title>
        <link rel="stylesheet" type="text/css" href="Stile41.css">
    </head>
    <body>
       
        <h1> BIENVENIDO! </h1>
        
        
       <%
           
       out.print(request.getParameter("nombre"));
       
       out.print(request.getParameter("contra"));
       
       %>
    </body>
</html>
