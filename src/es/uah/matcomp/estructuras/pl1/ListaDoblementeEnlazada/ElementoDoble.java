package es.uah.matcomp.estructuras.pl1.ListaDoblementeEnlazada;

class ElementoDoble<T> {
    T dato;
    ElementoDoble<T> siguiente;
    ElementoDoble<T> anterior;

    public ElementoDoble(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}

