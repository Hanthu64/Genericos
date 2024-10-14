package ej5.clases;

public interface ColeccionSimpleGenerica<T> {
    boolean estaVacia();
    T extraer();
    T primero();
    void añadir();
}
