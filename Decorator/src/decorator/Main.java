package decorator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        CriptoWriter es = new CriptoWriter();
        CriptoReader rd = new CriptoReader();
        
        System.out.println("Criptografía de mensajes:");
        int opt=-1;
        
        while(opt!=0){
            System.out.println("1.Crear fichero - 2.Leer fichero - 0.SALIR");
            opt=scan.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Nombre del fichero: ");
                    String nulo = scan.nextLine();
                    
                    String escribir = scan.nextLine();
                    
                    System.out.println("Mensaje a escribir: ");
                    String mensaje=scan.nextLine();
                    
                    es.escribir(escribir,mensaje);
                    
                    System.out.println("Fichero encriptado creado correctamente");
                    break;
                case 2:
                    System.out.println("Nombre del fichero: ");
                    String nula = scan.nextLine();
                    String leer=scan.nextLine();
                                       
                    System.out.println("Mensaje desencriptado: \n" + rd.leer(leer) + "\n");
                    
                    break;
            }
        }
    }
}
