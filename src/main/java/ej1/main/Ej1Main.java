package ej1.main;

import ej1.clases.Pila;

public class Ej1Main<T> {
    public static void main(String[] args){
        int[] numPruebas = {1, 2, 3, 4, 5};
        Pila p = new Pila();

        //estaVacia
        p.estaVacia();

        //Aniadir
        for(int i = 0; i < numPruebas.length; i++){
            p.aniadir(numPruebas[i]);
        }

        System.out.println(p);
        p.estaVacia();

        String x = "Patatas";
        p.aniadir(x);
        System.out.println(p);

        //Extraer
        Object papa = p.extraer();
        System.out.println("Hemos extraído: " + papa);
        System.out.println(p);

        //Primero
        Object primero = p.primero();
        System.out.println("El primer objeto actual de la lista es: " + primero);
        System.out.println(p);
    }
}
