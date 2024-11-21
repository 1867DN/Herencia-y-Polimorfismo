package Ejercicio1;

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vueloRegular = new VueloRegular("REG123", "Buenos Aires", "Miami", "2024-12-15", 200, 300.00);
        VueloCharter vueloCharter = new VueloCharter("CHART456", "Buenos Aires", "Cancún", "2024-12-20", 12000.00);

        reservas.agregarVuelo(vueloRegular);
        reservas.agregarVuelo(vueloCharter);

        reservas.mostrarInformacionVuelos();

        double precioTotal = reservas.calcularPrecioTotal();
        System.out.println("Precio total de las reservas: $" + precioTotal);

        reservas.aplicarPromociones();
        System.out.println();
    }
}