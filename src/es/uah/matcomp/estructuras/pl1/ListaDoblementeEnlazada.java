package es.uah.matcomp.estructuras.pl1;

class ListaDoblementeEnlazada<T> implements ListaDoble<T> {
    private ElementoDoble<T> cabeza;
    private ElementoDoble<T> cola;
    private int tamanio;

    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }

    @Override
    public void agregar(T dato) {
        ElementoDoble<T> nuevo = new ElementoDoble<>(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        tamanio++;
    }

    @Override
    public void eliminar(T dato) {
        ElementoDoble<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior;
                }
                tamanio--;
                return;
            }
            actual = actual.siguiente;
        }
    }

    @Override
    public boolean contiene(T dato) {
        ElementoDoble<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public IteradorDoble<T> iterador() {
        return new IteradorListaDoblementeEnlazada<>(cabeza);
    }
}

