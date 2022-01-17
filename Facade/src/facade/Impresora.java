package facade;

public class Impresora implements Configura,Presenta,Imprime{
    
    private String tipoHoja;
    private boolean color;
    private boolean borrador;
    private String texto;
    private String blue="\033[34m";
    private boolean orden;
    private boolean grapado;
    
    @Override
    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja=tipoHoja;
    }

    @Override
    public void setColor(boolean color) {
        this.color=color;
    }

    @Override
    public void setBorrador(boolean borrador) {
        this.borrador=borrador;
    }
    
    public boolean getColor(){
        return color;
    }
    
    public boolean getBorrador(){
        return borrador;
    }
    
    public String getTipoHoja(){
        return tipoHoja;
    }
    
    @Override
    public void setTexto(String texto) {
        this.texto=texto;
    }

    @Override
    public void imprimirDocumento() {
        
        String s = getTipoHoja();
        System.out.println("Tipo de hoja: " + s);
        if(getBorrador()==true){
            System.out.println("Borrador");
        }
        if(getGrapa()==true){
            System.out.println("Grapado");
        }
        if(getOrdena()==true){
            System.out.println("Ordenado");
        }
        if(getColor()==true){
            System.out.println("Texto:\n");
            System.out.println(blue + texto);
        }else{
            System.out.println("Texto:\n");
            System.out.println(texto);
        }
    } 
     
    @Override
    public void setOrdena(boolean orden) {
        this.orden=orden;
    }

    @Override
    public void setGrapa(boolean grapado) {
        this.grapado=grapado;
    }
    
    public boolean getGrapa(){
        return grapado;
    }
    
    public boolean getOrdena(){
        return orden;
    }
}
