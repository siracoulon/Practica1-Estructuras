package es.uah.matcomp.estructuras.pl1.Diccionario;

import es.uah.matcomp.estructuras.pl1.ListaBasica.Iterador;

public interface Diccionario <k,v> {
    public boolean add(k clave, v valor);
    public v delete(k clave);
    public Iterador<ElementoDiccionario<k,v>> getIterador();
    public boolean exists(k clave);
    public v get(k clave);
    public int getNumElementos();
}
