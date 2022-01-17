package facade;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        
        Impresora impresora = new Impresora();
        
        Fachada fachada;
        fachada = new Fachada(impresora);
        Scanner Scan = new Scanner(System.in);
        System.out.println("Escribe el texto que quieras");
        String texto = Scan.nextLine();
        System.out.println("\n");
        System.out.println("Imprime Lujo\n");
        fachada.imprimeLujo(texto);
        System.out.println("\n");
        System.out.println("Imprime Borrador \n");
        fachada.imprimeBorrador(texto);
        System.out.println("\n");
        System.out.println("Imprime Texto cualquiera \n");
        impresora.setGrapa(true);
        impresora.setTipoHoja("A3");
        impresora.setTexto(texto);
        impresora.imprimirDocumento();
    }  
}