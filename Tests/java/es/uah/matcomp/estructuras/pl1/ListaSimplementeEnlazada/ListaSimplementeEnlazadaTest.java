package es.uah.matcomp.estructuras.pl1.ListaSimplementeEnlazada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ListaSimplementeEnlazadaTest {

    @Test
    public void testAdd() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        assertTrue(lista.add(1));
        assertTrue(lista.add(2));
        assertEquals(2, lista.getNumElementos());
    }

    @Test
    public void testDelete() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        assertTrue(lista.delete(1));
        assertEquals(1, lista.getNumElementos());
        assertFalse(lista.delete(3)); // Elemento no existente
    }

    @Test
    public void testDeleteFirstElement() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        assertTrue(lista.delete(1));
        assertEquals(1, lista.getNumElementos());
        assertEquals("2-->", lista.printList());
    }

    @Test
    public void testDeleteLastElement() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        assertTrue(lista.delete(2));
        assertEquals(1, lista.getNumElementos());
        assertEquals("1-->", lista.printList());
    }


    @Test
    public void testGetIterador() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        Iterator<Integer> iterador = lista.getIterator();
        assertTrue(iterador.hasNext());
        assertEquals(1, iterador.next());
        assertTrue(iterador.hasNext());
        assertEquals(2, iterador.next());
        assertFalse(iterador.hasNext());
    }
    @Test
    public void testPrintList() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals("1-->2-->3-->", lista.printList());
    }
    @Test
    public void testGetHead() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        assertEquals(1, lista.getHead().data);
    }

    @Test
    public void testSetHead() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        Elemento<Integer> nuevoHead = new Elemento<>(10);
        lista.setHead(nuevoHead);
        assertEquals(10, lista.getHead().data);
    }

    @Test
    public void testGetNumElementos() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        assertEquals(2, lista.getNumElementos());
    }

    @Test
    public void testSetNumElementos() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.setNumElementos(5);
        assertEquals(5, lista.getNumElementos());
    }
}
