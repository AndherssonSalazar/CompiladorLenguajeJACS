package compiladorlenguajejacs.clases;


import java.util.LinkedList;

public class AnalizadorSemantico {
	
	ListaEnlazadaDoble<Objeto> lista=new ListaEnlazadaDoble<>();
	
	public AnalizadorSemantico(LinkedList<Objeto> l) {
		// TODO Auto-generated constructor stub
		for(Objeto o:l) {
			
			lista.insertar(o);
		}
		
	}
	
	public void SegundaPasada() {
		NodoDoble<Objeto> temp=lista.getNodoInicial();		
		while(temp!=null){
			if(temp.getDato().familia.equals("reservada")) {
				
				if(temp.getDato().id.matches("entero|real|cadena|caracter|booleano") ){
					
					temp.getDato().tipo=temp.getDato().id;
				}	
			}
			temp=temp.getSiguiente();			
		}
	}
	
	public void terceraPasada() {
		// TODO Auto-generated method stub
		NodoDoble<Objeto> temp=lista.getNodoInicial();	
		while(temp!=null){
		
			if(temp.getDato().familia.equals("identificador")) {
					if(temp.getSiguiente().getDato().id.equals("[")) {
						temp.getDato().familia="arreglo";				
						temp.getDato().tipo=temp.getAnterior().getDato().id;
						if(temp.getSiguiente().getSiguiente().getDato().familia.equals("identificador")) {
							if(temp.getSiguiente().getSiguiente().getDato().tipo.equals("entero")) {
								if(temp.getSiguiente().getSiguiente().getDato().valor.equals("")) {
									System.out.println("Variable no esta inicializada");
								}else {
									temp.getDato().valor=temp.getSiguiente().getSiguiente().getDato().valor;
									temp.getDato().valor+=";";
								}
							}else {
								System.out.println("Variable no es entera en el arreglo");
							}
						}else {
							if(temp.getSiguiente().getSiguiente().getDato().familia.equals("valor")) {
								if(temp.getSiguiente().getSiguiente().getDato().tipo.equals("entero")) {									
									temp.getDato().valor=temp.getSiguiente().getSiguiente().getDato().valor;
									
								}
							}
						}
						if(temp.getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato().familia.equals("asignacion")) {
							NodoDoble<Objeto> temp2=temp.getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente();
							int i=Integer.parseInt(temp.getDato().valor);
							while(!temp2.getDato().id.equals("}")) {
                                                            
								if(i<=0) {
									System.out.println("NULL POINT EXCEPTION");
								}
								if(temp2.getDato().familia.equals("identificador")) {
									if(!temp.getDato().tipo.equals(temp2.getDato().tipo)) {
										System.out.println("El tipo de dato del arreglo no coincide");
									}else {
										temp.getDato().valor+=",";
										temp.getDato().valor+=temp2.getDato().valor;
										i--;
									}
								}else if(temp2.getDato().familia.equals("valor")) {
					
										if(!temp.getDato().tipo.equals(temp2.getDato().tipo)) {
											System.out.println("El tipo de valores no coincide");
										}else {
											temp.getDato().valor+=",";
											temp.getDato().valor+=temp2.getDato().valor;
											i--;
										}
									}else if(!temp2.getDato().id.equals(",")){
                                                                            System.out.println("Ingrese Valores");
                                                                        }
									
								
								temp2=temp2.getSiguiente();
							}
							
						}
					}
			}
			
			if(temp.getDato().id.equals("funcion")) {
				
					temp.getSiguiente().getSiguiente().getDato().familia="funcion";				
					temp.getSiguiente().getSiguiente().getDato().tipo=temp.getSiguiente().getDato().id;
			}
			if(temp.getDato().id.equals("procedimiento")) {
				temp.getSiguiente().getDato().familia="procedimiento";				
				temp.getSiguiente().getDato().tipo="vacio";				
			}
			if(temp.getDato().id.equals("clase")) {
				temp.getSiguiente().getDato().familia="clase";				
				temp.getSiguiente().getDato().tipo=temp.getSiguiente().getDato().id;				
			}
			
			temp=temp.getSiguiente();			
		}
	}
	/*else if (temp.getSiguiente().getDato().familia=="asignacion") {
		while(temp.getSiguiente().getDato().id!=";") {
			//AUN NO
		}
	}*/
	public void cuartaPasada() {
		NodoDoble<Objeto> temp=lista.getNodoInicial();	
		while(temp!=null){
			if(temp.getDato().familia.equals("identificador")) {
				if(temp.getAnterior().getAnterior().getDato().id.equals("objeto")) {
					if(temp.getAnterior().getDato().id.equals("(")) {
						if(!buscarClaseExiste(temp.getDato())) {
							System.out.println("CLase No declarada");
						}else {
						
							System.out.println("CLase Sin errores");
						}
							
					}
				}
				
				if(temp.getSiguiente().getDato().id.equals("(")) {
					
					if(temp.getAnterior().getDato().id.equals(".")) {
						if(!buscarFuncionExiste(temp.getDato())) {
							System.out.println("Funcion No declarada");
						}else {
							System.out.println("Funciones Sin errores");
						}
					}
				}
			}
		temp=temp.getSiguiente();			
		}
	}
	
	
	public boolean buscarFuncionExiste(Objeto e) {
		boolean existe=false;
		NodoDoble<Objeto> temp=lista.getNodoInicial();	
		while(temp!=null){
			if(temp.getDato().familia.equals("funcion")) {
				if(e.id.equals(temp.getDato().id)) {
					return true;
				}
			}
			temp=temp.getSiguiente();
		}
		return existe;
		
	}
	public boolean buscarClaseExiste(Objeto e) {
		boolean existe=false;
		NodoDoble<Objeto> temp=lista.getNodoInicial();	
		while(temp!=null){
			if(temp.getDato().familia.equals("clase")) {
				if(e.id.equals(temp.getDato().id)) {
					return true;
				}
			}
			temp=temp.getSiguiente();
		}
		return existe;
		
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
