package TUsuarios;

public class Inivitado extends usuarios {
    private String pais;

    public Inivitado() {
    }

    public Inivitado(String nombre, String usr, String psw, String correo, String pais) {
        setNombre(nombre);
        setUsr(usr);
        setPsw(psw);
        setCorreo(correo);
        setPais(pais);
        setTipo();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

     @Override
     public void setTipo(){
        this.tipo = "Invitado";
    }
    
     @Override
    public String getDatos(){
        String data = "Nombre:"+ nombre + "usuario" + usr + "contrasenia:" + psw + 
                "correo:" + correo + "Pais:" + pais;
        return data;
    }
    
   
    }
    
    
    
     

