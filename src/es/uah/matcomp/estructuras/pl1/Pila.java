package es.uah.matcomp.estructuras.pl1;

public class Pila<T> {
    private ListaSimplementeEnlazada<T> lista;

    public Pila() {
        this.lista = new ListaSimplementeEnlazada<>();
    }

    public void push(T elemento) {

        Elemento<T> nuevoElemento = new Elemento<>(elemento);
        nuevoElemento.next = lista.getHead();
        lista.setHead(nuevoElemento);
        lista.setNumElementos(lista.getNumElementos() + 1);
    }

    public T pop() {
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

    public String printStack() {
        return lista.printList();
    }
}