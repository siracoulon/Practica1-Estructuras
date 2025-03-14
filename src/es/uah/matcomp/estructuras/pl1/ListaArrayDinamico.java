package es.uah.matcomp.estructuras.pl1;

public class ListaArrayDinamico<T> implements Lista<T> {
    protected T[] elementos;
    protected int numElementos;
    protected int tamanoMax;
    /** Constructor con capacidad por defecto*/
    public ListaArrayDinamico(int tamanoMax) {
        elementos = (T[]) new Object[tamanoMax];
        numElementos = 0;
        this.tamanoMax = tamanoMax;
    }
    @Override
    public boolean add(T elemento) {
        if (numElementos == tamanoMax) {
            T[] nuevoArray = (T[]) new Object[tamanoMax * 2];
            // Copio los elementos:
            for (int i = 0; i < tamanoMax; i++) {
                nuevoArray[i] = elementos[i];
            }
            // Reasigno el atributo elementos a mi nuevo array
            elementos = nuevoArray;
            tamanoMax *= 2;
        }
        // Añado el nuevo elemento a la ultima posicion disponible
        elementos[numElementos] = elemento;
        numElementos++;
        return true;
    }
    @Override
    public boolean delete(T elemento) {
        for (int i = 0; i < numElementos; i++) {
            // Busco el elemento
            if (elementos[i].equals(elemento)) {
                // Muevo los siguientes a la izquierda
                for (int j = i + 1; j < numElementos; j++) {
                    elementos[j - 1] = elementos[j];
                }
                //Vacío el último
                elementos[numElementos-1] = null;
                numElementos--;
                return true;
            }
        }
        // Si no lo encuentro
        return false;
    }
    @Override
    public Iterador<T> getIterador() {
        return new Iterador<T>(elementos, numElementos);
    }
    @Override
    public int getNumElementos() {
        return numElementos;
    }
}
