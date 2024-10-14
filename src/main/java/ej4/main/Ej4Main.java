package ej4.main;

import ej3.clases.Matriz;

public class Ej4Main {
    public static void main(String[] args){
        Matriz m = new Matriz(4, 2);

        m.set(0, 0, 1);
        m.set(0, 1, 2);
        m.set(1, 0, 3);
        m.set(1, 1, 4);
        m.set(2, 0, 5);
        m.set(2, 1, 6);
        m.set(3, 0, 7);
        m.set(3, 1, 8);

        System.out.println(m);
        Object peticion = m.get(0, 1);
        System.out.println("En la fila 1, columna 2, está el valor: " + peticion);
    }
}
