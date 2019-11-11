package Controlador;

import Factory.Factory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      
        Factory factory = Factory.getFactory();
            String user = request.getParameter("usuario");
            String contra = request.getParameter("contra");
            
            if (factory.getUser(user)!=null){
               if (factory.getUser(user).equals(user) && factory.getUser(user).equals(contra)){
                    request.getSession().setAttribute("user", contra);
                    response.sendRedirect("Mostrar.jsp");
                }else {
                    response.sendRedirect("Error.jsp");
                }
            }else 
                response.sendRedirect("registro.html");
        
        
        }
    }


