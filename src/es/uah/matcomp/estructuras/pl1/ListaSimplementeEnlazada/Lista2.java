package es.uah.matcomp.estructuras.pl1.ListaSimplementeEnlazada;

public interface Lista2<T> {
    boolean add(T elemento);
    boolean delete(T elemento);
    Iterator<T> getIterator();
    int getNumElementos();
}
