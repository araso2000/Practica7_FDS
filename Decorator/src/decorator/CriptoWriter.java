package decorator;

//Decorador 1

import java.io.IOException;

public class CriptoWriter {
    
    private Writer escribir;
    
    public void escribir(String nombre,String mensaje) throws IOException{
        escribir = new Writer(nombre);
        escribir.write(mensaje);
    }
}
