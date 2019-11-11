package Controlador;

import TUsuarios.Administrador;
import TUsuarios.Inivitado;
import TUsuarios.Regular;
import TUsuarios.usuarios;
import Factory.Factory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
            Factory factory = Factory.getFactory();
            
            String nombre = request.getParameter("nombre");
            String usuario = request.getParameter("usr");
            String contrasenia = request.getParameter("psw");
            String correo = request.getParameter("correo");
            String tipo = request.getParameter("tipo");
       
            if(tipo.equals("Administrador")){
                String edad = request.getParameter("edad");
                factory.addUser(nombre, usuario, contrasenia, correo, edad);
            }else if (tipo.equals("Regular")){
                 String apellido = request.getParameter("apellido");
                factory.addUser(nombre, usuario, contrasenia, correo, apellido);
            }else {
                 String pais = request.getParameter("pais");;
                factory.addUser(nombre, usuario, contrasenia, correo, pais);
            }
            request.getSession().setAttribute("usr", usuario);
            response.sendRedirect("mostrar.jsp");
        }
        }

    

    