package es.uah.matcomp.estructuras.pl1.ListaDoblementeEnlazada;

interface ListaDoble<T> {
    void agregar(T dato);
    void eliminar(T dato);
    boolean contiene(T dato);
    int tamanio();
    IteradorDoble<T> iterador();
}