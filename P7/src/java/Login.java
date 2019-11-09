
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String usuario = request.getParameter("usr");
        String contra = request.getParameter("psw");
        
        if(usuario.equals("111") &&  contra.equals("222")){
        
            HttpSession session= request.getSession();
            session.setAttribute("Usuario", usuario);
            response.sendRedirect("Bienvenido.jsp");
      
        } else {
            
            response.sendRedirect("ups.jsp");
            
            
            
        }
            
           
        }
    }




