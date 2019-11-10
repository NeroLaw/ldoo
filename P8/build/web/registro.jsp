<%-- 
    Document   : registro
    Created on : 9/11/2019, 06:03:08 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Registro </title>
    </head>
    <body>
        <h1> Registro </h1>
        
        <form action="Registrar" method="POST">
        
            <input type="text" name="usr" placeholder="Usuario" /> <br> <br>
            <input type="password" name="psw"placeholder="Contrase&ntilde;a"/> <br> <br>
            <input type="text" name="correo"placeholder="Correo"/> <br> <br>
          
            <input type="submit" value="submit"/>
         
        
    </body>
</html>
