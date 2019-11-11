package TUsuarios;

public final class Administrador extends usuarios {
    private String edad;

    public Administrador() {
    }

    public Administrador(String nombre, String usr, String psw, String correo, String edad) {
        setNombre(nombre);
        setUsr(usr);
        setPsw(psw);
        setCorreo(correo);
        setEdad(edad);
        setTipo();
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    
    @Override
     public void setTipo(){
        this.tipo = "Administrador";
    }
    
     @Override
    public String getDatos(){
        String data = "Nombre:"+ nombre + "usuario" + usr + "contrasenia:" + psw + 
                "correo:" + correo + "Edad:" + edad;
        return data;
    }

   
}


      
    

