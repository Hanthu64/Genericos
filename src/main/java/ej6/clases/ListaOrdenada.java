package ej6.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {
    private List<E> listaOrdenada;

    public ListaOrdenada() {
        this.listaOrdenada = new ArrayList<>();
    }

    public void add(E o){
        this.listaOrdenada.add(o);
        Collections.sort(this.listaOrdenada);
    }
    public E get(int index){
        return this.listaOrdenada.get(index);
    }
    public int size(){
        return this.listaOrdenada.size();
    }
    public boolean isEmpty(){
        if(listaOrdenada.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public boolean remove(E o){
        boolean borrado = false;
        if(listaOrdenada.contains(o)){
            this.listaOrdenada.remove(o);
            borrado = true;
        }
        return borrado;
    }
    public int indexOf(E o){
        return listaOrdenada.indexOf(o);
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "listaOrdenada=" + listaOrdenada +
                '}';
    }
}
