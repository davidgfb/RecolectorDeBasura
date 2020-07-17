package serializable;

//import modelo.MiObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Usuario;

public class EscribirYLeer {
    public void escribeFichero(String fichero, Usuario u) { //le pasamos el objeto usuario creado
        try {
            FileOutputStream f = new FileOutputStream(fichero);
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(u);
        } catch (IOException e) {
            System.out.println(e + "no se pudo escribir fichero");
        }
    }
    
    public void anhadeFichero (String fichero, Usuario u) {
        try {
            boolean append = true; //no sobreescribe
            FileOutputStream f = new FileOutputStream(fichero, append);
            MiObjectOutputStream oos = new MiObjectOutputStream(f);
            oos.writeUnshared(u);
        } catch (IOException e) {
            System.out.println(e + "no se pudo añadir fichero");
        }
    }
    
    public ArrayList leeFichero(String fichero) {
        ArrayList objetos = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(fichero);
            ObjectInputStream ois = new ObjectInputStream(f);
            Object aux = ois.readObject();
            while (aux!=null) {
                if (aux instanceof Usuario) {
                    objetos.add(aux);
                }
                aux = ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            //System.out.println(e + "Fin de fichero, excepcion de entrada salida o clase no encontrada");
        }
        return objetos;
    }
    
    /*
    public static void main(String[] args) {
        String ruta = "d:/recolectorBasura/Usuarios.dat";
        EscribirYLeer eyl = new EscribirYLeer();
        eyl.escribeFichero(ruta); //guarda final se usa solo si no existe el archivo
        eyl.anhadeFichero(ruta); //se usa para guardar sin sobreescritura todo lo demas
        eyl.leeFichero(ruta); //carga ppio
    }
    */
}
