package Logica;

public class libre extends casilla{
    private int minasCercanas;
    public libre(){
        esBomba=false;
        estado=0;
        minasCercanas=contarAdyacentes();
    }
    public int contarAdyacentes(){
        return 0;
    }
    @Override
    public void descubrir() {

    }
    public void cambioEstado() {

    }
}
