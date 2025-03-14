package es.uah.matcomp.estructuras.pl1;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void delete();
}