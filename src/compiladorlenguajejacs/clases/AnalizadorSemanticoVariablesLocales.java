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
        int op = 0;
        switch(op){
            case 0:
                if(cadena.getFirst().id.equals("{")){
                    cadena.pop();
                    op=1;
                }else{
                    cadena.pop();
                    op=0;
                }
                break;
            case 1:
                if(!cadena.getFirst().id.equals("{")){
                    temp.add(cadena.pop().id);
                    op=1;
                }else{
                    inicio = new Bloque(temp);
                    temp.removeAll(temp);
                    op=2;
                }
                break;
            case 2:
                if(!cadena.getFirst().id.equals("{")){
                    temp.add(cadena.pop().id);
                    op=2;
                }else{
                    inicio.InsertarSubBloque(temp);
                    temp.removeAll(temp);
                    op=3;
                }
                break;
            case 3:
                if(!cadena.getFirst().id.equals("{")){
                    temp.add(cadena.pop().id);
                    op=3;
                }else{
                    inicio.retornarSubBloque().InsertarSubBloque(temp);
                    temp.removeAll(temp);
                    op=4;
                }
                break;
        }

    }
}
