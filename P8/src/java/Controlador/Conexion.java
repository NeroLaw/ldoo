package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
 
public class Conexion {
 
    Connection conexion = null;
    Statement comando = null;
    ResultSet registro;
 
    public Connection getConexion() {
 
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            String servidor = "jdbc:mysql://localhost:3306/registros";
            String usuario = "root";
            String contra = "";
           
            conexion = DriverManager.getConnection(servidor, usuario, contra);
 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de dato! " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de dato! " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos! " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } finally {
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
            return conexion;
        }
    }
    
    public static void main(String[]args){
        
    }
}