package TUsuarios;

public abstract class usuarios {
    
     protected String nombre;
     protected String usr;
     protected String psw;
     protected String correo;
     protected String tipo;

    public usuarios(){
         
     }
     
    public usuarios(String nombre, String usr, String psw, String correo) {
        this.nombre = nombre;
        this.usr = usr;
        this.psw = psw;
        this.correo = correo;
    }
     
     
     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     

    public abstract void setTipo();  
    public abstract String getDatos();

}
