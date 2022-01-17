package adaptador;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort implements Objetivo{

    private ArrayList <Integer> a1;
 
    @Override
    public void ordena (ArrayList <Integer> a){
        Collections.sort(a);
        a1 = new ArrayList<>(a);
    }
    
    public ArrayList getMerge(){
        return a1;
    }
}