package Ejercicio1;

class VueloCharter extends Vuelo implements Promocionable {
    double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        System.out.println("Aplicando promoción al vuelo charter...");
        double precioConDescuento = calcularPrecio() * 0.85;
        System.out.println("Precio con promoción: $" + precioConDescuento);
    }
}