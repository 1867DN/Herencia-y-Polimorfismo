package Ejercicio1;

abstract class Vuelo {
    String numeroVuelo;
    String origen;
    String destino;
    String fecha;

    public Vuelo(String numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();
}