package es.uah.matcomp.estructuras.pl1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrdenadorDiccionarioTest {

    private OrdenadorDiccionario<String, String> ordenadorAscendente;
    private OrdenadorDiccionario<String, String> ordenadorDescendente;

    @BeforeEach
    void setUp() {
        ordenadorAscendente = new OrdenadorDiccionario<>(true);  // Orden ascendente
        ordenadorDescendente = new OrdenadorDiccionario<>(false);  // Orden descendente
    }

    @Test
    void testConstructor() {
        assertTrue(ordenadorAscendente.isOrdenAscendente(), "El orden debería ser ascendente.");
        assertFalse(ordenadorDescendente.isOrdenAscendente(), "El orden debería ser descendente.");
    }

    @Test
    void testSetOrdenAscendente() {
        ordenadorAscendente.setOrdenAscendente(false);
        assertFalse(ordenadorAscendente.isOrdenAscendente(), "El orden debería haber cambiado a descendente.");

        ordenadorDescendente.setOrdenAscendente(true);
        assertTrue(ordenadorDescendente.isOrdenAscendente(), "El orden debería haber cambiado a ascendente.");
    }

    @Test
    void testIsOrdenAscendente() {
        assertTrue(ordenadorAscendente.isOrdenAscendente(), "El valor de 'ordenAscendente' debería ser true.");
        assertFalse(ordenadorDescendente.isOrdenAscendente(), "El valor de 'ordenAscendente' debería ser false.");
    }
}
