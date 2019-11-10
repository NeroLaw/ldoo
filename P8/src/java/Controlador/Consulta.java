package Controlador;
    
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consulta extends Conexion{
    
    public boolean autenticacion (String usuario, String contrasenia){
       
       PreparedStatement pst = null; 
       ResultSet rs = null;
       
       try{
           
           String consulta = "select * from usuarios where usuario = ? and contrasenia = ?";
           pst = getConexion().prepareStatement(consulta);
           pst.setString(1, usuario);
           pst.setString(2, contrasenia);
           rs = pst.executeQuery();
           
           if(rs.absolute(1)){
               
               return true;
           }
           
       } catch(Exception e){
           
           System.err.println("Error" + e);
           
           
       } finally{
           
          try{
            
               if(getConexion() != null) getConexion().close();
               if(pst != null) pst.close();
               if(rs != null) rs.close();
               
          } catch(Exception e){
              
               System.err.println("Error" + e);
          }
           
       }
           
       
       return false;
    }
    
    public boolean registro(String usuario, String contrasenia, String correo){
        
       PreparedStatement pst = null;
       
       try{
           String consulta="insert into usuarios(usuario, contra, correo) values (?,?,?)";
              pst = getConexion().prepareStatement(consulta);   
              pst.setString(1, usuario);
              pst.setString(2, contrasenia);
              pst.setString(3, correo);
              
              if(pst.executeUpdate()==1){
                  return true;
              }
              
       }catch(Exception e){
           System.err.println("Error" + e);
       }finally{
           try{
               
               if(getConexion() !=null)getConexion().close();
               if(pst != null) pst.close();
               
           }catch(Exception e){
             System.err.println("Error" + e);

           }
               
           
           
       }
       
       
       return false;
    }
    
    public static void main(String[]args){
        
    }
    
        
    }




    
    
    
    
    
   

