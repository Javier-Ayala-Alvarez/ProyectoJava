
package Modelo;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Usuario{
    private String usuario;
    private String contraseña;
    ArrayList<Persona>persona;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
      
    }
    
    
}
