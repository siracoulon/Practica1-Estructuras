package es.uah.matcomp.estructuras.pl1.Diccionario;

public class DiccionarioBasico <k,v>{
    protected ElementoDiccionario<k,v> cabeza;
    protected ElementoDiccionario<k,v> cola;
    protected int tamano;

    public DiccionarioBasico() {
        cabeza = null;
        cola = null;
        tamano = 0;
    }
    public void add(k clave, v valor) {
        ElementoDiccionario<k,v> actual = cabeza;
        while (actual != null) {
            if (actual.getClave().equals(clave)) {
                actual.setValor(valor); // Si la clave ya existe actualiza el valor
                return;
            }
            actual = actual.getSiguiente();
        }
        ElementoDiccionario<k, v> nuevo = new ElementoDiccionario<>(clave, valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tamano++;
    }
    public v getValue(k clave) {
        ElementoDiccionario<k, v> actual = cabeza;
        while (actual != null) {
            if (actual.getClave().equals(clave)) {
                return actual.getValor();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
    public void delete(k clave) {
        ElementoDiccionario<k, v> actual = cabeza;
        while (actual != null) {
            if (actual.getClave().equals(clave)) {
                if (actual.getAnterior() != null) {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                } else {
                    cabeza = actual.getSiguiente();
                }

                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                } else {
                    cola = actual.getAnterior();
                }

                tamano--;
                return;
            }
            actual = actual.getSiguiente();
        }
    }
    public int getTamano() {
        return tamano;
    }
}
