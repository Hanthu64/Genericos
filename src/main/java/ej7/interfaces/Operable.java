package ej7.interfaces;

public interface Operable<E extends Number> {
    E sumar(E a, E b);
    E restar(E a, E b);
    E multiplicar(E a, E b);
    E dividir(E a, E b);
}
