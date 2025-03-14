package es.uah.matcomp.estructuras.pl1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiccionarioBasicoTest {

    private DiccionarioBasico<String, Integer> diccionario;

    @BeforeEach
    void setUp() {
        diccionario = new DiccionarioBasico<>();
    }

    @Test
    void testAdd() {
        diccionario.add("clave1", 10);
        diccionario.add("clave2", 20);

        assertEquals(2, diccionario.getTamano(), "El tamaño debe ser 2 después de agregar dos elementos.");
        assertEquals(10, diccionario.getValue("clave1"), "El valor de 'clave1' debe ser 10.");
        assertEquals(20, diccionario.getValue("clave2"), "El valor de 'clave2' debe ser 20.");
    }

    @Test
    void testUpdateValue() {
        diccionario.add("clave1", 10);
        diccionario.add("clave1", 30);

        assertEquals(1, diccionario.getTamano(), "El tamaño debe ser 1 después de actualizar un elemento.");
        assertEquals(30, diccionario.getValue("clave1"), "El valor de 'clave1' debe haber sido actualizado a 30.");
    }

    @Test
    void testGetValue() {
        diccionario.add("clave1", 10);
        diccionario.add("clave2", 20);

        assertEquals(10, diccionario.getValue("clave1"), "El valor de 'clave1' debe ser 10.");
        assertNull(diccionario.getValue("clave3"), "El valor de una clave no existente debe ser null.");
    }

    @Test
    void testDelete() {
        diccionario.add("clave1", 10);
        diccionario.add("clave2", 20);
        diccionario.delete("clave1");

        assertEquals(1, diccionario.getTamano(), "El tamaño debe ser 1 después de eliminar un elemento.");
        assertNull(diccionario.getValue("clave1"), "El valor de 'clave1' debe ser null después de eliminarlo.");
        assertEquals(20, diccionario.getValue("clave2"), "El valor de 'clave2' debe seguir siendo 20.");
    }

    @Test
    void testDeleteNonExistentKey() {
        diccionario.add("clave1", 10);
        diccionario.delete("clave2");

        assertEquals(1, diccionario.getTamano(), "El tamaño debe seguir siendo 1 si intentamos eliminar una clave no existente.");
    }

    @Test
    void testGetTamano() {
        assertEquals(0, diccionario.getTamano(), "El tamaño inicial debe ser 0.");
        diccionario.add("clave1", 10);
        diccionario.add("clave2", 20);
        assertEquals(2, diccionario.getTamano(), "El tamaño debe ser 2 después de agregar dos elementos.");
    }
}
