package es.uah.matcomp.estructuras.pl1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IteradorTest {

    private Iterador<String> iterador;

    @BeforeEach
    void setUp() {
        String[] elementos = {"a", "b", "c", "d"};
        iterador = new Iterador<>(elementos, 4);
    }

    @Test
    void testHasNext() {
        assertTrue(iterador.hasNext(), "Debe haber más elementos en el iterador.");

        // Avanzamos una posición
        iterador.next();
        assertTrue(iterador.hasNext(), "Debe haber más elementos en el iterador.");

        // Avanzamos hasta el final
        iterador.next();
        iterador.next();
        iterador.next();

        assertFalse(iterador.hasNext(), "No debe haber más elementos en el iterador.");
    }

    @Test
    void testNext() {
        // Probamos el método next
        assertEquals("a", iterador.next(), "El primer elemento debería ser 'a'.");
        assertEquals("b", iterador.next(), "El segundo elemento debería ser 'b'.");
        assertEquals("c", iterador.next(), "El tercer elemento debería ser 'c'.");
        assertEquals("d", iterador.next(), "El cuarto elemento debería ser 'd'.");

        // Intentamos llamar a next cuando no hay más elementos
        assertNull(iterador.next(), "No debe haber más elementos, por lo que next debería devolver null.");
    }

    @Test
    void testIteradorVacio() {
        // Creamos un iterador vacío
        Iterador<String> iteradorVacio = new Iterador<>(new String[]{}, 0);

        // Probamos el método hasNext() con el iterador vacío
        assertFalse(iteradorVacio.hasNext(), "Un iterador vacío no debe tener elementos.");
        assertNull(iteradorVacio.next(), "El método next no debe devolver nada si no hay elementos.");
    }
}
