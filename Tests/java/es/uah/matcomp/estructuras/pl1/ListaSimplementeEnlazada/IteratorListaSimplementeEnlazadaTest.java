package es.uah.matcomp.estructuras.pl1.ListaSimplementeEnlazada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorListaSimplementeEnlazadaTest {

    @Test
    public void testHasNext() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        Iterator<Integer> iterador = lista.getIterator();
        assertTrue(iterador.hasNext());
        iterador.next();
        assertTrue(iterador.hasNext());
        iterador.next();
        assertFalse(iterador.hasNext());
    }

    @Test
    public void testNext() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        Iterator<Integer> iterador = lista.getIterator();
        assertEquals(1, iterador.next());
        assertEquals(2, iterador.next());
        assertNull(iterador.next()); // No hay más elementos
    }

    @Test
    public void testDelete() {
        ListaSimplementeEnlazada<Integer> lista = new ListaSimplementeEnlazada<>();
        lista.add(1);
        lista.add(2);
        System.out.println("Lista:" + lista.printList());
        Iterator<Integer> iterador = lista.getIterator();

        //iterador.next(); // Avanzamos al primer elemento
        iterador.delete(); // Eliminamos el primer elemento
        assertEquals(1, lista.getNumElementos());
        System.out.println("Lista:" + lista.printList());
        assertEquals(2, iterador.next()); // El siguiente elemento ahora es el segundo

        // Verificamos que el primer elemento ha sido eliminado
        Iterator<Integer> nuevoIterador = lista.getIterator();
        assertEquals(2, nuevoIterador.next());
        assertFalse(nuevoIterador.hasNext());
    }
}