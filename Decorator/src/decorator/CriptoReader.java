package decorator;

import java.io.IOException;

public class CriptoReader {
    
    private Reader lector;
    
    public String leer(String nombre) throws IOException{
        lector = new Reader(nombre);
        return(lector.read());
    }
}
