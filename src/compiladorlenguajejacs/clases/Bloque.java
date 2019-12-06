/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorlenguajejacs.clases;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.LinkedList;

/**
 *
 * @author CHRISTOPER
 */
public class Bloque {
    private LinkedList<String> cadena= new LinkedList<>();
    private Bloque subBloque;
    public Bloque (LinkedList<String> a){
        this.cadena = a;
    }
    public void InsertarSubBloque(LinkedList<String> b){
        subBloque= new Bloque(b);
    }
    
    public Bloque retornarSubBloque(){
        return subBloque;
    }
    

    
    /*
            public Nodo cabeza;
    private class Nodo{
        public LinkedList<Nodo> subloque = new LinkedList<>();
        public String bloque ;
        public Nodo(String informacion){
            subloque.add(new Nodo(informacion));
        }

    }
    
    public void crearBloque(){
        
    }
    */


    
    
}
