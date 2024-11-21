package Ejercicio2;

public class SistemaDePagos {
    public static void main(String[] args) {
        Pagos sistemaPagos = new Pagos(5);

        MetodoPago tarjeta = new TarjetaCredito("Juan Pérez", "1234-5678-9876-5432", "12/25", "123");
        MetodoPago paypal = new PayPal("María López", "N/A", "maria@gmail.com");

        sistemaPagos.agregarMetodoPago(tarjeta);
        sistemaPagos.agregarMetodoPago(paypal);

        sistemaPagos.mostrarMetodosPago();

        sistemaPagos.realizarPago(0, 500.00);
        sistemaPagos.realizarPago(1, 200.00);

        sistemaPagos.cancelarPago(0);
        sistemaPagos.cancelarPago(1);
        System.out.println();
    }
}