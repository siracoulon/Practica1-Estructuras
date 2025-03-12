package es.uah.matcomp.estructuras.pl1;

public class ElementoDiccionario <k,v>{
    protected k clave;
    protected v valor;
    protected ElementoDiccionario<k,v> siguiente;
    protected ElementoDiccionario<k,v> anterior;
}
