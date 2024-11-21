package Ejercicio2;

public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito...");
        System.out.println("Pago realizado exitosamente.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("El pago con Tarjeta de Crédito ha sido cancelado.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de Expiración: " + fechaExpiracion);
        System.out.println("Código de Seguridad: " + codigoSeguridad);
    }
}