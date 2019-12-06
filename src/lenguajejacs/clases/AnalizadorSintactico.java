/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajejacs.clases;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author CHRISTOPER
 */
enum Modo{
	ERROR, CORRECTO
}

public class AnalizadorSintactico {

private Stack<String> pila;
    LinkedList<String> produccion;
    public AnalizadorSintactico(){
        inicializar();
    }
    private void inicializar(){
        pila=new Stack<>();
        pila.push("$");
        pila.push("PROGRAMA");
        
    }
    
    public void Analizar(LinkedList<String> listaInput){
        inicializar();
        tablaTAS miTabla=new tablaTAS();
        String token="", elementoPila="";
        listaInput.add("$");
        do{	
            token=listaInput.peekFirst();
            elementoPila=pila.peek();
            try {
            	 if(miTabla.Terminal(elementoPila)){
                     if(elementoPila.equals(token)){
                    	 System.out.printf("%1$-100S|%2$-100s|%3$-100S\n",pila.toString(),listaInput.toString(),"Empareja " + token);
                      	listaInput.pollFirst();
                      	pila.pop();                     
                     }else {
                    	 System.out.printf("%1$-100S|%2$-100s|%3$-100S\n",pila.toString(),listaInput.toString(),"ERROR con " + token);
                    	 finalizarPrograma("Terminales Distintos",Modo.ERROR);
                     }
                 }else if((produccion=miTabla.ExisteInterseccion(elementoPila, token))!=null){
                     	System.out.printf("%1$-100S|%2$-100s|%3$-100S\n",pila.toString(),listaInput.toString(),produccion.toString());
                 		pila.pop();
                 		if(!produccion.getFirst().equals("&")) {
                 			while(!produccion.isEmpty()) {
                 				pila.push(produccion.pollLast());
                 			}
                     	for(int i=produccion.size()-1;i>=0;i--){
                             pila.push(produccion.get(i));
                         }   
                 		}		        
                 }else{
                	 finalizarPrograma("No existe intersecci�n de "+elementoPila+" y "+token+" en la tabla de simbolos",Modo.ERROR);
                 }
            }catch (Exception e) {
				// TODO: handle exception
           	 finalizarPrograma("No existe intersecci�n de "+elementoPila+" y "+token+" en la tabla de simbolos",Modo.ERROR);
			}
        }while(!token.equals("$"));
        finalizarPrograma("Analisis correcto",Modo.CORRECTO);
        
    }
    void finalizarPrograma(String mensaje,Modo modo) {
    	if(modo==Modo.CORRECTO) {
    		System.out.printf("%1$-100S|%2$-100S|%3$-100S\n","[$]","[$]",mensaje);
    	}else {
    		System.out.printf("%1$-100S|%2$-100S|%3$-100S\n",mensaje,mensaje,mensaje);
                System.exit(0);
    	}
    	
    }
}
