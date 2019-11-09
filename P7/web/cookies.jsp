<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     
   Cookie usuario= new Cookie("usuario", request.getParameter("usr")); 
   Cookie contrasenia= new Cookie("contrasenia", request.getParameter("psw"));
   
   
    
   usuario.setMaxAge(60*60*24); 
   contrasenia.setMaxAge(60*60*24);
  
   
   response.addCookie( usuario );
   response.addCookie( contrasenia );
%>
<!DOCTYPE html>
<html>
   <head>
      <title>Cookies</title>
   </head>
   
   <body>
      <center>
         <h1>Cookies</h1>
      </center>
      <ul>
         <li> <b> Usuario: </b>
            <%= request.getParameter("usuario")%>
         </li>
         <li> <b> Contrase&ntilde;a: </b>
            <%= request.getParameter("contrasenia")%>
         </li>
         
      </ul>
   <%
         Cookie cookie = null;
         Cookie[] cookies = null;
         
         
         cookies = request.getCookies();
         
         if( cookies != null ) {
            out.println("<h1> Cookies encontrados y sus valores: </h1>");
            
            for (int i = 0; i < cookies.length; i++) {
               cookie = cookies[i];
               out.print("Nombre : " + cookie.getName( ) + ",  ");
               out.print("Valor: " + cookie.getValue( )+" <br/>");
            }
         } else {
            out.println("<h2>No se encontraron cookies</h2>");
         }
      %>
   </body>
</html>