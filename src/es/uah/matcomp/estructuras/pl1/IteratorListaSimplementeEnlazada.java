package es.uah.matcomp.estructuras.pl1;

public class IteratorListaSimplementeEnlazada<T> implements Iterator<T> {
    private Elemento<T> current;
    private Elemento<T> previous;
    private ListaSimplementeEnlazada<T> lista;

    public IteratorListaSimplementeEnlazada(ListaSimplementeEnlazada<T> lista) {
        this.lista = lista;
        this.current = lista.getHead();
        this.previous = null;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if (current == null) {
            return null;
        }
        T data = current.data;
        previous = current;
        current = current.next;
        return data;
    }

    @Override
    public void delete() {
        if (current == null) {
            return; // Si no hay elemento actual, no hay nada que eliminar
        }

        if (previous == null) {
            // Eliminar el primer elemento
            lista.setHead(current.next);
        } else {
            // Eliminar un nodo intermedio o final
            previous.next = current.next;
        }

        lista.setNumElementos(lista.getNumElementos() - 1);

        // Avanzamos current
        //current = (previous == null) ? lista.getHead() : previous.next;

        if (previous == null) {
            current = lista.getHead();
        } else {
            current = previous;
        }

    }
}
