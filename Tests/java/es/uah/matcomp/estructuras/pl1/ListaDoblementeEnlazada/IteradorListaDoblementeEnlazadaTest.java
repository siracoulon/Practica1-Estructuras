package es.uah.matcomp.estructuras.pl1.ListaDoblementeEnlazada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorListaDoblementeEnlazadaTest {

    @Test
    void testHasNext() {
        ElementoDoble<Integer> elemento1 = new ElementoDoble<>(1);
        ElementoDoble<Integer> elemento2 = new ElementoDoble<>(2);
        elemento1.siguiente = elemento2;
        IteradorListaDoblementeEnlazada<Integer> iterador = new IteradorListaDoblementeEnlazada<>(elemento1);

        assertTrue(iterador.hasNext());
        iterador.next();
        assertTrue(iterador.hasNext());
        iterador.next();
        assertFalse(iterador.hasNext());
    }

    @Test
    void testNext() {
        ElementoDoble<Integer> elemento1 = new ElementoDoble<>(1);
        ElementoDoble<Integer> elemento2 = new ElementoDoble<>(2);
        elemento1.siguiente = elemento2;
        IteradorListaDoblementeEnlazada<Integer> iterador = new IteradorListaDoblementeEnlazada<>(elemento1);

        assertEquals(1, iterador.next());
        assertEquals(2, iterador.next());
        assertThrows(IllegalStateException.class, iterador::next);
    }

    @Test
    void testHasPrevious() {
        ElementoDoble<Integer> elemento1 = new ElementoDoble<>(1);
        ElementoDoble<Integer> elemento2 = new ElementoDoble<>(2);
        elemento1.siguiente = elemento2;
        elemento2.anterior = elemento1;
        IteradorListaDoblementeEnlazada<Integer> iterador = new IteradorListaDoblementeEnlazada<>(elemento2);

        assertTrue(iterador.hasPrevious());
        iterador.previous();
        assertFalse(iterador.hasPrevious());
    }

    @Test
    void testPrevious() {
        ElementoDoble<Integer> elemento1 = new ElementoDoble<>(1);
        ElementoDoble<Integer> elemento2 = new ElementoDoble<>(2);
        elemento1.siguiente = elemento2;
        elemento2.anterior = elemento1;
        IteradorListaDoblementeEnlazada<Integer> iterador = new IteradorListaDoblementeEnlazada<>(elemento2);

        assertEquals(1, iterador.previous());

        assertThrows(IllegalStateException.class, iterador::previous);
    }
}