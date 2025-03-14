package es.uah.matcomp.estructuras.pl1.ListaDoblementeEnlazada;

class IteradorListaDoblementeEnlazada<T> implements IteradorDoble<T> {
    private ElementoDoble<T> actual;

    public IteradorListaDoblementeEnlazada(ElementoDoble<T> inicio) {
        this.actual = inicio;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        if (actual == null) {
            throw new IllegalStateException("No hay más elementos.");
        }
        T dato = actual.dato;
        actual = actual.siguiente;
        return dato;
    }

    @Override
    public boolean hasPrevious() {
        return actual != null && actual.anterior != null;
    }

    @Override
    public T previous() {
        if (actual == null || actual.anterior == null) {
            throw new IllegalStateException("No hay elementos anteriores.");
        }
        actual = actual.anterior;
        return actual.dato;
    }
}
