package es.uah.matcomp.estructuras.pl1.ListaSimplementeEnlazada;

public class ListaSimplementeEnlazada<T> implements Lista2<T> {
    private Elemento<T> head;
    private int numElementos;

    public ListaSimplementeEnlazada() {
        this.head = null;
        this.numElementos = 0;
    }

    public String printList(){
        Elemento<T> current = head;
        String out="";
        while(current != null){
            out = out + current.data + "-->";
            current = current.next;
        }
        return out;
    }

    @Override
    public boolean add(T elemento) {
        Elemento<T> nuevoElemento = new Elemento<>(elemento);
        if (head == null) {
            head = nuevoElemento;
        } else {
            Elemento<T> actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = nuevoElemento;
        }
        numElementos++;
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if (head == null) {
            return false;
        }

        if (head.data.equals(elemento)) {
            head = head.next;
            numElementos--;
            return true;
        }

        Elemento<T> actual = head;
        while (actual.next != null && !actual.next.data.equals(elemento)) {
            actual = actual.next;
        }

        if (actual.next != null) {
            actual.next = actual.next.next;
            numElementos--;
            return true;
        }

        return false;
    }

    @Override
    public Iterator<T> getIterator() {
        return new IteratorListaSimplementeEnlazada<>(this);
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }

    public Elemento<T> getHead() {
        return head;
    }

    public void setHead(Elemento<T> head) {
        this.head = head;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }
}