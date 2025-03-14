package es.uah.matcomp.estructuras.pl1.Diccionario;

public class IteradorDiccionario<k,v> implements Iterator<ElementoDiccionario<k,v>> {
    private ElementoDiccionario<k,v> actual;
    private ElementoDiccionario<k,v> previous;
    private DiccionarioBasico<k,v> diccionario;

    public IteradorDiccionario(DiccionarioBasico<k,v> diccionario) {
        this.diccionario = diccionario;
        this.actual = diccionario.cabeza;
        this.previous = null;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public ElementoDiccionario<k, v> next() {
        if (!hasNext()) {
            return null; // En lugar de lanzar una excepción, devolvemos null
        }
        ElementoDiccionario<k, v> temp = actual;
        previous = actual;
        actual = actual.getSiguiente();
        return temp;
    }

    @Override
    public void delete() {
        if (previous == null) {
            return; // No hay nada que eliminar si delete() se llama antes de next()
        }

        // Caso especial: eliminar el primer elemento
        if (previous == diccionario.cabeza) {
            diccionario.cabeza = actual;
            if (actual != null) {
                actual.setAnterior(null);
            }
        } else {
            previous.getAnterior().setSiguiente(actual);
            if (actual != null) {
                actual.setAnterior(previous.getAnterior());
            }
        }

        diccionario.tamano--; // Reducimos el tamaño
        previous = null; // Evitamos eliminar dos veces seguidas el mismo elemento
    }

}
