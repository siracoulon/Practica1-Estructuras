package es.uah.matcomp.estructuras.pl1;

public class Cola<T> {
    private ListaSimplementeEnlazada<T> lista;

    public Cola() {
        this.lista = new ListaSimplementeEnlazada<>();
    }

    public void enqueue(T elemento) {

        lista.add(elemento);
    }

    public T dequeue() {
        if (lista.getHead() == null) {
            return null;
        }

        T dato = lista.getHead().data;
        lista.setHead(lista.getHead().next);
        lista.setNumElementos(lista.getNumElementos() - 1);
        return dato;
    }

    public boolean isEmpty() {
        return lista.getNumElementos() == 0;
    }

    public String printQueue() {
        return lista.printList();
    }
}

