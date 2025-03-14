package es.uah.matcomp.estructuras.pl1.ListaDoblementeEnlazada;

interface IteradorDoble<T> {
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
}