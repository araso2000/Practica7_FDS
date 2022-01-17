package adaptador;

import java.util.ArrayList;

public class Adaptador implements Objetivo{
    
    private int v[];
    private ArrayList <Integer> lista = new ArrayList();
    
    @Override
    public void ordena (ArrayList <Integer> a){
        SeleccionDirecta sd = new SeleccionDirecta();
        v = a.stream().mapToInt(Integer::intValue).toArray();
        sd.ordena(v);
    }
 
    public ArrayList<Integer> getSeleccionDirecta(){
        for(int i=0; i<v.length;i++){
            lista.add(v[i]);
        }
        return lista;
    }
}
