package es.uah.matcomp.estructuras.pl1.PilasYColas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ColaTest {

    @Test
    void enqueue() {
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        assertEquals("10-->20-->30-->", cola.printQueue());
    }

    @Test
    void dequeue() {
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        assertEquals(10, cola.dequeue());
        assertEquals("20-->30-->", cola.printQueue());
    }

    @Test
    void isEmpty() {
        Cola<String> cola = new Cola<>();
        assertTrue(cola.isEmpty());

        cola.enqueue("A");
        assertFalse(cola.isEmpty());

        cola.dequeue();
        assertTrue(cola.isEmpty());
    }

    @Test
    void printQueue() {
        Cola<String> cola = new Cola<>();
        cola.enqueue("A");
        cola.enqueue("B");
        cola.enqueue("C");

        assertEquals("A-->B-->C-->", cola.printQueue());
    }
}