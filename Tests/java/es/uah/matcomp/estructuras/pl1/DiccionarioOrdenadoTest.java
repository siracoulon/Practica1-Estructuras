package es.uah.matcomp.estructuras.pl1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiccionarioOrdenadoTest {

    private DiccionarioOrdenado<Integer, String> diccionario;

    @BeforeEach
    public void setUp() {
        diccionario = new DiccionarioOrdenado<>();
    }

    @Test
    public void testInsertarYObtener() {
        // Insertamos una clave y valor
        diccionario.insertar(1, "valor1");

        // Verificamos que el tamaño es 1
        assertEquals(1, diccionario.getTamano());

        // Verificamos que el valor insertado se pueda obtener correctamente
        assertEquals("valor1", diccionario.obtener(1));

        // Insertamos otro elemento
        diccionario.insertar(2, "valor2");

        // Verificamos que el tamaño es ahora 2
        assertEquals(2, diccionario.getTamano());

        // Verificamos que el valor insertado se pueda obtener
        assertEquals("valor2", diccionario.obtener(2));
    }

    @Test
    public void testInsertarClaveExistente() {
        // Insertamos una clave y valor
        diccionario.insertar(1, "valor1");

        // Insertamos la misma clave con un valor diferente
        diccionario.insertar(1, "nuevoValor1");

        // Verificamos que el tamaño sigue siendo 1 porque se reemplazó el valor
        assertEquals(1, diccionario.getTamano());

        // Verificamos que el valor se haya actualizado correctamente
        assertEquals("nuevoValor1", diccionario.obtener(1));
    }

    @Test
    public void testEliminar() {
        // Insertamos elementos
        diccionario.insertar(1, "valor1");
        diccionario.insertar(2, "valor2");
        diccionario.insertar(3, "valor3");

        // Verificamos el tamaño
        assertEquals(3, diccionario.getTamano());

        // Eliminamos el elemento con clave 2
        diccionario.eliminar(2);

        // Verificamos que el tamaño se haya reducido
        assertEquals(2, diccionario.getTamano());

        // Verificamos que el valor de la clave 2 ya no esté presente
        assertNull(diccionario.obtener(2));

        // Verificamos que las claves 1 y 3 siguen presentes
        assertEquals("valor1", diccionario.obtener(1));
        assertEquals("valor3", diccionario.obtener(3));
    }

    @Test
    public void testEliminarElementoQueNoExiste() {
        // Insertamos elementos
        diccionario.insertar(1, "valor1");

        // Intentamos eliminar una clave que no existe
        diccionario.eliminar(2);

        // Verificamos que el tamaño sigue siendo 1
        assertEquals(1, diccionario.getTamano());

        // Verificamos que la clave 1 sigue presente
        assertEquals("valor1", diccionario.obtener(1));
    }

    @Test
    public void testInsertarVariosElementos() {
        // Insertamos varias claves en desorden
        diccionario.insertar(5, "valor5");
        diccionario.insertar(3, "valor3");
        diccionario.insertar(7, "valor7");
        diccionario.insertar(2, "valor2");

        // Verificamos que el tamaño es correcto
        assertEquals(4, diccionario.getTamano());

        // Verificamos que los valores están insertados en el orden correcto
        assertEquals("valor2", diccionario.obtener(2));
        assertEquals("valor3", diccionario.obtener(3));
        assertEquals("valor5", diccionario.obtener(5));
        assertEquals("valor7", diccionario.obtener(7));
    }

    @Test
    public void testEliminarPrimeroYUltimo() {
        // Insertamos elementos
        diccionario.insertar(1, "valor1");
        diccionario.insertar(2, "valor2");
        diccionario.insertar(3, "valor3");

        // Verificamos el tamaño
        assertEquals(3, diccionario.getTamano());

        // Eliminamos el primer elemento (cabeza)
        diccionario.eliminar(1);
        assertEquals(2, diccionario.getTamano());
        assertNull(diccionario.obtener(1)); // Verificamos que no existe

        // Eliminamos el último elemento (cola)
        diccionario.eliminar(3);
        assertEquals(1, diccionario.getTamano());
        assertNull(diccionario.obtener(3)); // Verificamos que no existe
    }
}
