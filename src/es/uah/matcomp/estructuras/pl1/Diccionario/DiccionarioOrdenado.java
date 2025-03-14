package es.uah.matcomp.estructuras.pl1.Diccionario;

public class DiccionarioOrdenado<K extends Comparable<K>, V> {
    private ElementoDiccionario<K, V> cabeza;
    private ElementoDiccionario<K, V> cola;
    private int tamano;

    public DiccionarioOrdenado() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public void insertar(K clave, V valor) {
        ElementoDiccionario<K, V> nuevo = new ElementoDiccionario<>(clave, valor);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else if (cabeza.getClave().compareTo(clave) > 0) {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        } else {
            ElementoDiccionario<K, V> actual = cabeza;
            while (actual.getSiguiente() != null && actual.getSiguiente().getClave().compareTo(clave) < 0) {
                actual = actual.getSiguiente();
            }

            if (actual.getSiguiente() != null && actual.getSiguiente().getClave().equals(clave)) {
                actual.getSiguiente().setValor(valor);
                return;
            }

            nuevo.setSiguiente(actual.getSiguiente());
            nuevo.setAnterior(actual);

            if (actual.getSiguiente() != null) {
                actual.getSiguiente().setAnterior(nuevo);
            } else {
                cola = nuevo;
            }

            actual.setSiguiente(nuevo);
        }
        tamano++;
    }

    public V obtener(K clave) {
        ElementoDiccionario<K, V> actual = cabeza;
        while (actual != null) {
            if (actual.getClave().equals(clave)) {
                return actual.getValor();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public void eliminar(K clave) {
        ElementoDiccionario<K, V> actual = cabeza;
        while (actual != null) {
            if (actual.getClave().equals(clave)) {
                if (actual.getAnterior() != null) {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                } else {
                    cabeza = actual.getSiguiente();
                }

                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                } else {
                    cola = actual.getAnterior();
                }

                tamano--;
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    public int getTamano() {
        return tamano;
    }
}
