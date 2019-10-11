import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Inicio extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      HttpSession session = request.getSession(true);

      String title = "Inicio de Sesion";
      Integer visitCount = new Integer(0);
      String visitCountKey = new String("Visitas");
      String userIDKey = new String("----");
      String userID = new String("XXXX");

      if (session.isNew()) {
         title = "Bienvenido visitante c:";
         session.setAttribute(userIDKey, userID);
      } else {
         visitCount = (Integer)session.getAttribute(visitCountKey);
         visitCount = visitCount + 1;
         userID = (String)session.getAttribute(userIDKey);
      }
      session.setAttribute(visitCountKey,  visitCount);

      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      
       String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
       
       out.println(docType +
               "<html>" +
    "<head>" +
        "<title> Login </title>" +
       
    "</head>" +
    "<body>" +
    "<center>" +
        "<h1> Inicio de Sesi&oacute; </h1>" +
       
           "<form action='Bienvenida.jsp' method='Get'>" +
        
            "<input type='text' name='nombre' placeholder='Nombre' />" + "<br>" + "<br>" +
            
            "<input type='password' name='contra' placeholder='Contrase&ntilde;a'/>" + "<br>" + "<br>" +
            
            "<input type='submit' value='submit'/>" +
         
          "</form>" +
    
    "</center>"      +
    "</body>" +
"</html>" 
       
     );
   }
}
