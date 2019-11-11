package Factory;


import TUsuarios.Administrador;
import TUsuarios.Inivitado;
import TUsuarios.Regular;
import TUsuarios.usuarios;
import javax.xml.registry.infomodel.User.*;
import java.util.HashMap;
import javax.xml.registry.infomodel.User;

public class Factory {
    private static Factory factory;
    private HashMap<String, User> hashmap = new HashMap();;
    
    /**
     *
     * @param nombre
     * @param usr
     * @param psw
     * @param correo
     * @param edad
     * @param pais
     * @param apellido
     * @param tipo
     * @return User
     */
    
    public static usuarios getUserClass(String tipo, String nombre, String usr, String psw, String correo, String edad, String pais, String apellido){
        if (tipo.equals("Administrador")) {
            return new Administrador(nombre, usr, psw, correo, edad);
        }else if (tipo.equals("Regular")){    
            return new Regular(nombre, usr, psw, correo, apellido);
        }else {
            return new Inivitado(nombre, usr, psw, correo, pais);
        }
    }
    
    
    public static Factory getFactory(){
        if (factory==null){
            factory = new Factory();
        } 
        return factory;
    }
    
    private Factory(){
    } 
    /**
     *
     * @param tipo
     * @param nombre
     * @param usr
     * @param psw
     * @param correo
     * @param edad
     * @param pais
     * @param apellido
     */
    public void addUser(String tipo, String nombre, String usr, String psw, String correo, String edad, String pais, String apellido){
        if (hashmap.get(usr)==null){
            hashmap.put(usr, (User) getUserClass(tipo, nombre, usr, psw, correo, edad, pais, apellido));
        }
    }
    
    public User getUser(String user){
        return hashmap.get(user);
    }

    //---------------------
    public void addUser(String nombre, String usuario, String contrasenia, String correo, String edad) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    //-------------------

   
  

  
    
}


 

