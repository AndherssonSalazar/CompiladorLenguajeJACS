package compiladorlenguajejacs.clases;

import java.util.Iterator;
import javax.swing.JTextField;

/**
  *
  *
  *@author: Andhersson Salazar
  *@contact: andherson.salazar@gmail.com
  *@date: february/2018
  *
  *
  */
public class ListaEnlazadaDoble <T extends Comparable> implements Iterable<T>{
    private NodoDoble<T> nodoInicial;
    private NodoDoble<T> nodoFinal;
    private int numeroNodos;
    public ListaEnlazadaDoble(){
        nodoInicial=null;
        nodoFinal=null;
        numeroNodos=0;
    }
    public NodoDoble<T> getNodoInicial() {
        return nodoInicial;
    }
    public NodoDoble<T> getNodoFinal() {
        return nodoFinal;
    }
    public int getNumeroNodos(){
        return numeroNodos;
    }
    private void insertarPrimero(NodoDoble<T> nuevoNodo, boolean inicio){
        if(inicio){
            nuevoNodo.setSiguiente(nodoInicial);
            nuevoNodo.setAnterior(null);
            nodoInicial=nuevoNodo;
            if(nodoInicial.getSiguiente()!=null){
                nodoInicial.getSiguiente().setAnterior(nodoInicial);
            }
            if(numeroNodos==0){
                nodoFinal=nodoInicial;
            }
            numeroNodos++;
            return;
        }
        nuevoNodo.setAnterior(nodoFinal);
        nuevoNodo.setSiguiente(null);
        nodoFinal=nuevoNodo;
        if(nodoFinal.getAnterior()!=null){
            nodoFinal.getAnterior().setSiguiente(nodoFinal);
        }
        if(numeroNodos==0){
            nodoInicial=nodoFinal;
        }
        numeroNodos++;
    }
    public void insertarInicio(NodoDoble<T> nuevoNodo){
        insertarPrimero(nuevoNodo, true);
    }
    public void insertarInicio(T dato){
        insertarInicio(new NodoDoble(dato));
    }
    public void insertarFinal(NodoDoble<T> nuevoNodo){
        insertarPrimero(nuevoNodo, false);
    }
    public void insertarFinal(T dato){
        insertarFinal(new NodoDoble(dato));
    }
    public void insertar(NodoDoble<T> nuevoNodo){
        insertarFinal(nuevoNodo);
    }
    public void insertar(T dato){
        insertar(new NodoDoble(dato));
    }
    public boolean insertarPosicion(NodoDoble<T> nuevoNodo, int posicion){
        if(posicion>(numeroNodos+1) || posicion<=0){
            return false;
        }
        NodoDoble<T> aux=nodoInicial;
        if(posicion==1){
            insertarInicio(nuevoNodo);
            return true;
        }else if(posicion==(numeroNodos+1)){
            insertarFinal(nuevoNodo);
        }
        int iterador=1;
        while(aux.getSiguiente()!=null && posicion>(iterador+1)){
            aux=aux.getSiguiente();
            iterador++;
        }
        if((iterador+1)!=posicion) return false;
        nuevoNodo.setSiguiente(aux.getSiguiente());
        nuevoNodo.getSiguiente().setAnterior(nuevoNodo);
        aux.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(aux);
        if(nuevoNodo.getSiguiente()!=null){
            if(nuevoNodo.getSiguiente().getSiguiente()==null){
                nodoFinal=nuevoNodo.getSiguiente();
            }else if(nuevoNodo.getSiguiente()==null){
                nodoFinal=nuevoNodo;
            }
        }
        numeroNodos++;
        return true;       
    }
    public boolean insertarPosicion(T dato, int posicion){
        return insertarPosicion(new NodoDoble(dato), posicion);
    }
    private NodoDoble<T> eliminarPrimero(boolean inicio){
        if(nodoInicial==null){
            return null;
        }
        if(inicio){
            NodoDoble<T> nodoEliminado=nodoInicial;
            nodoInicial=nodoEliminado.getSiguiente();
            if(nodoInicial==null){
                nodoFinal=null;
            }else if(nodoInicial!=null){
                nodoInicial.setAnterior(null);
            }
            numeroNodos--;
            nodoEliminado.setSiguiente(null);
            return nodoEliminado;
        }
        NodoDoble<T> nodoEliminado=nodoFinal;
        nodoFinal=nodoEliminado.getAnterior();
        if(nodoFinal==null){
            nodoInicial=null;
        }else if(nodoFinal!=null){
            nodoFinal.setSiguiente(null);
        }
        numeroNodos--;
        nodoEliminado.setAnterior(null);
        return nodoEliminado;
    }
    public NodoDoble<T> eliminarInicio(){
        return eliminarPrimero(true);
    }
    public NodoDoble<T> eliminarFinal(){
        return eliminarPrimero(false);
    }
    public NodoDoble<T> eliminarPosicion(int posicion){
        if(nodoInicial==null || posicion>numeroNodos || posicion<=0){
            return null;
        }
        if(posicion==1){
            return eliminarInicio();
        }
        if(posicion==numeroNodos){
            return eliminarFinal();
        }
        NodoDoble<T> nodoEliminado;
        NodoDoble<T> nodoAnterior;
        nodoAnterior=nodoEliminado=nodoInicial;
        if(posicion==2){
            nodoEliminado=nodoInicial.getSiguiente();
            nodoInicial.setSiguiente(nodoEliminado.getSiguiente());
            if(nodoInicial.getSiguiente()!=null) nodoInicial.getSiguiente().setAnterior(nodoInicial);
            numeroNodos--;
            nodoEliminado.setSiguiente(null);
            nodoEliminado.setAnterior(null);
            return nodoEliminado;
        }
        if(posicion==(numeroNodos-1)){
            nodoEliminado=nodoFinal.getAnterior();
            nodoFinal.setAnterior(nodoEliminado.getAnterior());
            if(nodoFinal.getAnterior()!=null) nodoFinal.getAnterior().setSiguiente(nodoFinal);
            numeroNodos--;
            nodoEliminado.setSiguiente(null);
            nodoEliminado.setAnterior(null);
            return nodoEliminado;
        }
        int iterador=1;
        while(nodoEliminado.getSiguiente()!=null && posicion>iterador){
            nodoAnterior=nodoEliminado;
            nodoEliminado=nodoEliminado.getSiguiente();
            iterador++;
        }
        if(iterador!=posicion) return null;
        nodoAnterior.setSiguiente(nodoEliminado.getSiguiente());
        if(nodoAnterior.getSiguiente()!=null) nodoAnterior.getSiguiente().setAnterior(nodoAnterior);
        numeroNodos--;
        nodoEliminado.setSiguiente(null);
        return nodoEliminado;
    }
    public NodoDoble<T> eliminarNodo(NodoDoble<T> nodoAEliminar){
        if(nodoInicial==null || nodoAEliminar==null){
            return null;
        }
        if(nodoAEliminar.equals(nodoInicial)){
            return eliminarInicio();
        }
        NodoDoble<T> auxiliar=nodoInicial;
        while(auxiliar.getSiguiente()!=null && !auxiliar.getSiguiente().equals(nodoAEliminar)){
            auxiliar=auxiliar.getSiguiente();
        }
        if(auxiliar.getSiguiente()==null) return null;
        if(!auxiliar.getSiguiente().equals(nodoAEliminar)) return null;
        if(auxiliar.getSiguiente().equals(nodoFinal)){
            return eliminarFinal();
        }
        auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
        auxiliar.getSiguiente().setAnterior(auxiliar);
        nodoAEliminar.setSiguiente(null);
        nodoAEliminar.setAnterior(null);
        numeroNodos--;
        return nodoAEliminar;
    }
    public NodoDoble<T> eliminarNodo(T dato){
        return eliminarNodo(new NodoDoble(dato));
    }
    public NodoDoble<T> eliminar(NodoDoble<T> nodoAEliminar){
        return eliminarNodo(nodoAEliminar);
    }
    public NodoDoble<T> eliminar(T dato){
        return eliminarNodo(new NodoDoble(dato));
    }
    public void mostrar(){
        if(nodoInicial==null){
            System.out.println("Lista Vacía");
            return;
        }
        System.out.println("===========================Inicio Lista Doble====================");
        NodoDoble<T> auxiliar=nodoInicial;
        while(auxiliar!=null){
            System.out.println(auxiliar.getDato());
            auxiliar=auxiliar.getSiguiente();
        }
        System.out.println("===========================Fin Lista Doble====================");
    }
    public void mostrar(JTextField txtContenedor){
        if(nodoInicial==null){
            txtContenedor.setText("Lista Vacía");
            return;
        }
        String contenido="===========================Inicio Lista Doble====================\n";
        NodoDoble<T> auxiliar=nodoInicial;
        while(auxiliar!=null){
            contenido+=auxiliar.getDato()+"\n";
            auxiliar=auxiliar.getSiguiente();
        }
        contenido+="===========================Fin Lista Doble====================\n";
        txtContenedor.setText(contenido);
    }
    public void mostrarInversa(){
        if(nodoFinal==null){
            System.out.println("Lista Vacía");
            return;
        }
        System.out.println("===========================Inicio Lista Doble(Reversa)====================");
        NodoDoble<T> auxiliar=nodoFinal;
        while(auxiliar!=null){
            System.out.println(auxiliar.getDato());
            auxiliar=auxiliar.getAnterior();
        }
        System.out.println("===========================Fin Lista Doble(Reversa)====================");
    }
    public void mostrarInversa(JTextField txtContenedor){
        if(nodoFinal==null){
            txtContenedor.setText("Lista Vacía");
            return;
        }
        String contenido="===========================Inicio Lista Doble(Reversa)====================\n";
        NodoDoble<T> auxiliar=nodoFinal;
        while(auxiliar!=null){
            contenido+=auxiliar.getDato()+"\n";
            auxiliar=auxiliar.getAnterior();
        }
        contenido+="===========================Fin Lista Doble(Reversa)====================\n";
        txtContenedor.setText(contenido);
    }
    private class IteradorLista implements Iterator<T>{
        private NodoDoble<T> auxiliar;
        private int indice;
        private final boolean RECORRIDO_NORMAL;
        public IteradorLista(boolean recorridoNormal) {
            this.RECORRIDO_NORMAL=recorridoNormal;
            if(recorridoNormal){
                auxiliar=nodoInicial;
            }else{
                auxiliar=nodoFinal;
            }
            indice=0;
        }
        @Override
        public boolean hasNext() {
            return auxiliar!=null;
        }
        @Override
        public T next() {
            indice++;
            T dato=auxiliar.getDato();
            if(RECORRIDO_NORMAL){
                auxiliar=auxiliar.getSiguiente();
                return dato;
            }
            auxiliar=auxiliar.getAnterior();
            return dato;
        }
        @Override
        public void remove() {
            if(RECORRIDO_NORMAL){
                eliminarPosicion(indice);
                return;
            }
            eliminarPosicion(numeroNodos-indice);
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new IteradorLista(true);
    }
    public Iterator<T> iteratorInverso() {
        return new IteradorLista(false);
    }
    @Override
    public String toString() {
        if(nodoInicial==null){
            return "";
        }
        NodoDoble<T> auxiliar=nodoInicial;
        String nodos="";
        while(auxiliar!=null){
            nodos+=":::-:::"+auxiliar.getDato();
            auxiliar=auxiliar.getSiguiente();
        }
        return nodos;
    }
}
