package es.uah.matcomp.estructuras.pl1;

public class ElementoDiccionario <k,v>{
    protected k clave;
    protected v valor;
    protected ElementoDiccionario<k,v> siguiente;
    protected ElementoDiccionario<k,v> anterior;
    /** Constructor que inicializa un elemento con valor y clave como parámetros*/
    public ElementoDiccionario(k clave, v valor) {
        this.clave = clave;
        this.valor = valor;
        siguiente = null;
        anterior = null;
    }
    /** Getters y Setters*/
    public k getClave() {
        return clave;
    }
    public v getValor() {
        return valor;
    }
    public void setValor(v valor) {
        this.valor = valor;
    }
    public ElementoDiccionario<k,v> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(ElementoDiccionario<k,v> siguiente) {
        this.siguiente = siguiente;
    }
    public ElementoDiccionario<k,v> getAnterior() {
        return anterior;
    }
    public void setAnterior(ElementoDiccionario<k,v> anterior) {
        this.anterior = anterior;
    }

}
