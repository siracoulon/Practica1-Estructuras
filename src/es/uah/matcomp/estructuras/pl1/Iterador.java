package es.uah.matcomp.estructuras.pl1;

public class Iterador<T> {
    protected T[] elementos; // Array de elementos
    protected int indiceActual; // Índice actual en el recorrido


    public Iterador(T[] elementos, int numElementos) {
        this.elementos = elementos; // Almacena el array de elementos
        this.indiceActual = 0; // Inicializa el índice actual
    }

    public boolean hasNext() {
        return indiceActual < elementos.length && elementos[indiceActual] != null;
    }
    public T next() {
        if (!hasNext()) {
            System.out.println("No hay elementos en el iterador");
            return null;
        }
        T actual = elementos[indiceActual];
        indiceActual++;
        return actual;
    }
}
