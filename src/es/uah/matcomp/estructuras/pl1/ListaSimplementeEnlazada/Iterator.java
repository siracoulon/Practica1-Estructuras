package es.uah.matcomp.estructuras.pl1.ListaSimplementeEnlazada;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void delete();
}