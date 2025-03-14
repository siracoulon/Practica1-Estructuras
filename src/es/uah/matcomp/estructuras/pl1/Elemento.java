package es.uah.matcomp.estructuras.pl1;

public class Elemento<T> {
    T data;
    Elemento<T> next;

    public Elemento(T data) {
        this.data = data;
        this.next = null;
    }
}
