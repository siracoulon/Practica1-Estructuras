package es.uah.matcomp.estructuras.pl1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ListaDoblementeEnlazadaTest {

    @Test
    void testAgregar() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.agregar(1);
        lista.agregar(2);
        assertEquals(2, lista.tamanio());
        assertTrue(lista.contiene(1));
        assertTrue(lista.contiene(2));
    }

    @Test
    void testEliminar() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.agregar(1);
        lista.agregar(2);
        lista.eliminar(1);
        assertEquals(1, lista.tamanio());
        assertFalse(lista.contiene(1));
        assertTrue(lista.contiene(2));
    }

    @Test
    void testContiene() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.agregar(1);
        assertTrue(lista.contiene(1));
        assertFalse(lista.contiene(2));
    }

    @Test
    void testTamanio() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        assertEquals(0, lista.tamanio());
        lista.agregar(1);
        assertEquals(1, lista.tamanio());
    }

    @Test
    void testIterador() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.agregar(1);
        lista.agregar(2);
        IteradorDoble<Integer> iterador = lista.iterador();
        assertTrue(iterador.hasNext());
        assertEquals(1, iterador.next());
        assertTrue(iterador.hasNext());
        assertEquals(2, iterador.next());
        assertFalse(iterador.hasNext());
    }
}
