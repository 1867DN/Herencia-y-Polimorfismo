package Ejercicio1;
import java.util.ArrayList;

class Reservas {
    ArrayList<Vuelo> vuelos;

    public Reservas() {
        vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Vuelo vuelo : vuelos) {
            precioTotal += vuelo.calcularPrecio();
        }
        return precioTotal;
    }

    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarInformacionVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println("Número de vuelo: " + vuelo.numeroVuelo);
            System.out.println("Origen: " + vuelo.origen);
            System.out.println("Destino: " + vuelo.destino);
            System.out.println("Fecha: " + vuelo.fecha);
            System.out.println("Precio: $" + vuelo.calcularPrecio());
            System.out.println();
        }
    }
}