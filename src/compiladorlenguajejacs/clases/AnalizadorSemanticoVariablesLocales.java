/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorlenguajejacs.clases;

import java.util.LinkedList;

/**
 *
 * @author CHRISTOPER
 */
public class AnalizadorSemanticoVariablesLocales {
    AnalizadorSemanticoVariablesLocales semantico = new AnalizadorSemanticoVariablesLocales();
    LinkedList<Objeto> cadena = new LinkedList<>();
    LinkedList<String> temp = new LinkedList<>();
    Bloque inicio ;
    public AnalizadorSemanticoVariablesLocales(){
                if(cadena.getFirst().id.equals("{")){
                    cadena.pop();
                    while(cadena.getFirst().id.equals("}")){
                        temp.add(cadena.pop().id);
                    }
                    inicio = new Bloque(temp);
        }
    }
}
