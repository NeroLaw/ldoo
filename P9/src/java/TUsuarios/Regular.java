package TUsuarios;

public class Regular extends usuarios {
    private String apellido;

    public Regular() {
    }

    public Regular(String nombre, String usr, String psw, String correo, String apellido) {
        setNombre(nombre);
        setUsr(usr);
        setPsw(psw);
        setCorreo(correo);
        setApellido(apellido);
        setTipo();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
     public void setTipo(){
        this.tipo = "Regular";
    }
    
     @Override
    public String getDatos(){
        String data = "Nombre:"+ nombre + "usuario" + usr + "contrasenia:" + psw + 
                "correo:" + correo + "Apellido:" + apellido;
        return data;
    }

    
     
}
