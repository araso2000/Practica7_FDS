package decorator;

//Decorado 1

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer{
    
    private FileWriter fichero;
    private PrintWriter print;
    
    
    public Writer(String s) throws IOException{
        s=s + ".txt";
        fichero = new FileWriter(s);
        print = new PrintWriter(fichero);
    }

    public void writeChar(char c) throws IOException {
        try{
            int car = c;
            car=car+2;
            print.print((char)car);
        }catch(Exception e){
            System.out.println("Error");
        }
    }

    public void write(String s) throws IOException {
        for(int ii=0;ii<s.length();ii++){
            this.writeChar(s.charAt(ii));
        }
        fichero.close();
    }
}
