<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        
        <%     
        if(session.getAttribute("Usuario")==null){
        
            response.sendRedirect("index.jsp");
        }
        
        %>
        
        Welcome ${Usuario}
        
        <a href="hola.jsp"> Hola </a>
        <a href="lic.html"> Sus datos aqui </a>
            
        <form action="Logout">
           
            <input type="submit" value="logout"/>
            
            
        </form>
        
    </body>
</html>
