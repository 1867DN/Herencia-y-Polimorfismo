package Ejercicio1;

class VueloRegular extends Vuelo implements Promocionable {
    int numeroAsientos;
    double precioBasePorAsiento;

    // Constructor
    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion() {
        System.out.println("Aplicando promoción al vuelo regular...");
        double precioConDescuento = calcularPrecio() * 0.9;
        System.out.println("Precio con promoción: $" + precioConDescuento);
    }
}