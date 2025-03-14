package es.uah.matcomp.estructuras.pl1.Diccionario;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void delete();
}
