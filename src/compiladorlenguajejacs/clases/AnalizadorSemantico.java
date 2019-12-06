package compiladorlenguajejacs.clases;

import java.util.LinkedList;

public class AnalizadorSemantico {
	
	ListaEnlazadaDoble<Objeto> lista=new ListaEnlazadaDoble<>();
	
	public AnalizadorSemantico(LinkedList<Objeto> l) {
		// TODO Auto-generated constructor stub
		if(l.isEmpty()) {
			System.out.println("LISTA VACIA DEL SEMANTICO");
		}
		for(Objeto o:l) {
			lista.insertarInicio(o);
		}
	}
	public void probando() {
		// TODO Auto-generated method stub
		lista.mostrar();
	}
	
	
}
