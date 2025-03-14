package es.uah.matcomp.estructuras.pl1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaArrayDinamicoTest {

    private ListaArrayDinamico<String> lista;

    @BeforeEach
    void setUp() {
        lista = new ListaArrayDinamico<>(10);  // Tamaño máximo inicial de 10
    }

    @Test
    void testAdd() {
        assertTrue(lista.add("Elemento 1"), "Debería agregar el primer elemento correctamente.");
        assertTrue(lista.add("Elemento 2"), "Debería agregar el segundo elemento correctamente.");
        assertEquals(2, lista.getNumElementos(), "El número de elementos debería ser 2.");

        // Añadiendo más elementos para verificar el crecimiento dinámico
        for (int i = 3; i <= 20; i++) {
            lista.add("Elemento " + i);
        }

        assertEquals(20, lista.getNumElementos(), "El número de elementos debería ser 20.");
    }

    @Test
    void testDelete() {
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // Verificamos que se puede eliminar un elemento existente
        assertTrue(lista.delete("Elemento 2"), "Debería eliminar el elemento 'Elemento 2'.");
        assertEquals(2, lista.getNumElementos(), "El número de elementos debería ser 2 después de la eliminación.");

        // Verificamos que al eliminar el último, la lista funcione correctamente
        assertTrue(lista.delete("Elemento 3"), "Debería eliminar el elemento 'Elemento 3'.");
        assertEquals(1, lista.getNumElementos(), "El número de elementos debería ser 1 después de la eliminación.");

        // Intentamos eliminar un elemento que no existe
        assertFalse(lista.delete("Elemento 4"), "No debería poder eliminar un elemento que no existe.");
    }

    @Test
    void testGetIterador() {
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        Iterador<String> iterador = lista.getIterador();

        assertTrue(iterador.hasNext(), "Debería haber elementos en el iterador.");
        assertEquals("Elemento 1", iterador.next(), "El primer elemento debería ser 'Elemento 1'.");
        assertEquals("Elemento 2", iterador.next(), "El segundo elemento debería ser 'Elemento 2'.");
        assertEquals("Elemento 3", iterador.next(), "El tercer elemento debería ser 'Elemento 3'.");
        assertFalse(iterador.hasNext(), "No debería haber más elementos en el iterador.");
    }

    @Test
    void testGetNumElementos() {
        assertEquals(0, lista.getNumElementos(), "El número de elementos debería ser 0 al principio.");

        lista.add("Elemento 1");
        lista.add("Elemento 2");

        assertEquals(2, lista.getNumElementos(), "El número de elementos debería ser 2 después de agregar elementos.");
    }
}
