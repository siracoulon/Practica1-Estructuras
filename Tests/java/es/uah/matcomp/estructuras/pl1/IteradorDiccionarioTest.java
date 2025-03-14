package es.uah.matcomp.estructuras.pl1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class IteradorDiccionarioTest {
    private DiccionarioBasico<String, Integer> diccionario;
    private IteradorDiccionario<String, Integer> iterador;

    @BeforeEach
    void setUp() {
        diccionario = new DiccionarioBasico<>();
        diccionario.add("uno", 1);
        diccionario.add("dos", 2);
        diccionario.add("tres", 3);
        iterador = new IteradorDiccionario<>(diccionario);
    }

    @Test
    void testHasNext() {
        assertTrue(iterador.hasNext());
        iterador.next();
        iterador.next();
        iterador.next();
        assertFalse(iterador.hasNext());
    }

    @Test
    void testNext() {
        assertEquals("uno", iterador.next().getClave());
        assertEquals("dos", iterador.next().getClave());
        assertEquals("tres", iterador.next().getClave());
        assertNull(iterador.next());
    }

    @Test
    void testDelete() {
        iterador.next(); // "uno"
        iterador.delete();
        assertNull(diccionario.getValue("uno"));
        assertEquals(2, diccionario.getTamano());
    }
}
