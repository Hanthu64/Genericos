package ej1.clases;

import java.util.LinkedList;

public class Pila<T> {
    private LinkedList<T> pila;

    public Pila() {
        this.pila = new LinkedList<>();
    }

    public boolean estaVacia(){
        if(pila.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public T extraer() {
        if(estaVacia()){
            throw new RuntimeException("No se puede extraer: no hay nada.");
        }
        return pila.removeLast();
    }

    public T primero(){
        if (estaVacia()) {
            throw new RuntimeException("No se puede mostrar: no hay nada.");
        }
        return pila.getFirst();
    }

    public void aniadir(T t){
        this.pila.addLast(t);
    }

    @Override
    public String toString() {
        return "Pila{" +
                "pila=" + pila +
                '}';
    }
}
