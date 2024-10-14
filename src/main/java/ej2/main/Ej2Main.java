package ej2.main;

import ej2.clases.PilaArray;

public class Ej2Main {
    public static void main(String[] args){
        Object[] ejemplo = {"a", "b", "c", "d", "e"};
        PilaArray p = new PilaArray(0);

        //Aniadir
        for(int i = 0; i < ejemplo.length; i++){
            p.aniadir(ejemplo[i]);
        }
        System.out.println(p);

        int num = 3;
        p.aniadir(num);
        System.out.println(p);

        //Extraer
        Object extraido = p.extraer();
        System.out.println("Se ha extraído: " + extraido);
        System.out.println(p);

        //Primero
        Object primero = p.primero();
        System.out.println("El primer objeto es: " + primero);
    }
}
