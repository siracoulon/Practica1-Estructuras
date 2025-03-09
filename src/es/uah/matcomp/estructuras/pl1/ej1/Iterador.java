package es.uah.matcomp.estructuras.pl1.ej1;

public class Iterador<T> {
    private T[] elementos; // Array de elementos
    private int indiceActual; // Índice actual en el recorrido


    public Iterador(T[] elementos, int numElementos) {
        this.elementos = elementos; // Almacena el array de elementos
        this.indiceActual = 0; // Inicializa el índice actual
    }

    public boolean hasNext() {
        return indiceActual != 0;
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
