package es.uah.matcomp.estructuras.pl1.PilasYColas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PilaTest {

    @Test
    void push() {
        Pila<Integer> pila = new Pila<>();
        pila.push(10);
        pila.push(20);

        assertFalse(pila.isEmpty());
        assertEquals(20, pila.pop());
    }

    @Test
    void pop() {
        Pila<String> pila = new Pila<>();
        pila.push("A");
        pila.push("B");

        assertEquals("B", pila.pop());
        assertEquals("A", pila.pop());
        assertNull(pila.pop());
    }

    @Test
    void isEmpty() {
        Pila<Double> pila = new Pila<>();
        assertTrue(pila.isEmpty());

        pila.push(3.14);
        assertFalse(pila.isEmpty());

        pila.pop();
        assertTrue(pila.isEmpty());
    }

    @Test
    void printStack() {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        assertEquals("3-->2-->1-->", pila.printStack());
    }
}