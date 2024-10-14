package ej3.main;

import ej3.clases.Matriz;

public class Ej3Main {
    public static void main(String[] args){
        Matriz m = new Matriz(3, 3);

        //Set
        m.set(0, 0, 1);
        m.set(0, 1, 2);
        m.set(0, 2, 3);
        m.set(1, 0, 1);
        m.set(1, 1, 2);
        m.set(1, 2, 3);
        m.set(2, 0, 1);
        m.set(2, 1, 2);
        m.set(2, 2, 3);
        System.out.println(m);

        //Get
        Object objRecibido = m.get(1,2);
        System.out.println("Dadas las cordenadas 1,2 de la matriz, el valor de esa posición es:");
        System.out.println(objRecibido);

        //Columnas
        int columnas = m.columnas();

        //Filas
        int filas = m.filas();

        System.out.println("Hay " + columnas + " columnas y " + filas + " filas.");
    }
}
