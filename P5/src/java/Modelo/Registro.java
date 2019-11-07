
package Modelo;


public class Registro {
    
    private String usuario;
    private String contra;
    private String correo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

    public Registro(String usuario, String contra, String correo) {
        this.usuario = usuario;
        this.contra = contra;
        this.correo = correo;
    }
    
    
    
    
}
