import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class PostF3 extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "SS1";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
         
      out.println("</ul>\n" +
              "</body>" +
              docType +
              "" +
              docType +
              "<html>\n" +
                      "    <head>\n" +
                      "        \n" +
                      "        <title> Pr&aacute;ctica 3 </title>\n" +
                      "       \n" +
                      "    </head>\n" +
                      "    <body>\n" +
                      "        <form action=\"FormP3\" method=\"GET\" >\n" +
                      "            Usuario: <input type=\"text\" name=\"u1\"/> <br> <br>\n" +
                      "            Contrase&ntilde;a: <input type=\"password\" name=\"p1\"/> <br> <br>\n" +
                      "            Correo: <input type=\"email\" name=\"e1\"/> <br> <br>\n" +
                      "            Fecha de cumplea&ntilde;os: <input type=\"date\" name=\"d1\"/> <br> <br>\n" +
                      "	<input type=\"submit\" name=\"s1\">\n" +
                      "        </form>\n" +
                      "    </body>\n" +
                      "</html>\n"
      );
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
   }
}
