package serializable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {
    public MiObjectOutputStream(OutputStream out) throws IOException { //excepcion obligatoria 
        super(out);
    }

    protected MiObjectOutputStream() throws IOException, SecurityException { //excepciones obligatorias

    }

    @Override
    protected void writeStreamHeader() {
        
    }
    
    /*
    public static void main(String[] args) {
        try {
            MiObjectOutputStream m = new MiObjectOutputStream();
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(MiObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
}
