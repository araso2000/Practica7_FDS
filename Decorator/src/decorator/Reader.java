package decorator;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Reader{
    
    private String nombreArchivo;
    private boolean error=false;
    
    public Reader(String s){
        this.nombreArchivo=s + ".txt";
    }

    public String read() throws IOException {
        String s = " ";
        try{
            FileReader file = new FileReader(this.nombreArchivo);
            BufferedReader bufer = new BufferedReader(file);  
        
            int c = 0;
            
            while(c != -1){
                if(c!=-1){
                    c = bufer.read();
                    s=s+((char)(c-2));
                }
            }
        }catch(Exception e){
            System.out.println("Error - No existe el fichero o está corrupto");
            this.error=true;
        }
        return(s.substring(0,s.length()-1));
    }
}
