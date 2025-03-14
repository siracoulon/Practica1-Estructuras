package es.uah.matcomp.estructuras.pl1;

public interface Lista<T> {
    boolean add(T elemento);
    boolean delete(T elemento);
    Iterador<T> getIterador();
    int getNumElementos();
}
