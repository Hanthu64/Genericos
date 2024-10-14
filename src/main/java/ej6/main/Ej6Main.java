package ej6.main;

import ej6.clases.ListaOrdenada;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej6Main {
    public static void main(String[] args){
        ListaOrdenada ej = new ListaOrdenada();

        //Add
        int[] aditivos = {1, 2, 4, 5, 6};
        for(int i = 0; i < aditivos.length; i++){
            ej.add(aditivos[i]);
        }
        System.out.println(ej);
        ej.add(3);
        System.out.println(ej);

        //Get
        int val1 = 4;
        Object posicion = ej.get(val1);
        System.out.println("El valor: " + val1 + " se encuentra en la posición " + posicion + ".");

        //Size
        System.out.println("La lista tiene un tamaño de " + ej.size() + " elementos.");

        //Remove
        int val2 = 2;
        boolean bool1 = ej.remove(val2);
        if(bool1){
            System.out.println("El valor " + val2 + " se ha borrado correctamente de la lista.");
        }else{
            System.out.println("Ha ocurrido un error: no existe ese valor en la lista.");
        }
        val2 = 10;
        boolean bool2 = ej.remove(val2);
        if(bool2){
            System.out.println("El valor " + val2 + " se ha borrado correctamente de la lista.");
        }else{
            System.out.println("Ha ocurrido un error: no existe ese valor en la lista.");
        }
        System.out.println(ej);

        //IndexOf
        int val3 = 3;
        int indexof = ej.indexOf(val3);
        System.out.println("El valor " + val3 + " se ubica en la posición " + indexof + ".");



    }
}
