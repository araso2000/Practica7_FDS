package adaptador;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args){
        
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Introduce el numero de elementos");

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        for(int i=0; i<numero; i++){
            System.out.println("Introduce el elemento del array");
            int e = scan.nextInt();
            array.add(e);
        }
        
        Adaptador adaptador = new Adaptador();
        adaptador.ordena(array);
        ArrayList<Integer> sd = new ArrayList<>(adaptador.getSeleccionDirecta());
        System.out.println("\n");
        System.out.println("Seleccion Directa \n");
        for(int dd : sd){
            System.out.print(dd + "\n");
        }
        MergeSort merge = new MergeSort();
        merge.ordena(array);
        System.out.println("\n");
        System.out.println("Merge sort \n");
        for(int i=0; i<merge.getMerge().size();i++){
            System.out.print(merge.getMerge().get(i) + "\n");
        }
    }
}