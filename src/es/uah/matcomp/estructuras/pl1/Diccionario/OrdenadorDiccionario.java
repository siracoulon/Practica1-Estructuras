package es.uah.matcomp.estructuras.pl1.Diccionario;

public class OrdenadorDiccionario<K, V> {
    private boolean ordenAscendente;

    public OrdenadorDiccionario(boolean ordenAscendente) {
        this.ordenAscendente = ordenAscendente;
    }

    public boolean isOrdenAscendente() {
        return ordenAscendente;
    }

    public void setOrdenAscendente(boolean ordenAscendente) {
        this.ordenAscendente = ordenAscendente;
    }
}
