package ej3.clases;

import java.util.Arrays;

public class Matriz<T> {
    private T[][] matriz;
    public Matriz(int x, int y) {
        this.matriz = (T[][]) new Object[x][y];
    }

    public void set(int x, int y, T t){
        matriz[x][y] = t;
    }
    public T get(int x, int y){
        return matriz[x][y];
    }
    public int columnas(){
        return matriz.length;
    }
    public int filas(){
        return matriz[0].length;
    }

    @Override
    public String toString() {
        String s = "Matriz:\n";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                s += matriz[i][j] + ", ";
            }
            s += "\n";
        }
        return s;
    }
}
