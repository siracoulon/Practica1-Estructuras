package es.uah.matcomp.estructuras.pl1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElementoDiccionarioTest {
    private ElementoDiccionario<String, Integer> elemento;

    @BeforeEach
    void setUp() {
        elemento = new ElementoDiccionario<>("clave1", 10);
    }

    @Test
    void testGetClave() {
        assertEquals("clave1", elemento.getClave());
    }

    @Test
    void testGetValor() {
        assertEquals(10, elemento.getValor());
    }

    @Test
    void testSetValor() {
        elemento.setValor(20);
        assertEquals(20, elemento.getValor());
    }

    @Test
    void testSetSiguienteYAnterior() {
        ElementoDiccionario<String, Integer> otroElemento = new ElementoDiccionario<>("clave2", 30);
        elemento.setSiguiente(otroElemento);
        otroElemento.setAnterior(elemento);

        assertEquals(otroElemento, elemento.getSiguiente());
        assertEquals(elemento, otroElemento.getAnterior());
    }
}