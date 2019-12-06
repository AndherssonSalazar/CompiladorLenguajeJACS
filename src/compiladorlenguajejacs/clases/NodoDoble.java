package compiladorlenguajejacs.clases;

import java.util.Objects;

/**
  *
  *
  *@author: Andhersson Salazar
  *@contact: andherson.salazar@gmail.com
  *@date: february/2018
  *
  *
  */
public class NodoDoble<T extends Comparable> implements Comparable<T>{
    private T dato;
    private NodoDoble anterior;
    private NodoDoble siguiente;
    public NodoDoble(){
        dato=null;
        anterior=null;
        siguiente=null;
    }
    public NodoDoble(T dato){
        this.dato=dato;
        anterior=null;
        siguiente=null;
    }
    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }
    public NodoDoble<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
    @Override
    public String toString() {
        return dato.toString();
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.dato);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NodoDoble<?> other = (NodoDoble<?>) obj;
        if (!Objects.equals(this.dato, other.dato)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(T t) {
        return dato.compareTo(t);
    }
    public int compareTo(NodoDoble<T> t) {
        return compareTo(t.getDato());
    }
}
