package ej2.clases;

import java.util.Arrays;

public class PilaArray<T> {
    private T[] PilaArray;
    int numeroObjetos;

    public PilaArray(int numeroObjetos) {
        this.PilaArray = (T[]) new Object[numeroObjetos];
    }

    public void ensanchar(){
        numeroObjetos++;
        PilaArray = Arrays.copyOf(PilaArray, numeroObjetos);
    }
    public boolean estaVacia(){
        if((PilaArray == null) || (PilaArray.length <= 0)){
            return true;
        }else{
            return false;
        }
    }

    public T extraer(){
        if(estaVacia()){
            throw new RuntimeException("No se puede mostrar: no hay nada.");
        }
        T t = PilaArray[numeroObjetos-1];
        T[] aux = (T[]) new Object[numeroObjetos-1];
        for(int i = 0; i < aux.length; i++){
            aux[i] = PilaArray[i];
        }
        PilaArray = aux;
        numeroObjetos--;
        return t;
    }
    public T primero(){
        if(estaVacia()){
            throw new RuntimeException("No se puede mostrar: no hay nada.");
        }
        return PilaArray[0];
    }

    public void aniadir(T t){
        ensanchar();
        PilaArray[numeroObjetos-1] = t;
    }


    @Override
    public String toString() {
        return "PilaArray{" +
                "PilaArray=" + Arrays.toString(PilaArray) +
                '}';
    }
}
