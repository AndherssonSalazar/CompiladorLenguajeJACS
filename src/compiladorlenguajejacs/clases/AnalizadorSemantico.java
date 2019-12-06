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
	
	public void SegundaPasada() {
		NodoDoble<Objeto> temp=lista.getNodoInicial();		
		for(int i=0;i<lista.getNumeroNodos();i++) {
			if((temp=lista.getNodo(i)).getDato().familia.equals("reservada")) {
				if(temp.getDato().id.matches("entero|real|cadena|caracter|booleano") ){
					System.out.println("matches");
					temp.getDato().tipo=temp.getDato().id;
				}
			}
		}
	}
	
	public void terceraPasada() {
		// TODO Auto-generated method stub
		NodoDoble<Objeto> temp=lista.getNodoInicial();	
		if(temp.getDato().familia=="identificador") {
			if(temp.getSiguiente().getDato().id=="(") {
				if(temp.getAnterior().getDato().id.matches("entero|real|cadena|caracter|booleano")) {
					System.out.println("funcion");
					temp.getDato().familia="funcion";
				}else if (temp.getAnterior().getDato().id=="procedimiento") {
					temp.getDato().familia="procedimiento";
					System.out.println("procedimiento");
				}
			}
		}
	}
	/*else if (temp.getSiguiente().getDato().familia=="asignacion") {
		while(temp.getSiguiente().getDato().id!=";") {
			//AUN NO
		}
	}*/
	public void cuartaPasada() {
		NodoDoble<Objeto> temp=lista.getNodoInicial();	
		if(temp.getDato().familia=="identificador") {
			if(temp.getSiguiente().getDato().id=="(") {
				if((temp.getAnterior().getDato().id.equals("."))) {
					if(!buscarFuncionExiste(temp.getDato())) {
						System.out.println("Funcion No declarada");
					}else {
						System.out.println("Funciones Sin errores");
					}
				}
			}
		}
	}
	
	
	public boolean buscarFuncionExiste(Objeto e) {
		boolean existe=false;
		NodoDoble<Objeto> temp=lista.getNodoInicial();	
		for(int i=0;i<lista.getNumeroNodos();i++) {
			if((temp=lista.getNodo(i)).getDato().familia.equals("funcion")) {
				if(e.id==temp.getDato().id) {
					return true;
				}
			}
		}
		return existe;
		
	}
	public void Analizar() {
		
		/*NodoDoble<Objeto> temp=lista.getNodoInicial();
		for(int i=0;i<lista.getNumeroNodos();i++) {
			if((temp=lista.getNodo(i)).getDato().familia.equals("identificador")) {
				if(!siExiste(temp.getDato())) {
					if(temp.getAnterior().getDato().familia=="reservada"){
						if()
					}
				}
			}
		}*/
		
	}
	/*boolean siExiste(Objeto o) {
		boolean existe=false;
		for(Objeto e:lista) {
			if(e.familia.equals("reservada")) {
				
			}
		}
		return existe;
	}*/
	
	
}
