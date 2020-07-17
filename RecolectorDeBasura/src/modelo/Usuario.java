package modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
    String usuario = "",
           contraseña = usuario;

    public Usuario(String usuario, String contraseña) {
        setUsuario(usuario);
        setContraseña(contraseña);
    }
    
    private void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    private void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    /*
    public static void main(String[] args) {
        String usuario="usuario",
           contraseña="contraseña";
        Usuario u = new Usuario(usuario,contraseña);
        System.out.println(u.toString());
    }
    */
    
    @Override
    public String toString() {
        return "Usuario{usuario: "+getUsuario()+", contraseña: "+getContraseña()+'}';
    }
}
