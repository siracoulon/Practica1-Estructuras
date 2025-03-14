package es.uah.matcomp.estructuras.pl1.ListaBasica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IteradorTest {

    @Test
    void testHasNext() {
        Integer[] elementos = {1, 2, 3};
        Iterador<Integer> iterador = new Iterador<>(elementos, elementos.length);
        assertTrue(iterador.hasNext());
        iterador.next();
        assertTrue(iterador.hasNext());
        iterador.next();
        assertTrue(iterador.hasNext());
        iterador.next();
        assertFalse(iterador.hasNext());
    }

    @Test
    void testNext() {
        Integer[] elementos = {1, 2, 3};
        Iterador<Integer> iterador = new Iterador<>(elementos, elementos.length);
        assertEquals(1, iterador.next());
        assertEquals(2, iterador.next());
        assertEquals(3, iterador.next());
        assertNull(iterador.next());
    }

    @Test
    void testNextWithoutElements() {
        Integer[] elementos = {};
        Iterador<Integer> iterador = new Iterador<>(elementos, elementos.length);
        assertNull(iterador.next());
    }
}