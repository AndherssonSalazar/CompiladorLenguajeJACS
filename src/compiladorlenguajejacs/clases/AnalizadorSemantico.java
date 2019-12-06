package compiladorlenguajejacs.clases;

import java.util.LinkedList;

public class AnalizadorSemantico {
	
	ListaEnlazadaDoble<Objeto> lista=new ListaEnlazadaDoble<>();
	
	public AnalizadorSemantico(LinkedList<Objeto> l) {
		// TODO Auto-generated constructor stub
		for(Objeto o:l) {
			System.out.println(o);
			lista.insertar(o);
		}
	}
	public void probando() {
		// TODO Auto-generated method stub
		lista=new ListaEnlazadaDoble<Objeto>();
		lista.insertar(new Objeto("", "", "", ""));
		System.out.println(lista.getNumeroNodos());
			
	}
	public void SegundaPasada() {
		NodoDoble<Objeto> temp=lista.getNodoInicial();		
		for(int i=0;i<lista.getNumeroNodos();i++) {
			if((temp=lista.getNodo(i)).getDato().familia.equals("reservada")) {
				if(temp.getDato().id.matches("entero|real|cadena|caracter|booleano")) {
					temp.getDato().tipo=temp.getDato().id;
				}
			}
			if(temp.getDato().familia=="identificador") {
				if(temp.getSiguiente().getDato().id=="(") {
					if(temp.getAnterior().getDato().id.matches("entero|real|cadena|caracter|booleano")) {
						temp.getDato().familia="funcion";
					}else if (temp.getAnterior().getDato().id.matches("procedimiento")) {
						temp.getDato().familia="procedimiento";
					}
				}
			}
			if(temp.getDato().familia=="identificador") {
				if(temp.getSiguiente().getDato().id=="(") {
					if(temp.getAnterior().getDato().id.matches("entero|real|cadena|caracter|booleano")) {
						temp.getDato().familia="funcion";
					}else if (temp.getAnterior().getDato().id.matches("procedimiento")) {
						temp.getDato().familia="procedimiento";
						}
					}else if (temp.getAnterior().getDato().id.matches("procedimiento")) {
						temp.getDato().familia="llamada";
					}
			}		
		}
	}
	
	public void Analizar() {
		
		NodoDoble<Objeto> temp=lista.getNodoInicial();
		for(int i=0;i<lista.getNumeroNodos();i++) {
			if((temp=lista.getNodo(i)).getDato().familia.equals("identificador")) {
				if(!siExiste(temp.getDato())) {
					if(temp.getAnterior().getDato().familia=="reservada"){
						if()
					}
				}
			}
		}
		
	}
	boolean siExiste(Objeto o) {
		boolean existe=false;
		for(Objeto e:lista) {
			if(e.familia.equals("reservada")) {
				
			}
		}
		return existe;
	}
	
	
}
