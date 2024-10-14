package ej7.test;

import org.junit.jupiter.api.Test;
import ej7.interfaces.Operable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ej7Test {
    @Test
    public void pruebaSuma(){
        Operable calc = new anon() {
            @Override
            public Number sumar(Number a, Number b) {
                return super.sumar(a, b);
            }
        };
        int resultado = (int) calc.sumar(2, 3);
        assertEquals(resultado, 5);
    }

    @Test
    public void pruebaResta(){
        Operable calc = new anon() {
            @Override
            public Number restar(Number a, Number b) {
                return super.restar(a, b);
            }
        };
        double resultado = (double) calc.restar(3.10, 2.10);
        assertEquals(resultado, 1);
    }

    @Test
    public void pruebaMulti(){
        Operable calc = new anon() {
            @Override
            public Number multiplicar(Number a, Number b) {
                return super.multiplicar(a, b);
            }
        };
        int resultado = (int) calc.multiplicar(3, 2);
        assertEquals(resultado, 6);
    }

    @Test
    public void pruebaDividir(){
        Operable calc = new anon() {
            @Override
            public Number dividir(Number a, Number b) {
                return super.dividir(a, b);
            }
        };
        int resultado = (int) calc.dividir(6, 2);
        assertEquals(resultado, 3);
    }

    @Test
    public void pruebaError(){
        Operable calc = new anon() {
            @Override
            public Number sumar(Number a, Number b) {
                return super.sumar(a, b);
            }
        };
        assertThrows(IllegalArgumentException.class, () -> {
            Long resultado = (Long) calc.sumar(10L, 20L);
        });
    }
}

abstract class anon<E extends Number> implements Operable<E>{

    @Override
    public E sumar(E a, E b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (E) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (E) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (E) Float.valueOf(a.floatValue() + b.floatValue());
        }
        throw new IllegalArgumentException("Tipo no compatible");
    }

    @Override
    public E restar(E a, E b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (E) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (E) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (E) Float.valueOf(a.floatValue() - b.floatValue());
        }
        throw new IllegalArgumentException("Tipo no compatible");
    }

    @Override
    public E multiplicar(E a, E b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (E) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (E) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (E) Float.valueOf(a.floatValue() * b.floatValue());
        }
        throw new IllegalArgumentException("Tipo no compatible");
    }

    @Override
    public E dividir(E a, E b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (E) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double && b instanceof Double) {
            return (E) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float && b instanceof Float) {
            return (E) Float.valueOf(a.floatValue() / b.floatValue());
        }
        throw new IllegalArgumentException("Tipo no compatible");
    }
}
