package Logica;

public abstract class casilla {
    protected int estado;
    protected boolean esBomba;

    public abstract void descubrir();
    public abstract void cambioEstado();
}
