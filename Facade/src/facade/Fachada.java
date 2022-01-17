package facade;

public class Fachada {
    
    private Impresora impresora;
    
    public Fachada(Impresora impresora){
        this.impresora=impresora;
    }
    
    public void imprimeLujo(String texto){
        impresora.setTipoHoja("A4");
        impresora.setColor(true);
        impresora.setBorrador(false);
        impresora.setOrdena(true);
        impresora.setGrapa(true);
        impresora.setTexto(texto);
        impresora.imprimirDocumento();
    }
    
    public void imprimeBorrador(String texto){
        impresora.setTipoHoja("B5");
        impresora.setColor(false);
        impresora.setBorrador(true);
        impresora.setTexto(texto);
        impresora.imprimirDocumento();
    }   
}
